package com.var.classbook.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.var.classbook.R;

public class SplashActivity extends AppCompatActivity {

    // Create a new event for the activity.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the layout for the content view.
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        Thread thread = new Thread() {
            public void run() {

                try {
                    sleep(2000);
//                    finish();
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(SplashActivity.this, "2", Toast.LENGTH_SHORT).show();
                } finally {

                    Intent check = new Intent(SplashActivity.this, LoginActivity.class);
                    startActivity(check);
                    finish();
                }
            }
        };
        thread.start();
    }


}



