package com.android.highreels.customViewMedium;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatCheckBox;

import com.android.highreels.appController.AppController;


@SuppressLint("AppCompatCustomView")
public class MediumCheckBox extends AppCompatCheckBox {
    public MediumCheckBox(Context context) {
        super(context);
        setFont();
    }

    public MediumCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }

    public MediumCheckBox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFont();
    }

    private void setFont() {
        Typeface normal = Typeface.createFromAsset(getContext().getAssets(), AppController.getInstance().getMediumFontPath());
        setTypeface(normal, Typeface.NORMAL);
    }
}