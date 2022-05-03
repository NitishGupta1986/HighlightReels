package com.android.highreels.customViewSemiBold;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

import com.android.highreels.appController.AppController;

public class SemiBoldTextView extends AppCompatTextView {
    public SemiBoldTextView(Context context) {
        super(context);
        setFont();
    }

    public SemiBoldTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
    }

    public SemiBoldTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFont();
    }

    private void setFont() {
        Typeface normal = Typeface.createFromAsset(getContext().getAssets(), AppController.getInstance().getSemiBoldFontPath());
        setTypeface(normal, Typeface.NORMAL);
    }
}