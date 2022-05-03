package com.android.highreels.customViewBold;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

import com.android.highreels.appController.AppController;

@SuppressLint("AppCompatCustomView")
public class BoldTextView extends AppCompatTextView {
    public BoldTextView(Context context) {
        super(context);
        setFont();
    }

    public BoldTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }

    public BoldTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFont();
    }

    private void setFont() {
        Typeface normal = Typeface.createFromAsset(getContext().getAssets(), AppController.getInstance().getBoldFontPath());
        setTypeface(normal, Typeface.NORMAL);
    }
}