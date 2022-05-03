package com.android.highreels.customViewLight;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatCheckBox;

import com.android.highreels.appController.AppController;


@SuppressLint("AppCompatCustomView")
public class LightCheckBox extends AppCompatCheckBox {
    public LightCheckBox(Context context) {
        super(context);
        setFont();
    }

    public LightCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }

    public LightCheckBox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFont();
    }

    private void setFont() {
        Typeface normal = Typeface.createFromAsset(getContext().getAssets(), AppController.getInstance().getLightFontPath());
        setTypeface(normal, Typeface.NORMAL);
    }
}