package com.monkeysl.online.modMsO;

import android.os.CountDownTimer;
import android.widget.ImageView;

import com.monkeysl.online.R;

import java.util.Random;

public class Mov4 {
    ResaltMSO resaltMSO;

    public Mov4(ResaltMSO resaltMSO) {
        this.resaltMSO = resaltMSO;
    }

    public void mov4(ImageView image10, ImageView image11, ImageView image12){
        new CountDownTimer(1700,5){

            @Override
            public void onTick(long l) {
                Random random = new Random();
                switch (random.nextInt(4)){
                    case 0:
                        image10.setImageResource(R.drawable.sl1);
                        image10.setTag(0);
                        break;
                    case 1:
                        image10.setImageResource(R.drawable.sl2);
                        image10.setTag(1);
                        break;
                    case 2:
                        image10.setImageResource(R.drawable.sl3);
                        image10.setTag(2);
                        break;
                    case 3:
                        image10.setImageResource(R.drawable.sl4);
                        image10.setTag(3);
                        break;
                }

                switch (random.nextInt(4)){
                    case 0:
                        image11.setImageResource(R.drawable.sl1);
                        image11.setTag(0);
                        break;
                    case 1:
                        image11.setImageResource(R.drawable.sl2);
                        image11.setTag(1);
                        break;
                    case 2:
                        image11.setImageResource(R.drawable.sl3);
                        image11.setTag(2);
                        break;
                    case 3:
                        image11.setImageResource(R.drawable.sl4);
                        image11.setTag(3);
                        break;
                }

                switch (random.nextInt(4)){
                    case 0:
                        image12.setImageResource(R.drawable.sl1);
                        image12.setTag(0);
                        break;
                    case 1:
                        image12.setImageResource(R.drawable.sl2);
                        image12.setTag(1);
                        break;
                    case 2:
                        image12.setImageResource(R.drawable.sl3);
                        image12.setTag(2);
                        break;
                    case 3:
                        image12.setImageResource(R.drawable.sl4);
                        image12.setTag(3);
                        break;
                }

                resaltMSO.setImage10(image10);
                resaltMSO.setImage11(image11);
                resaltMSO.setImage12(image12);
            }

            @Override
            public void onFinish() {

            }
        }.start();
    }
}
