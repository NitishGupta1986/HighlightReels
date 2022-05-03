package com.android.highreels.customViewLight;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

import com.android.highreels.appController.AppController;


@SuppressLint("AppCompatCustomView")
public class LightTextView extends AppCompatTextView {
    public LightTextView(Context context) {
        super(context);
        setFont();
    }

    public LightTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }

    public LightTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFont();
    }

    private void setFont() {
        Typeface normal = Typeface.createFromAsset(getContext().getAssets(), AppController.getInstance().getLightFontPath());
        setTypeface(normal, Typeface.NORMAL);
    }
}