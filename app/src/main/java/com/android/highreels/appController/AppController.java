package com.android.highreels.appController;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import androidx.multidex.MultiDex;
import androidx.multidex.MultiDexApplication;

import com.android.highreels.sharedPrefs.SimpleSharedPreferences;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppController extends MultiDexApplication {

    public static ProgressDialog progress;
    private static AppController mInstance;
    private final String fontPathPrefix = "fonts/";
    private final String fontExtension = ".ttf";
    private final String fontFamily = "poppins_";
    private final String regularFontPath = fontPathPrefix + fontFamily + "regular" + fontExtension;
    private final String boldFontPath = fontPathPrefix + fontFamily + "bold" + fontExtension;
    private final String semiBoldFontPath = fontPathPrefix + fontFamily + "semi_bold" + fontExtension;
    private final String lightFontPath = fontPathPrefix + fontFamily + "light" + fontExtension;
    private final String mediumFontPath = fontPathPrefix + fontFamily + "medium" + fontExtension;
    SimpleSharedPreferences simpleSharedPreferences;

    public static synchronized AppController getInstance() {
        return mInstance;
    }

    public static boolean emailValidator(String email) {
        final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void hideSoftKeyboard(Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Find the currently focused view, so we can grab the correct window token from it.
        View view = activity.getCurrentFocus();
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = new View(activity);
        }
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void showKeyboard(Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(activity.getCurrentFocus(), InputMethodManager.SHOW_IMPLICIT);
    }

    public static void showProgressDialog(Context context, String Message) {
        progress = new ProgressDialog(context);
        progress.setMessage(Message);
        progress.setCancelable(false);
        progress.setCanceledOnTouchOutside(false);
        progress.show();
    }

    public static void hideProgressDialog() {
        if (progress != null && progress.isShowing()) {
            progress.hide();
            progress.cancel();
        }
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(base);
    }

    public String getRegularFontPath() {
        return regularFontPath;
    }

    public String getSemiBoldFontPath() {
        return semiBoldFontPath;
    }

    public String getBoldFontPath() {
        return boldFontPath;
    }

    public String getLightFontPath() {
        return lightFontPath;
    }

    public String getMediumFontPath() {
        return mediumFontPath;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        simpleSharedPreferences = SimpleSharedPreferences.initialize(this);
        //sharedPreferences = getApplicationContext().getSharedPreferences("superMarket", Context.MODE_PRIVATE);
        mInstance = this;
    }

//    public void saveString(String key, String value) {
//        editor = sharedPreferences.edit();
//        editor.putString(key, value);
//        editor.apply();
//    }

//    public String getString(String key) {
//        return sharedPreferences.getString(key, "");
//    }
}