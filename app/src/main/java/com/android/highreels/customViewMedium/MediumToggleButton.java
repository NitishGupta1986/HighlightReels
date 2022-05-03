package com.android.highreels.customViewMedium;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatToggleButton;

import com.android.highreels.appController.AppController;

@SuppressLint("AppCompatCustomView")
public class MediumToggleButton extends AppCompatToggleButton {
    public MediumToggleButton(Context context) {
        super(context);
        setFont();
    }

    public MediumToggleButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }

    public MediumToggleButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFont();
    }

    private void setFont() {
        Typeface normal = Typeface.createFromAsset(getContext().getAssets(), AppController.getInstance().getMediumFontPath());
        setTypeface(normal, Typeface.NORMAL);
    }
}