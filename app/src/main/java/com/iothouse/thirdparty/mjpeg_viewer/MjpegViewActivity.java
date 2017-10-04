
package com.iothouse.thirdparty.mjpeg_viewer;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.iothouse.R;
import com.iothouse.thirdparty.mjpeg_viewer.rtrk.mjpeg.MjpegUtils;
import com.iothouse.thirdparty.mjpeg_viewer.rtrk.mjpeg.MjpegView;

public class MjpegViewActivity extends Activity {
    private MjpegView mMjpegView = null;
    private EditText mUrlText = null;
    private static final String SAMPLE_URL = "http://webcam.st-malo.com/axis-cgi/mjpg/video.cgi?resolution=352x288";

    private static final String MAC_ADDR = "MAC_ADDR";
    private static final String IP_ADDR = "IP_ADDR";
    private static final String PORT = "PORT";

    private String URL = "http://192.168.1.1:8888";
    private boolean startPlayFlag = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //获得Intent
        Intent intent = this.getIntent();
        //从Intent获得额外信息，设置为TextView的文本
        String macstr = intent.getStringExtra(MAC_ADDR);
        String ipstr = intent.getStringExtra(IP_ADDR);
        String portstr = intent.getStringExtra(PORT);
        URL = "http://"+ipstr+":"+portstr;
        setContentView(R.layout.activity_mjpegview);

        mMjpegView = (MjpegView) findViewById(R.id.mjpegView);

        // Set the default sample url
        mUrlText = (EditText) findViewById(R.id.url);
        mUrlText.setText(URL);

        final Button btnPlay = (Button) findViewById(R.id.button1);
        btnPlay.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (startPlayFlag == false){
                    startPlayFlag = true;
                    btnPlay.setText(R.string.stop);
                    onPlay();
                }
                else  {
                    onStopPlayback();
                    btnPlay.setText(R.string.play);
                    startPlayFlag = false;
                }
            }
        });
    }
    //开始播放
    private void onPlay() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                mMjpegView.play(MjpegUtils
                        .getHTTPInputStream(mUrlText.getText().toString()));
            }
        }).start();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }
    //停止播放
    private void onStopPlayback() {
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        mMjpegView.stopPlayback();

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
//        if (startPlayFlag == true){
//            onPlay();
//        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        //onPlay();
    }

    @Override
    protected void onPause() {
        super.onPause();
        onStopPlayback();
    }
}
