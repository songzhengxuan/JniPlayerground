package com.example.sks.jniplayerground;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.song.jni.HelloJni;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int result = HelloJni.testByteBuffer(null);
        Log.d(TAG, "result is " + result);
    }
}
