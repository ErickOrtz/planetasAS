package com.example.planetas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class VideoActivityVenus extends AppCompatActivity {

    private VideoView videoView;
    private Button btnPlay, btnPause, btnStop, btnNext;


    private TextView tituloTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

       // nameVideo = findViewById(R.id.videoName);

        ImageView imagenPlaneta = findViewById(R.id.imagePlaneta);

        imagenPlaneta.setImageResource(R.drawable.venus);

        tituloTv = findViewById(R.id.tvTitle);
        tituloTv.setText("Venus");

        ImageButton imageButtonBack = findViewById(R.id.btnBack);
        imageButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VideoActivityVenus.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        videoView = findViewById(R.id.videoView);
        btnPlay = findViewById(R.id.btnPlay);
        btnPause = findViewById(R.id.btnPause);
        btnStop = findViewById(R.id.btnStop);
        btnNext = findViewById(R.id.btnNext);

        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.venusv);
        videoView.setVideoURI(videoUri);

        btnPlay.setOnClickListener(v -> {
            videoView.start();
        });

        btnPause.setOnClickListener(v -> {
            if (videoView.isPlaying()) {
                videoView.pause();
            }
        });

        btnStop.setOnClickListener(v -> {
            if (videoView.isPlaying()) {
                videoView.stopPlayback();
                videoView.setVideoURI(videoUri);
            }
        });

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(VideoActivityVenus.this, VenusActivity.class);
            startActivity(intent);
            finish();
        });

        videoView.setOnCompletionListener(mp -> {
            videoView.seekTo(0);
        });
    }
}