package com.creaton.photoeditor;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGTH = 2500;

    public void editImage(View view) {
        Intent intent = new Intent(this, EditImageActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(MainActivity.this, differentiateActivity.class);

                SharedPreferences settings = getSharedPreferences("your_preference_name", 0);
                boolean isLoggedIn = settings.getBoolean("LoggedIn", false);


                    MainActivity.this.startActivity(mainIntent);
                    MainActivity.this.finish();


            }
        }, SPLASH_DISPLAY_LENGTH);

    }
}
