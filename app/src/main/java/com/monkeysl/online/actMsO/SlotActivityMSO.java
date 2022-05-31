package com.monkeysl.online.actMsO;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.monkeysl.online.R;
import com.monkeysl.online.viewmodMsO.ViewModMsO;

public class SlotActivityMSO extends AppCompatActivity {

    private ViewModMsO viewModMsO;
    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private ImageView image4;
    private ImageView image5;
    private ImageView image6;
    private ImageView image7;
    private ImageView image8;
    private ImageView image9;
    private ImageView image10;
    private ImageView image11;
    private ImageView image12;
    private ImageView image13;
    private ImageView image14;
    private ImageView image15;
    private ImageView image16;
    private ImageView image17;
    private ImageView image18;
    private ImageView imageBut;
    private TextView textViewScore;
    private TextView textViewBet;
    private TextView textViewWin;
    private Button buttonplus;
    private Button buttonminus;
    private Button buttonall;
    public static int scoreMSO = 2000;
    public static int betMSO = 0;
    boolean dd = false;
    final int DIALOG = 1;
    Button buttonMun;
    Button buttonPoin;
    Toast toast;

    public void pp() {

        showDialog(DIALOG);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), StartActivityMSO.class));
        finishAffinity();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModMsO = new ViewModelProvider.AndroidViewModelFactory(getApplication()).create(ViewModMsO.class);
        getWindow().addFlags(1024);

        initMSO();
        viewModMsO.aa(this);
        textViewScore.setText("Score: " + getSharedPreferences(getPackageName(), Context.MODE_PRIVATE).getInt("scor", 2000));
        scoreMSO = getSharedPreferences(getPackageName(), Context.MODE_PRIVATE).getInt("scor", 2000);
        if (scoreMSO == 0) {
            pp();
        }
        buttonplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scoreMSO == 0 || scoreMSO < 0) {
                } else {
                    scoreMSO -= 200;
                    betMSO += 200;
                    textViewScore.setText("Score: " + scoreMSO);
                    textViewBet.setText("Bet : " + betMSO);
                    textViewWin.setText("Win : 0");
                }


            }
        });

        buttonminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (betMSO == 0 || betMSO < 0) {

                } else {

                    scoreMSO += 200;
                    betMSO -= 200;
                    textViewScore.setText("Score: " + scoreMSO);
                    textViewBet.setText("Bet : " + betMSO);
                    textViewWin.setText("Win : 0");

                }
            }
        });

        buttonall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                betMSO = getSharedPreferences(getPackageName(), Context.MODE_PRIVATE).getInt("scor", 2000);
                scoreMSO = 0;
                textViewScore.setText("Score: " + scoreMSO);
                textViewBet.setText("Bet : " + betMSO);
                textViewWin.setText("Win : 0");
                dd = true;
            }
        });
        startMSO();


    }

    @Override
    protected Dialog onCreateDialog(int id) {
        AlertDialog.Builder adb = new AlertDialog.Builder(this);
        View view = getLayoutInflater()
                .inflate(R.layout.dialog_m_s_o, null);
        adb.setView(view);
        buttonMun = view.findViewById(R.id.buttonMun);
        buttonPoin = view.findViewById(R.id.buttonPoin);

        buttonMun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), StartActivityMSO.class));
                finishAffinity();
            }
        });

        buttonPoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), WheelActivityMSO.class));
                finishAffinity();
            }
        });
        return adb.create();
    }

    public void startMSO() {

        imageBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (betMSO == 0) {
                    LayoutInflater inflater = getLayoutInflater();
                    View layout = inflater.inflate(R.layout.toast_bet,
                            (ViewGroup) findViewById(R.id.tos));

                    toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();


                } else {
                    viewModMsO.move1(image1, image2, image3);
                    viewModMsO.move2(image4, image5, image6);
                    viewModMsO.move3(image7, image8, image9);
                    viewModMsO.move4(image10, image11, image12);
                    viewModMsO.move5(image13, image14, image15);
                    viewModMsO.move6(image16, image17, image18);
                    viewModMsO.rrr(textViewScore, textViewBet, textViewWin);
                }

            }
        });
    }

    public void initMSO() {
        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);
        image6 = findViewById(R.id.image6);
        image7 = findViewById(R.id.image7);
        image8 = findViewById(R.id.image8);
        image9 = findViewById(R.id.image9);
        image10 = findViewById(R.id.image10);
        image11 = findViewById(R.id.image11);
        image12 = findViewById(R.id.image12);
        image13 = findViewById(R.id.image13);
        image14 = findViewById(R.id.image14);
        image15 = findViewById(R.id.image15);
        image16 = findViewById(R.id.image16);
        image17 = findViewById(R.id.image17);
        image18 = findViewById(R.id.image18);
        imageBut = findViewById(R.id.imageBut);
        textViewScore = findViewById(R.id.textViewScore);
        textViewBet = findViewById(R.id.textViewBet);
        textViewWin = findViewById(R.id.textViewWin);
        buttonplus = findViewById(R.id.buttonplus);
        buttonminus = findViewById(R.id.buttonminus);
        buttonall = findViewById(R.id.buttonall);
    }
}