package org.demo.yuyang.pagerslidingstripdemo.base;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;

/**
 * Created by yuyang on 2/26/16.
 */
public class BaseApplication extends Application {
    private static String pref_name="creativelocker.pref";
    private static String last_refresh_time="last_refresh_time.pref";
    static Context _context;
    static Resources _resource;
    private static String lastToast="";
    private static long lastToastTime;

    private static boolean sIsAtLeastGB;

    static {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD) {
            sIsAtLeastGB = true;
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        _context=getApplicationContext();
        _resource = _context.getResources();
    }

    public static synchronized BaseApplication context() {
        return (BaseApplication) _context;
    }

    public static Resources resources() {
        return _resource;
    }

    public static void putReaderPostList(String preFileName, String key,
                                         String value) {
//        SharedPreferences preferences = get
    }
}
