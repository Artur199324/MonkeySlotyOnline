package com.monkeysl.online.modMsO;

import static com.monkeysl.online.actMsO.SlotActivityMSO.betMSO;
import static com.monkeysl.online.actMsO.SlotActivityMSO.scoreMSO;

import android.content.Context;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.monkeysl.online.R;
import com.monkeysl.online.actMsO.SlotActivityMSO;

import java.util.ArrayList;

public class ResaltMSO {

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

    private int i1 = 0;
    private int i2 = 0;
    private int i3 = 0;
    private int i4 = 0;

    private TextView textViewScore;
    private TextView textViewBet;
    private TextView textViewWin;



    SlotActivityMSO mainActivity;

    public TextView getTextViewScore() {
        return textViewScore;
    }

    public void setTextViewScore(TextView textViewScore) {
        this.textViewScore = textViewScore;
    }

    public TextView getTextViewBet() {
        return textViewBet;
    }

    public void setTextViewBet(TextView textViewBet) {
        this.textViewBet = textViewBet;
    }

    public TextView getTextViewWin() {
        return textViewWin;
    }

    public void setTextViewWin(TextView textViewWin) {
        this.textViewWin = textViewWin;
    }



    public SlotActivityMSO getMainActivity() {
        return mainActivity;
    }

    public void setMainActivity(SlotActivityMSO mainActivity) {
        this.mainActivity = mainActivity;
    }

    public ImageView getImage1() {
        return image1;
    }

    public void setImage1(ImageView image1) {
        this.image1 = image1;
    }

    public ImageView getImage2() {
        return image2;
    }

    public void setImage2(ImageView image2) {
        this.image2 = image2;
    }

    public ImageView getImage3() {
        return image3;
    }

    public void setImage3(ImageView image3) {
        this.image3 = image3;
    }

    public ImageView getImage4() {
        return image4;
    }

    public void setImage4(ImageView image4) {
        this.image4 = image4;
    }

    public ImageView getImage5() {
        return image5;
    }

    public void setImage5(ImageView image5) {
        this.image5 = image5;
    }

    public ImageView getImage6() {
        return image6;
    }

    public void setImage6(ImageView image6) {
        this.image6 = image6;
    }

    public ImageView getImage7() {
        return image7;
    }

    public void setImage7(ImageView image7) {
        this.image7 = image7;
    }

    public ImageView getImage8() {
        return image8;
    }

    public void setImage8(ImageView image8) {
        this.image8 = image8;
    }

    public ImageView getImage9() {
        return image9;
    }

    public void setImage9(ImageView image9) {
        this.image9 = image9;
    }

    public ImageView getImage10() {
        return image10;
    }

    public void setImage10(ImageView image10) {
        this.image10 = image10;
    }

    public ImageView getImage11() {
        return image11;
    }

    public void setImage11(ImageView image11) {
        this.image11 = image11;
    }

    public ImageView getImage12() {
        return image12;
    }

    public void setImage12(ImageView image12) {
        this.image12 = image12;
    }

    public ImageView getImage13() {
        return image13;
    }

    public void setImage13(ImageView image13) {
        this.image13 = image13;
    }

    public ImageView getImage14() {
        return image14;
    }

    public void setImage14(ImageView image14) {
        this.image14 = image14;
    }

    public ImageView getImage15() {
        return image15;
    }

    public void setImage15(ImageView image15) {
        this.image15 = image15;
    }

    public ImageView getImage16() {
        return image16;
    }

    public void setImage16(ImageView image16) {
        this.image16 = image16;
    }

    public ImageView getImage17() {
        return image17;
    }

    public void setImage17(ImageView image17) {
        this.image17 = image17;
    }

    public ImageView getImage18() {
        return image18;
    }

    public void setImage18(ImageView image18) {
        this.image18 = image18;
    }


    boolean res = false;

