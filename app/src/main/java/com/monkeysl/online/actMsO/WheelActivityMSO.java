package com.monkeysl.online.actMsO;

import static com.monkeysl.online.actMsO.SlotActivityMSO.scoreMSO;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.monkeysl.online.R;

import java.util.Random;

public class WheelActivityMSO extends AppCompatActivity {

    private ImageView imageViewWe;
    private Button buttonTwist,buttonbac2;
    private TextView textViewwiin,textViewscorrrr;
    private Random random;
    private int oldDeegreMSO = 0;
    private int deegreMSO = 0;
    private final static float FACTORMSO = 22.5f;
    private int nn[] = {2000, 1000, 0, 2, 2000, 1000, 50000, 25000};
    private int scc;
    private int winnn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wheel_mso);
        getWindow().addFlags(1024);
        random = new Random();
        inn();
        textViewscorrrr.setText("Score: "+getSharedPreferences(getPackageName(), Context.MODE_PRIVATE).getInt("scor", 2000));
        scc = getSharedPreferences(getPackageName(), Context.MODE_PRIVATE).getInt("scor", 2000);
        buttonTwist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewwiin.setText("Win : 0");
                ruu();

            }
        });

        buttonbac2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplication(), StartActivityMSO.class));
                finishAffinity();
            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplication(), StartActivityMSO.class));
        finishAffinity();
    }

    public void inn() {
        imageViewWe = findViewById(R.id.imageViewWe);
        buttonTwist = findViewById(R.id.buttonTwist);
        textViewwiin = findViewById(R.id.textViewwiin);
        textViewscorrrr = findViewById(R.id.textViewscorrrr);
        buttonbac2 = findViewById(R.id.buttonbac2);
    }

    private void ruu() {

        oldDeegreMSO = deegreMSO % 360;
        deegreMSO = random.nextInt(3600) + 720;

        RotateAnimation rotateAnimation = new RotateAnimation(oldDeegreMSO, deegreMSO, RotateAnimation.RELATIVE_TO_SELF,
                0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setDuration(3600);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setInterpolator(new DecelerateInterpolator());
        rotateAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Log.d("weq", getResMSO(360 - (deegreMSO % 360)) + "");

                winnn = getResMSO(360 - (deegreMSO % 360));
                if (winnn == 2){
                    scc *=2;
                    textViewwiin.setText("Win : *2");
                }else {
                    scc +=winnn;
                   getSharedPreferences(getPackageName(), Context.MODE_PRIVATE).edit().putInt("scor", scc).apply();
                    textViewscorrrr.setText("Score: " + scc);
                    textViewwiin.setText("Win : "+ getResMSO(360 - (deegreMSO % 360)));
                }

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        imageViewWe.startAnimation(rotateAnimation);
    }


    private int getResMSO(int deegreMSO) {
        int res = 0;

        int factorX = 1;
        int factorY = 3;

        for (int i = 0; i < 8; i++) {

            if (deegreMSO >= (FACTORMSO * factorX) && deegreMSO < (FACTORMSO * factorY)) {
                res = nn[i];
            }

            factorX += 2;
            factorY += 2;
        }

        if(deegreMSO >= (FACTORMSO * 73) && deegreMSO < 360 || deegreMSO >= 0 && deegreMSO < (FACTORMSO * 1)) res = nn[nn.length - 1];
        return res;
    }
}