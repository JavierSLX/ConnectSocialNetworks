package com.javiersl.ejercicioimportacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.*;
import android.util.*;
import android.provider.MediaStore.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Audio audio = new Audio();
        Files file = new Files();
        Video video = new Video();
        FaceDetector face = new FaceDetector(12, 12, 12);
        Base64 base;
    }
}
