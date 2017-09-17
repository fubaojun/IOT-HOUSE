package com.iothouse.framework;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.fuzi.bj.iothouse.R;
import com.iothouse.framework.base.api.EspBaseApiUtil;
import com.iothouse.framework.base.net.udp.UdpBroadcastUtil;
import com.iothouse.framework.type.net.IOTAddress;
import com.iothouse.thirdparty.mjpeg_viewer.MjpegViewActivity;

import java.util.ArrayList;
import java.util.List;

import static com.iothouse.framework.type.device.EspDeviceType.IOT_CAMERA;

public class MainActivity extends AppCompatActivity {
    //MSG handler CODE
    private static final int MSG_CLEAR_DEVICE_LIST = 1000;
    private static final int MSG_UPDATE_DEVICE_LIST = 1001;

    protected ListView mDeviceListView;

    List<IOTAddress> mRootDeviceList = null;
    List<String> mRootDeviceNameList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mDeviceListView = (ListView)findViewById(R.id.devices_list);
        mDeviceListView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name = mRootDeviceNameList.get(position).toString();
                if (name.contains(IOT_CAMERA.toString())) {
                    IOTAddress iotAddress = mRootDeviceList.get(position);
                    Intent intent = new Intent();
                    //设置Intent的class属性，跳转到SecondActivity
                    intent.setClass(MainActivity.this, MjpegViewActivity.class);
                    //为intent添加额外的信息
                    intent.putExtra("MAC_ADDR", iotAddress.getBSSID());
                    intent.putExtra("IP_ADDR", ""+iotAddress.getInetAddress().getHostAddress());
                    intent.putExtra("PORT", "80");
                    //启动Activity
                    startActivity(intent);
                }
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 更新listview UI线程
                if (mRootDeviceList != null) {
                    mRootDeviceList.clear();
                }
                Message msg = Message.obtain();
                msg.arg1 = MSG_CLEAR_DEVICE_LIST;
                updateListHandler.sendMessage(msg);
                Message msg1 = Message.obtain();
                msg1.arg1 = MSG_UPDATE_DEVICE_LIST;
                updateListHandler.sendMessageDelayed(msg1, 3000);
                EspBaseApiUtil.submit(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        mRootDeviceList = UdpBroadcastUtil.discoverIOTDevices();
                    }
                });
                //提示等待3秒。
                Snackbar.make(view, getString(R.string.search_prompt), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private Handler updateListHandler = new Handler()
    {
        @Override
        public void handleMessage(Message msg) {
            //TODO
            ArrayAdapter<String> adapter = null;
            switch (msg.arg1){
                case MSG_CLEAR_DEVICE_LIST:
                    //prepare the list data
                    mRootDeviceNameList.clear();
                    mRootDeviceNameList.add("Device list cleared!");
                    adapter = new ArrayAdapter<String>(
                            MainActivity.this, android.R.layout.simple_list_item_1, mRootDeviceNameList
                    );
                    break;
                case MSG_UPDATE_DEVICE_LIST:
                    //prepare the list data
                    mRootDeviceNameList.clear();
                    if (mRootDeviceList != null) {
                        for (IOTAddress iotAddress : mRootDeviceList) {
                            String str = ""+iotAddress.getDeviceTypeEnum()+" "+iotAddress.getBSSID()
                                    +" "+iotAddress.getInetAddress().getHostAddress();
                            mRootDeviceNameList.add(str);
                        }
                    }
                    mRootDeviceNameList.add("Device list Updated Already!");//for test listview add after the REAL device
                    adapter = new ArrayAdapter<String>(
                            MainActivity.this, android.R.layout.simple_list_item_1, mRootDeviceNameList
                    );
                    break;
                default:
                        break;
            }
            mDeviceListView.setAdapter(adapter);
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}

