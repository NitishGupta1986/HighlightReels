package com.android.highreels.customViewLight;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatEditText;

import com.android.highreels.appController.AppController;


@SuppressLint("AppCompatCustomView")
public class LightEditText extends AppCompatEditText {
    public LightEditText(Context context) {
        super(context);
        setFont();
    }

    public LightEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }

    public LightEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFont();
    }

    private void setFont() {
        Typeface normal = Typeface.createFromAsset(getContext().getAssets(), AppController.getInstance().getLightFontPath());
        setTypeface(normal);
    }
}