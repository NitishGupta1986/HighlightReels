package com.android.highreels.customViewRegular;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatButton;

import com.android.highreels.appController.AppController;


@SuppressLint("AppCompatCustomView")
public class RegularButton extends AppCompatButton {
    public RegularButton(Context context) {
        super(context);
        setFont();
    }

    public RegularButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }

    public RegularButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFont();
    }

    private void setFont() {
        Typeface normal = Typeface.createFromAsset(getContext().getAssets(), AppController.getInstance().getRegularFontPath());
        setTypeface(normal, Typeface.NORMAL);
    }
}