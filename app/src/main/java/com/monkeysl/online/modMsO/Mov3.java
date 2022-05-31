package com.monkeysl.online.modMsO;

import android.os.CountDownTimer;
import android.widget.ImageView;

import com.monkeysl.online.R;

import java.util.Random;

public class Mov3 {
    ResaltMSO resaltMSO;

    public Mov3(ResaltMSO resaltMSO) {
        this.resaltMSO = resaltMSO;
    }

    public void mov3(ImageView image7, ImageView image8, ImageView image9){
        new CountDownTimer(1600,5){

            @Override
            public void onTick(long l) {
                Random random = new Random();
                switch (random.nextInt(4)){
                    case 0:
                        image7.setImageResource(R.drawable.sl1);
                        image7.setTag(0);
                        break;
                    case 1:
                        image7.setImageResource(R.drawable.sl2);
                        image7.setTag(1);
                        break;
                    case 2:
                        image7.setImageResource(R.drawable.sl3);
                        image7.setTag(2);
                        break;
                    case 3:
                        image7.setImageResource(R.drawable.sl4);
                        image7.setTag(3);
                        break;
                }

                switch (random.nextInt(4)){
                    case 0:
                        image8.setImageResource(R.drawable.sl1);
                        image8.setTag(0);
                        break;
                    case 1:
                        image8.setImageResource(R.drawable.sl2);
                        image8.setTag(1);
                        break;
                    case 2:
                        image8.setImageResource(R.drawable.sl3);
                        image8.setTag(2);
                        break;
                    case 3:
                        image8.setImageResource(R.drawable.sl4);
                        image8.setTag(3);
                        break;
                }

                switch (random.nextInt(4)){
                    case 0:
                        image9.setImageResource(R.drawable.sl1);
                        image9.setTag(0);
                        break;
                    case 1:
                        image9.setImageResource(R.drawable.sl2);
                        image9.setTag(1);
                        break;
                    case 2:
                        image9.setImageResource(R.drawable.sl3);
                        image9.setTag(2);
                        break;
                    case 3:
                        image9.setImageResource(R.drawable.sl4);
                        image9.setTag(3);
                        break;
                }

                resaltMSO.setImage7(image7);
                resaltMSO.setImage8(image8);
                resaltMSO.setImage9(image9);
            }

            @Override
            public void onFinish() {

            }
        }.start();
    }
}
