package com.android.highreels.customViewMedium;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatButton;

import com.android.highreels.appController.AppController;


@SuppressLint("AppCompatCustomView")
public class MediumButton extends AppCompatButton {
    public MediumButton(Context context) {
        super(context);
        setFont();
    }

    public MediumButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }

    public MediumButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFont();
    }

    private void setFont() {
        Typeface normal = Typeface.createFromAsset(getContext().getAssets(), AppController.getInstance().getMediumFontPath());
        setTypeface(normal, Typeface.NORMAL);
    }
}