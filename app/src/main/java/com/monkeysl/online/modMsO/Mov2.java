package com.monkeysl.online.modMsO;

import android.os.CountDownTimer;
import android.widget.ImageView;

import com.monkeysl.online.R;

import java.util.Random;

public class Mov2 {

    ResaltMSO resaltMSO;

    public Mov2(ResaltMSO resaltMSO) {
        this.resaltMSO = resaltMSO;
    }

    public void move2(ImageView image4, ImageView image5, ImageView image6){
        new CountDownTimer(1500,5){

            @Override
            public void onTick(long l) {
                Random random = new Random();
                switch (random.nextInt(4)){
                    case 0:
                        image4.setImageResource(R.drawable.sl1);
                        image4.setTag(0);
                        break;
                    case 1:
                        image4.setImageResource(R.drawable.sl2);
                        image4.setTag(1);
                        break;
                    case 2:
                        image4.setImageResource(R.drawable.sl3);
                        image4.setTag(2);
                        break;
                    case 3:
                        image4.setImageResource(R.drawable.sl4);
                        image4.setTag(3);
                        break;
                }

                switch (random.nextInt(4)){
                    case 0:
                        image5.setImageResource(R.drawable.sl1);
                        image5.setTag(0);
                        break;
                    case 1:
                        image5.setImageResource(R.drawable.sl2);
                        image5.setTag(1);
                        break;
                    case 2:
                        image5.setImageResource(R.drawable.sl3);
                        image5.setTag(2);
                        break;
                    case 3:
                        image5.setImageResource(R.drawable.sl4);
                        image5.setTag(3);
                        break;
                }

                switch (random.nextInt(4)){
                    case 0:
                        image6.setImageResource(R.drawable.sl1);
                        image6.setTag(0);
                        break;
                    case 1:
                        image6.setImageResource(R.drawable.sl2);
                        image6.setTag(1);
                        break;
                    case 2:
                        image6.setImageResource(R.drawable.sl3);
                        image6.setTag(2);
                        break;
                    case 3:
                        image6.setImageResource(R.drawable.sl4);
                        image6.setTag(3);
                        break;
                }

                resaltMSO.setImage4(image4);
                resaltMSO.setImage5(image5);
                resaltMSO.setImage6(image6);
            }

            @Override
            public void onFinish() {

            }
        }.start();

    }
}
