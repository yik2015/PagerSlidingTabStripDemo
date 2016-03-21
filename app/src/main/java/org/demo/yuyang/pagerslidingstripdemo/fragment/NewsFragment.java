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
public class NewsFragment extends Fragment {
    protected int mCatalog = 1;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        if (args != null) {
            mCatalog = args.getInt(NewsViewPagerFragment.BUNDLE_KEY_CATALOG);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragment, null);
        TextView text = (TextView) view.findViewById(R.id.fragment_text);

        switch (mCatalog) {
            case NewsList.CATALOG_ALL:text.setText("NewsFragment # CATALOG_ALL");
                break;
            case NewsList.CATALOG_WEEK:text.setText("NewsFragment # CATALOG_WEEK");
        }

        return view;
    }
}
