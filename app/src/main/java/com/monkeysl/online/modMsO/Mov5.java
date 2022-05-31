package com.monkeysl.online.modMsO;

import android.os.CountDownTimer;
import android.widget.ImageView;

import com.monkeysl.online.R;

import java.util.Random;

public class Mov5 {
    ResaltMSO resaltMSO;

    public Mov5(ResaltMSO resaltMSO) {
        this.resaltMSO = resaltMSO;
    }

    public void mov5(ImageView image13, ImageView image14, ImageView image15){
        new CountDownTimer(1800,5){

            @Override
            public void onTick(long l) {
                Random random = new Random();
                switch (random.nextInt(4)){
                    case 0:
                        image13.setImageResource(R.drawable.sl1);
                        image13.setTag(0);
                        break;
                    case 1:
                        image13.setImageResource(R.drawable.sl2);
                        image13.setTag(1);
                        break;
                    case 2:
                        image13.setImageResource(R.drawable.sl3);
                        image13.setTag(2);
                        break;
                    case 3:
                        image13.setImageResource(R.drawable.sl4);
                        image13.setTag(3);
                        break;
                }

                switch (random.nextInt(4)){
                    case 0:
                        image14.setImageResource(R.drawable.sl1);
                        image14.setTag(0);
                        break;
                    case 1:
                        image14.setImageResource(R.drawable.sl2);
                        image14.setTag(1);
                        break;
                    case 2:
                        image14.setImageResource(R.drawable.sl3);
                        image14.setTag(2);
                        break;
                    case 3:
                        image14.setImageResource(R.drawable.sl4);
                        image14.setTag(3);
                        break;
                }

                switch (random.nextInt(4)){
                    case 0:
                        image15.setImageResource(R.drawable.sl1);
                        image15.setTag(0);
                        break;
                    case 1:
                        image15.setImageResource(R.drawable.sl2);
                        image15.setTag(1);
                        break;
                    case 2:
                        image15.setImageResource(R.drawable.sl3);
                        image15.setTag(2);
                        break;
                    case 3:
                        image15.setImageResource(R.drawable.sl4);
                        image15.setTag(3);
                        break;
                }

                resaltMSO.setImage13(image13);
                resaltMSO.setImage14(image14);
                resaltMSO.setImage15(image15);
            }

            @Override
            public void onFinish() {

            }
        }.start();
    }
}
