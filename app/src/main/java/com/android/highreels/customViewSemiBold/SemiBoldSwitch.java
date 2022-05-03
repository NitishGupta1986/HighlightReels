package com.android.highreels.customViewSemiBold;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.SwitchCompat;

import com.android.highreels.appController.AppController;

@SuppressLint("AppCompatCustomView")
public class SemiBoldSwitch extends SwitchCompat {
    public SemiBoldSwitch(Context context) {
        super(context);
        setFont();
    }

    public SemiBoldSwitch(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }

    public SemiBoldSwitch(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFont();
    }

    private void setFont() {
        Typeface normal = Typeface.createFromAsset(getContext().getAssets(), AppController.getInstance().getSemiBoldFontPath());
        setTypeface(normal, Typeface.NORMAL);
    }
}