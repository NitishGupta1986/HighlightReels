package com.android.highreels.customViewLight;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.SwitchCompat;

import com.android.highreels.appController.AppController;


@SuppressLint("AppCompatCustomView")
public class LightSwitch extends SwitchCompat {
    public LightSwitch(Context context) {
        super(context);
        setFont();
    }

    public LightSwitch(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }

    public LightSwitch(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFont();
    }

    private void setFont() {
        Typeface normal = Typeface.createFromAsset(getContext().getAssets(), AppController.getInstance().getLightFontPath());
        setTypeface(normal, Typeface.NORMAL);
    }
}