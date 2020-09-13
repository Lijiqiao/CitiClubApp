package com.example.citiclubapp.RigesterActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.citiclubapp.LoginActivity.LoginActivity;
import com.example.citiclubapp.R;
import com.example.citiclubapp.SuccessfulRiges.SuccessfulRiges;

public class RigesterActivity extends AppCompatActivity {
Button havAccount;
Button successfulRegisters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rigester);
        havAccount = findViewById(R.id.button_havAccount);
        havAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RigesterActivity.this, LoginActivity.class);
                startActivity(intent);
                //finish();
            }
        });
        successfulRegisters = findViewById(R.id.button_successfulRegisters);
        successfulRegisters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RigesterActivity.this, SuccessfulRiges.class);
                startActivity(intent);
                //finish();
            }
        });
    }
}
