package com.gl.calculater;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

public class Validation {

    private static final String TAG = "MainActivity";
    static  boolean isChack(String amount, String rate, String year, Context main) {

        if (TextUtils.isEmpty(amount)) {

            Toast t = Toast.makeText(main, "please enter amount", Toast.LENGTH_SHORT);
            t.show();
            return false;
        }
        if (TextUtils.isEmpty(rate)) {
            Toast t = Toast.makeText(main, "please enter rate", Toast.LENGTH_SHORT);
            t.show();
            return false;
        }
        if (TextUtils.isEmpty(rate)) {
            Toast t = Toast.makeText(main, "please enter year", Toast.LENGTH_SHORT);
            t.show();
            return false;
        }

        return true;
    }

}
