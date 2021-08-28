package com.example.standing_alone;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        //ab.setDisplayShowCustomEnabled(true);
        //ab.setDisplayShowTitleEnabled(false);

        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        startWriteActivity();
        //findViewById(R.id.writeButton).setOnClickListener(onClickListener);
    }

    /*View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.writeButton:
                    // FirebaseAuth.getInstance().signOut();
                    startWriteActivity();

                    break;
            }
        }
    };*/

    private void startWriteActivity() {
        Intent intent = new Intent(this, WritePostActivity.class);
        startActivity(intent);
    }
}