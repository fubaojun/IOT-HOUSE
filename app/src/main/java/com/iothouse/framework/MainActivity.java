package com.iothouse.framework;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.fuzi.bj.iothouse.R;
import com.iothouse.framework.base.api.EspBaseApiUtil;
import com.iothouse.framework.base.net.udp.UdpBroadcastUtil;
import com.iothouse.framework.device.IEspDevice;
import com.iothouse.framework.type.net.IOTAddress;
import com.iothouse.framework.ui.view.DeviceAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {

    protected List<IEspDevice> mAllDeviceList;
    private DeviceAdapter mDeviceAdapter;
    protected ListView mDeviceListView;
    private Set<String> mNewDevicesSet;
    private int i = 1;

    List<IOTAddress> mRootDeviceList = null;
    List<String> mRootDeviceNameList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mDeviceListView = (ListView)findViewById(R.id.devices_list);
        mAllDeviceList = new Vector<IEspDevice>();
//        updateDeviceList();
        mDeviceAdapter = new EspDeviceAdapter(this, mAllDeviceList);
//        mDeviceListView.setAdapter(mDeviceAdapter);
//        mDeviceListView.setOnRefreshListener(this);
//        mDeviceListView.setOnItemClickListener(this);
//        mDeviceListView.getRefreshableView().setOnItemLongClickListener(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EspBaseApiUtil.submit(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        mRootDeviceList = UdpBroadcastUtil.discoverIOTDevices();
                    }
                });
                //这样不行，在UDP线程还没有完成的时候，界面已经刷新了，这一定获取不到正确的值。
                //第一次点击的时候，还没刷出来，等一段时间第二次点击刷新的时候 会把上一次的结果
                //更新出来，说明 UDP是可以获取到的。 下一步确认线程间是如何传递这个数据的。
//                try {
//                    sleep(3000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                mRootDeviceNameList.clear();
                mRootDeviceNameList.add("empty1--"+i++);//for test listview
                mRootDeviceNameList.add("empty2--"+i);
                if (mRootDeviceList != null) {
                    for (IOTAddress iotAddress : mRootDeviceList) {
                        mRootDeviceNameList.add(iotAddress.toString());
                    }
                }
                ArrayAdapter<String> adapter;
                adapter = new ArrayAdapter<String>(
                        MainActivity.this, android.R.layout.simple_list_item_1, mRootDeviceNameList
                );
                mDeviceListView.setAdapter(adapter);

//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });
    }

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

    private class EspDeviceAdapter extends DeviceAdapter
    {

        public EspDeviceAdapter(Activity activity, List<IEspDevice> list)
        {
            super(activity, list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent)
        {
            convertView = super.getView(position, convertView, parent);

            IEspDevice device = (IEspDevice)convertView.getTag();

            TextView contentTV = (TextView)convertView.findViewById(R.id.content_text);
            contentTV.setTextColor(Color.RED);
            contentTV.setText("NEW");
            boolean newActivated = mNewDevicesSet.contains(device.getKey());
            contentTV.setVisibility(newActivated ? View.VISIBLE : View.GONE);

            return convertView;
        }

    }


}

