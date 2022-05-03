package com.android.highreels.customViewBold;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatRadioButton;

import com.android.highreels.appController.AppController;


@SuppressLint("AppCompatCustomView")
public class BoldRadioButton extends AppCompatRadioButton {
    public BoldRadioButton(Context context) {
        super(context);
        setFont();
    }

    public BoldRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }

    public BoldRadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFont();
    }

    private void setFont() {
        Typeface normal = Typeface.createFromAsset(getContext().getAssets(), AppController.getInstance().getBoldFontPath());
        setTypeface(normal, Typeface.NORMAL);
    }
}