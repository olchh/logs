package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final String TAG = "Logs";


    private int count = 9;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.d(TAG, "onCreate");
        Toast.makeText(this,"onCreate", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();
        resetUI();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", count);
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("count")) {
            count = savedInstanceState.getInt("count");
        }
        Log.d(TAG, "onRestoreInstanceState");
    }

    private void resetUI() {
        ((TextView) findViewById(R.id.txt_counter)).setText("count");
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();
        Log.d(TAG, "resetUI");
    }
}