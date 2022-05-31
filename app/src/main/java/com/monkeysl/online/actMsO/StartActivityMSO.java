package com.monkeysl.online.actMsO;

import static com.monkeysl.online.actMsO.SlotActivityMSO.scoreMSO;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.monkeysl.online.R;

public class StartActivityMSO extends AppCompatActivity {

    Button buttonexi, buttonStart,buttonwheel;
    TextView textViewscor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_mso);
        getWindow().addFlags(1024);
        ij();
        lk();



    }

    public void ij(){
        buttonexi = findViewById(R.id.buttonexit);
        buttonStart = findViewById(R.id.buttonStart);
        buttonwheel = findViewById(R.id.buttonwheel);
        textViewscor = findViewById(R.id.textViewscorrrr);
        textViewscor.setText("Score: "+getSharedPreferences(getPackageName(), Context.MODE_PRIVATE).getInt("scor", 2000));
    }

    public void lk(){
        buttonexi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),SlotActivityMSO.class));
                finishAffinity();
            }
        });

        buttonwheel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),WheelActivityMSO.class));
                finishAffinity();
            }
        });
    }
}