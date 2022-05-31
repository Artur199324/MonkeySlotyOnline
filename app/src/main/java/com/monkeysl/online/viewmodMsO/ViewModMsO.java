package com.monkeysl.online.viewmodMsO;

import android.app.Application;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.monkeysl.online.actMsO.SlotActivityMSO;
import com.monkeysl.online.modMsO.Mov1;
import com.monkeysl.online.modMsO.Mov2;
import com.monkeysl.online.modMsO.Mov3;
import com.monkeysl.online.modMsO.Mov4;
import com.monkeysl.online.modMsO.Mov5;
import com.monkeysl.online.modMsO.Mov6;
import com.monkeysl.online.modMsO.ResaltMSO;

public class ViewModMsO extends AndroidViewModel {

    Mov1 mov1;
    Mov2 mov2;
    Mov3 mov3;
    Mov4 mov4;
    Mov5 mov5;
    Mov6 mov6;
    ResaltMSO resaltMSO;
    public ViewModMsO(@NonNull Application application) {
        super(application);
        resaltMSO = new ResaltMSO();
        mov1 = new Mov1(resaltMSO);
        mov2 = new Mov2(resaltMSO);
        mov3 = new Mov3(resaltMSO);
        mov4 = new Mov4(resaltMSO);
        mov5 = new Mov5(resaltMSO);
        mov6 = new Mov6(resaltMSO);

    }

    public void aa(SlotActivityMSO mainActivity){
        resaltMSO.setMainActivity(mainActivity);
    }

    public void rrr(TextView textViewScore,TextView textViewBet,TextView textViewWin){
        resaltMSO.setTextViewScore(textViewScore);
        resaltMSO.setTextViewBet(textViewBet);
        resaltMSO.setTextViewWin(textViewWin);

    }

    public void move1(ImageView image1, ImageView image2, ImageView image3){
        mov1.mov1(image1,image2,image3);
    }

    public void move2(ImageView image4, ImageView image5, ImageView image6){
        mov2.move2(image4,image5,image6);
    }

    public void move3(ImageView image7, ImageView image8, ImageView image9){
        mov3.mov3(image7,image8,image9);
    }

    public void move4(ImageView image10, ImageView image11, ImageView image12){
        mov4.mov4(image10,image11,image12);
    }

    public void move5(ImageView image13, ImageView image14, ImageView image15){
        mov5.mov5(image13,image14,image15);
    }

    public void move6(ImageView image16, ImageView image17, ImageView image18){
        mov6.mov6(image16,image17,image18);
    }
}
