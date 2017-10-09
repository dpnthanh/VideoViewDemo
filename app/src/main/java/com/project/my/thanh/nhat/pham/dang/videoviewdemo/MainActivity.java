package com.project.my.thanh.nhat.pham.dang.videoviewdemo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView vvClip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vvClip = (VideoView) findViewById(R.id.VideoView_Clip_MainActivity);
        vvClip.setMediaController(new MediaController(MainActivity.this));

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video_tinhte);
        vvClip.setVideoURI(uri);
        vvClip.start();

    }
}
