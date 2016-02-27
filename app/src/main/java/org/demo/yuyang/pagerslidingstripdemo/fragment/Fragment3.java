package org.demo.yuyang.pagerslidingstripdemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.demo.yuyang.pagerslidingstripdemo.R;

/**
 * Created by yuyang on 2/27/16.
 */
public class Fragment3 extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragment, null);
        TextView text = (TextView) view.findViewById(R.id.fragment_text);

        text.setText("fragment #3");
        return view;
    }
}
