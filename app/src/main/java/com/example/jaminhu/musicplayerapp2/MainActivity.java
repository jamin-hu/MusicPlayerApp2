package com.example.jaminhu.musicplayerapp2;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Media player for sound_one.mp3
    private MediaPlayer oneMediaPlayer;
    //Media player for sound_two.mp3
    private MediaPlayer twoMediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oneMediaPlayer = MediaPlayer.create(this, R.raw.soundone);
        oneMediaPlayer.start();
    }

    @Override
    protected void onPause(){
        super.onPause();
        oneMediaPlayer.pause();
        twoMediaPlayer = MediaPlayer.create(this, R.raw.soundtwo);
        twoMediaPlayer.start();
    }

    @Override
    protected void onResume(){
        super.onResume();
        twoMediaPlayer.pause();
        oneMediaPlayer.start();
    }
}