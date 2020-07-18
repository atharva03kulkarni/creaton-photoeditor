package com.creaton.photoeditor;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class differentiateActivity extends AppCompatActivity {

    public void editImage(View view){

        Intent intent = new Intent(this, EditImageActivity.class);
        startActivity(intent);

    }

    public void textRecog(View view){

        Intent intent = new Intent(this, textActivity.class);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_differentiate);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
}
