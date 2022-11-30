package com.nkjy.videoplayerv2;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView, videoView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.video_view);
        videoView2 = findViewById(R.id.video_view_2);

        // From Local Storage
        videoView.setVideoPath("android.resource://"+ getPackageName() + "/" + R.raw.wishfart);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        // From Internet URLs
        Uri uri = Uri.parse("https://static.videezy.com/system/resources/previews/000/015/304/original/glass_with_soda_and_ice_01.mp4.mp4");
        videoView2.setVideoURI(uri);

        MediaController mediaController1 = new MediaController(this);
        mediaController1.setAnchorView(videoView2);
        videoView2.setMediaController(mediaController1);
        videoView2.start();

    }
}