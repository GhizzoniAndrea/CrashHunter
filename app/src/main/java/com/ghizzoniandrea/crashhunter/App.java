package com.ghizzoniandrea.crashhunter;

import android.app.Activity;
import android.app.Application;
import android.widget.Toast;

/**
 * Created by ghizzoniandrea on 2017/4/5.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CrashHunter.install(this, new CrashListener() {

            @Override
            public void onCrash(Throwable throwable, final Activity activity) {
                Toast.makeText(activity, "抱歉，应用即将关闭！", Toast.LENGTH_SHORT).show();
                recover(activity);
            }
        });
    }
}
