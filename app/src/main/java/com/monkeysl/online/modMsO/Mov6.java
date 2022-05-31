package com.monkeysl.online.modMsO;

import android.os.CountDownTimer;
import android.widget.ImageView;

import com.monkeysl.online.R;

import java.util.Random;

public class Mov6 {
    ResaltMSO resaltMSO;

    public Mov6(ResaltMSO resaltMSO) {
        this.resaltMSO = resaltMSO;
    }

    public void mov6(ImageView image16, ImageView image17, ImageView image18){

        new CountDownTimer(1900,5){

            @Override
            public void onTick(long l) {
                Random random = new Random();
                switch (random.nextInt(4)){
                    case 0:
                        image16.setImageResource(R.drawable.sl1);
                        image16.setTag(0);
                        break;
                    case 1:
                        image16.setImageResource(R.drawable.sl2);
                        image16.setTag(1);
                        break;
                    case 2:
                        image16.setImageResource(R.drawable.sl3);
                        image16.setTag(2);
                        break;
                    case 3:
                        image16.setImageResource(R.drawable.sl4);
                        image16.setTag(3);
                        break;
                }

                switch (random.nextInt(4)){
                    case 0:
                        image17.setImageResource(R.drawable.sl1);
                        image17.setTag(0);
                        break;
                    case 1:
                        image17.setImageResource(R.drawable.sl2);
                        image17.setTag(1);
                        break;
                    case 2:
                        image17.setImageResource(R.drawable.sl3);
                        image17.setTag(2);
                        break;
                    case 3:
                        image17.setImageResource(R.drawable.sl4);
                        image17.setTag(3);
                        break;
                }

                switch (random.nextInt(4)){
                    case 0:
                        image18.setImageResource(R.drawable.sl1);
                        image18.setTag(0);
                        break;
                    case 1:
                        image18.setImageResource(R.drawable.sl2);
                        image18.setTag(1);
                        break;
                    case 2:
                        image18.setImageResource(R.drawable.sl3);
                        image18.setTag(2);
                        break;
                    case 3:
                        image18.setImageResource(R.drawable.sl4);
                        image18.setTag(3);
                        break;
                }

                resaltMSO.setImage16(image16);
                resaltMSO.setImage17(image17);
                resaltMSO.setImage18(image18);
            }

            @Override
            public void onFinish() {

                resaltMSO.resss();
            }
        }.start();
    }
}