    public void resss() {

        ArrayList<ImageView> arrayList = new ArrayList<>();
        arrayList.add(getImage1());
        arrayList.add(getImage2());
        arrayList.add(getImage3());
        arrayList.add(getImage4());
        arrayList.add(getImage5());
        arrayList.add(getImage6());
        arrayList.add(getImage7());
        arrayList.add(getImage8());
        arrayList.add(getImage9());
        arrayList.add(getImage10());
        arrayList.add(getImage11());
        arrayList.add(getImage12());
        arrayList.add(getImage13());
        arrayList.add(getImage14());
        arrayList.add(getImage15());
        arrayList.add(getImage16());
        arrayList.add(getImage17());
        arrayList.add(getImage18());

        Log.d("weq", arrayList.size() + "");
        for (int i = 0; i < arrayList.size(); i++) {
            if ((int) arrayList.get(i).getTag() == 0) {
                i1++;
            }

            if ((int) arrayList.get(i).getTag() == 1) {
                i2++;
            }

            if ((int) arrayList.get(i).getTag() == 2) {
                i3++;
            }

            if ((int) arrayList.get(i).getTag() == 3) {
                i4++;
            }
        }

        if (i1 > i2 && i1 > i3 && i1 > i4) {

            if (i1 > 4) {
                if (i1 > 6) {
                    betMSO *= 2;

                } else {
                    betMSO *= 3;
                }
                textViewWin.setText("Win : " + betMSO);
                scoreMSO += betMSO;
                betMSO = 0;
                textViewBet.setText("Bet : 0");

            } else {
                textViewWin.setText("Win : 0");
                LayoutInflater inflater = mainActivity.getLayoutInflater();
                View layout = inflater.inflate(R.layout.toast_lost,
                        (ViewGroup) mainActivity.findViewById(R.id.lost));

                Toast toast = new Toast(mainActivity.getApplicationContext());
                toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(layout);
                toast.show();

            }
            for (int i = 0; i < arrayList.size(); i++) {
                if ((int) arrayList.get(i).getTag() == 0) {
                    Animation animation = new AlphaAnimation(1, 0);
                    animation.setDuration(1000);
                    animation.setInterpolator(new LinearInterpolator());
                    animation.setRepeatMode(Animation.REVERSE);
                    arrayList.get(i).startAnimation(animation);
                    i1 = 0;
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    res = true;

                }
            }

            Log.d("weq", "1");
        }

        if (i2 > i1 && i2 > i3 && i2 > i4) {

            if (i2 > 4) {
                if (i2 > 6) {
                    betMSO *= 2;

                } else {
                    betMSO *= 3;
                }
                textViewWin.setText("Win : " + betMSO);
                scoreMSO += betMSO;
                betMSO = 0;
                textViewBet.setText("Bet : "+ betMSO);
                textViewScore.setText("Score: " + scoreMSO);

            } else {
                textViewWin.setText("Win : 0");
                LayoutInflater inflater = mainActivity.getLayoutInflater();
                View layout = inflater.inflate(R.layout.toast_lost,
                        (ViewGroup) mainActivity.findViewById(R.id.lost));

                Toast toast = new Toast(mainActivity.getApplicationContext());
                toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(layout);
                toast.show();

            }

            for (int i = 0; i < arrayList.size(); i++) {
                if ((int) arrayList.get(i).getTag() == 1) {
                    Animation animation = new AlphaAnimation(1, 0);
                    animation.setDuration(1000);
                    animation.setInterpolator(new LinearInterpolator());
                    animation.setRepeatMode(Animation.REVERSE);
                    arrayList.get(i).startAnimation(animation);
                    i1 = 0;
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    res = true;
                }
            }
            Log.d("weq", "2");
        }

        if (i3 > i1 && i3 > i2 && i3 > i4) {
            if (i3 > 4) {
                if (i3 > 6) {
                    betMSO *= 2;

                } else {
                    betMSO *= 3;
                }
                textViewWin.setText("Win : " + betMSO);
                scoreMSO += betMSO;
                betMSO = 0;
                textViewBet.setText("Bet : "+ betMSO);
                textViewScore.setText("Score: " + scoreMSO);

            } else {
                textViewWin.setText("Win : 0");
                LayoutInflater inflater = mainActivity.getLayoutInflater();
                View layout = inflater.inflate(R.layout.toast_lost,
                        (ViewGroup) mainActivity.findViewById(R.id.lost));

                Toast toast = new Toast(mainActivity.getApplicationContext());
                toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(layout);
                toast.show();

            }

            for (int i = 0; i < arrayList.size(); i++) {
                if ((int) arrayList.get(i).getTag() == 2) {
                    Animation animation = new AlphaAnimation(1, 0);
                    animation.setDuration(1000);
                    animation.setInterpolator(new LinearInterpolator());
                    animation.setRepeatMode(Animation.REVERSE);
                    arrayList.get(i).startAnimation(animation);
                    i1 = 0;
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    res = true;
                }
            }
            Log.d("weq", "3");
        }

        if (i4 > i1 && i4 > i2 && i4 > i3) {

            if (i4 > 4) {
                if (i4 > 6) {
                    betMSO *= 2;

                } else {
                    betMSO *= 3;
                }
                textViewWin.setText("Win : " + betMSO);
                scoreMSO += betMSO;
                betMSO = 0;
                textViewBet.setText("Bet : "+ betMSO);
                textViewScore.setText("Score: " + scoreMSO);

            } else {
                textViewWin.setText("Win : 0");
                LayoutInflater inflater = mainActivity.getLayoutInflater();
                View layout = inflater.inflate(R.layout.toast_lost,
                        (ViewGroup) mainActivity.findViewById(R.id.lost));

                Toast toast = new Toast(mainActivity.getApplicationContext());
                toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(layout);
                toast.show();
            }

            for (int i = 0; i < arrayList.size(); i++) {
                if ((int) arrayList.get(i).getTag() == 3) {
                    Animation animation = new AlphaAnimation(1, 0);
                    animation.setDuration(1000);
                    animation.setInterpolator(new LinearInterpolator());
                    animation.setRepeatMode(Animation.REVERSE);
                    arrayList.get(i).startAnimation(animation);
                    i1 = 0;
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    res = true;
                }
            }
            Log.d("weq", "4");
        }


        if (res) {

            Log.d("weq", "+");
            res = false;
        } else {
            textViewWin.setText("Win : 0");
            betMSO = 0;
            textViewBet.setText("Bet : "+ betMSO);
            textViewWin.setText("Win : " + betMSO);
            LayoutInflater inflater = mainActivity.getLayoutInflater();
            View layout = inflater.inflate(R.layout.toast_lost,
                    (ViewGroup) mainActivity.findViewById(R.id.lost));

            Toast toast = new Toast(mainActivity.getApplicationContext());
            toast.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(layout);
            toast.show();
            Log.d("weq", "-");

        }

        mainActivity.getSharedPreferences(mainActivity.getPackageName(), Context.MODE_PRIVATE).edit().putInt("scor", scoreMSO).apply();

        if (scoreMSO == 0){
            mainActivity.pp();
        }
    }
}
