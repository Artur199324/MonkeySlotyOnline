package com.monkeysl.online.modMsO;

import android.os.CountDownTimer;
import android.widget.ImageView;

import com.monkeysl.online.R;

import java.util.Random;

public class Mov1 {
    ResaltMSO resaltMSO;

    public Mov1(ResaltMSO resaltMSO) {
        this.resaltMSO = resaltMSO;
    }

    public void mov1(ImageView image1, ImageView image2, ImageView image3){
        new CountDownTimer(1400,5){

            @Override
            public void onTick(long l) {
                Random random = new Random();
                switch (random.nextInt(4)){
                    case 0:
                        image1.setImageResource(R.drawable.sl1);
                        image1.setTag(0);
                        break;
                    case 1:
                        image1.setImageResource(R.drawable.sl2);
                        image1.setTag(1);
                        break;
                    case 2:
                        image1.setImageResource(R.drawable.sl3);
                        image1.setTag(2);
                        break;
                    case 3:
                        image1.setImageResource(R.drawable.sl4);
                        image1.setTag(3);
                        break;
                }

                switch (random.nextInt(4)){
                    case 0:
                        image2.setImageResource(R.drawable.sl1);
                        image2.setTag(0);
                        break;
                    case 1:
                        image2.setImageResource(R.drawable.sl2);
                        image2.setTag(1);
                        break;
                    case 2:
                        image2.setImageResource(R.drawable.sl3);
                        image2.setTag(2);
                        break;
                    case 3:
                        image2.setImageResource(R.drawable.sl4);
                        image2.setTag(3);
                        break;
                }

                switch (random.nextInt(4)){
                    case 0:
                        image3.setImageResource(R.drawable.sl1);
                        image3.setTag(0);
                        break;
                    case 1:
                        image3.setImageResource(R.drawable.sl2);
                        image3.setTag(1);
                        break;
                    case 2:
                        image3.setImageResource(R.drawable.sl3);
                        image3.setTag(2);
                        break;
                    case 3:
                        image3.setImageResource(R.drawable.sl4);
                        image3.setTag(3);
                        break;
                }
                resaltMSO.setImage1(image1);
                resaltMSO.setImage2(image2);
                resaltMSO.setImage3(image3);
            }

            @Override
            public void onFinish() {


            }
        }.start();

    }
}
