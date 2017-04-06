package com.ghizzoniandrea.crashhunter;

import android.app.Activity;

public abstract class CrashListener {

    public abstract void onCrash(Throwable throwable, Activity activity);

    public void recover(Activity activity) {
        CrashHunter.recover(activity);
    }

}
