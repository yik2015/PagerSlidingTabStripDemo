package org.demo.yuyang.pagerslidingstripdemo.interf;

import android.app.ProgressDialog;

/**
 * Created by yuyang on 2/26/16.
 */
public interface DialogControl {

    void hideWaitDialog();

    ProgressDialog showWaitDialog();

    ProgressDialog showWaitDialog(int resId);

    ProgressDialog showWaitDialog(String text);
}
