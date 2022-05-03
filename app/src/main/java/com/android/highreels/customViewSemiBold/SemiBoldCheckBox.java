package com.android.highreels.customViewSemiBold;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatCheckBox;

import com.android.highreels.appController.AppController;


public class SemiBoldCheckBox extends AppCompatCheckBox {
    public SemiBoldCheckBox(Context context) {
        super(context);
        setFont();
    }

    public SemiBoldCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }

    public SemiBoldCheckBox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFont();
    }

    private void setFont() {
        Typeface normal = Typeface.createFromAsset(getContext().getAssets(), AppController.getInstance().getSemiBoldFontPath());
        setTypeface(normal, Typeface.NORMAL);
    }
}