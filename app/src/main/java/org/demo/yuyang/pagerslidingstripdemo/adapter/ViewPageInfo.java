package org.demo.yuyang.pagerslidingstripdemo.adapter;

import android.os.Bundle;

/**
 * Created by yuyang on 2/26/16.
 */
public class ViewPageInfo {

    public final String tag;
    public final Class<?> clz;
    public final Bundle args;
    public final String title;

    public ViewPageInfo(String _title, String _tag, Class<?> _class, Bundle _args) {
        title = _title;
        tag = _tag;
        clz = _class;
        args = _args;
    }
}
