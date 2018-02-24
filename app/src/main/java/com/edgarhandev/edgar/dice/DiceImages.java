package com.edgarhandev.edgar.dice;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by Edgar Han on 2/24/2018.
 */

public class DiceImages {
    public static Bitmap dice01;
    public static Bitmap dice02;
    public static Bitmap dice03;
    public static Bitmap dice04;
    public static Bitmap dice05;
    public static Bitmap dice06;

    public static void load (Context context) {
        dice01 = BitmapFactory.decodeResource(context.getResources(), R.drawable.dice001);
        dice02 = BitmapFactory.decodeResource(context.getResources(), R.drawable.dice002);
        dice03 = BitmapFactory.decodeResource(context.getResources(), R.drawable.dice003);
        dice04 = BitmapFactory.decodeResource(context.getResources(), R.drawable.dice004);
        dice05 = BitmapFactory.decodeResource(context.getResources(), R.drawable.dice005);
        dice06 = BitmapFactory.decodeResource(context.getResources(), R.drawable.dice006);
    }

    public static Bitmap getImage(int rolledNumber) {
        switch (rolledNumber) {
            case 1:
                return dice01;
            case 2:
                return dice02;
            case 3:
                return dice03;
            case 4:
                return dice04;
            case 5:
                return dice05;
            case 6:
                return dice06;
        }
        return dice01;
    }
}
