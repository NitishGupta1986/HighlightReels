package com.android.highreels.customViewBold;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatButton;

import com.android.highreels.appController.AppController;


@SuppressLint("AppCompatCustomView")
public class BoldButton extends AppCompatButton {
    public BoldButton(Context context) {
        super(context);
        setFont();
    }

    public BoldButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }

    public BoldButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFont();
    }

    private void setFont() {
        Typeface normal = Typeface.createFromAsset(getContext().getAssets(), AppController.getInstance().getBoldFontPath());
        setTypeface(normal, Typeface.NORMAL);
    }
}