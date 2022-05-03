package com.android.highreels.customViewBold;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatEditText;

import com.android.highreels.appController.AppController;


@SuppressLint("AppCompatCustomView")
public class BoldEditText extends AppCompatEditText {
    public BoldEditText(Context context) {
        super(context);
        setFont();
    }

    public BoldEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }

    public BoldEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFont();
    }

    private void setFont() {
        Typeface normal = Typeface.createFromAsset(getContext().getAssets(), AppController.getInstance().getSemiBoldFontPath());
        setTypeface(normal);
    }
}