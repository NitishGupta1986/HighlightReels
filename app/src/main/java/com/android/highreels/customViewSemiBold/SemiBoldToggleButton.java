package com.android.highreels.customViewSemiBold;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatToggleButton;

import com.android.highreels.appController.AppController;

@SuppressLint("AppCompatCustomView")
public class SemiBoldToggleButton extends AppCompatToggleButton {
    public SemiBoldToggleButton(Context context) {
        super(context);
        setFont();
    }

    public SemiBoldToggleButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }

    public SemiBoldToggleButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFont();
    }

    private void setFont() {
        Typeface normal = Typeface.createFromAsset(getContext().getAssets(), AppController.getInstance().getSemiBoldFontPath());
        setTypeface(normal, Typeface.NORMAL);
    }
}