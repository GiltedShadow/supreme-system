package com.example.introandroidapp;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SongActivity extends AppCompatActivity {
    private VideoView vidView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_song);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        vidView = (VideoView) findViewById(R.id.vidView);
        vidView.setMediaController(new MediaController(this));// add media controller
        Uri video = Uri.parse("android.resource://" +getPackageName()+"/"+R.raw.scottjoplinragtimedance);
        vidView.setVideoURI(video);
        vidView.setZOrderOnTop(true); // dont merge with other widgets
    }
    protected void onResume(){
        super.onResume();
        vidView.start();
    }

    protected void onPause(){
        vidView.stopPlayback();
        super.onPause();
    }
}