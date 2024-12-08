package com.example.planetas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    private VideoView videoView;
    private Button btnPlay, btnPause, btnStop, btnNext;

    private MediaPlayer mediaPlayer;

    private TextView nameVideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        //nameVideo = findViewById(R.id.videoName);

        String fullName = "R.raw."+nameVideo.getText().toString();

        // Referencias a los elementos del layout
        videoView = findViewById(R.id.videoView);
        btnPlay = findViewById(R.id.btnPlay);
        btnPause = findViewById(R.id.btnPause);
        btnStop = findViewById(R.id.btnStop);
        btnNext = findViewById(R.id.btnNext);

        // Establecer la URI del video
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + fullName);
        videoView.setVideoURI(videoUri);

        // Botón Play
        btnPlay.setOnClickListener(v -> {
            videoView.start();
        });

        // Botón Pause
        btnPause.setOnClickListener(v -> {
            if (videoView.isPlaying()) {
                videoView.pause();
            }
        });

        // Botón Stop
        btnStop.setOnClickListener(v -> {
            if (videoView.isPlaying()) {
                videoView.stopPlayback();
                videoView.setVideoURI(videoUri); // Reiniciar el video
            }
        });

        // Botón Siguiente
        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(VideoActivity.this, NeptunoActivity.class);
            startActivity(intent);
        });

        // Configuración del listener para finalizar el video
        videoView.setOnCompletionListener(mp -> {
            videoView.seekTo(0); // Reinicia el video al terminar
        });
    }
}