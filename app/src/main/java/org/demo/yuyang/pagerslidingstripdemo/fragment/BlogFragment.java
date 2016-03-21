package org.demo.yuyang.pagerslidingstripdemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.demo.yuyang.pagerslidingstripdemo.R;
import org.demo.yuyang.pagerslidingstripdemo.bean.BlogList;

/**
 * Created by yuyang on 2/27/16.
 */
public class BlogFragment extends Fragment {
    private String mCatalog = "latest";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args = getArguments();
        if (args != null) {
            mCatalog = args.getString(NewsViewPagerFragment.BUNDLE_KEY_CATALOG);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_fragment, null);
        TextView text = (TextView) view.findViewById(R.id.fragment_text);

        switch (mCatalog) {
            case BlogList.CATALOG_LATEST:
                text.setText("BlogFragment # CATALOG_LATEST ");
                break;
            case BlogList.CATALOG_RECOMMEND:
                text.setText("BlogFragment # CATALOG_RECOMMEND");
                break;
            default:
                break;
        }

        return view;
    }
}
