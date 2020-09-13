package com.example.citiclubapp.SuccessfulRiges;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.citiclubapp.R;
import com.example.citiclubapp.RigesterActivity.RigesterActivity;

public class SuccessfulRiges extends AppCompatActivity {

    Button login2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successful_riges);
        login2 = findViewById(R.id.button_login2);

        //准备转接下一个页面
       /*  login2.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
               Intent intent = new Intent(  SuccessfulRiges.this,   .class);
                startActivity(intent);
                //finish();
            }
        });

       */
    }




}

