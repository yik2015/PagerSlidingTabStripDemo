package org.demo.yuyang.pagerslidingstripdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.demo.yuyang.pagerslidingstripdemo.widget.PagerSlidingTabStrip;
import org.demo.yuyang.pagerslidingstripdemo.R;
import org.demo.yuyang.pagerslidingstripdemo.adapter.ViewPageFragmentAdapter;

/**
 * Created by yuyang on 2/26/16.
 */
public abstract class BaseViewPagerFragment extends BaseFragment {

    protected PagerSlidingTabStrip mTabStrip;
    protected ViewPager mViewPager;
    protected ViewPageFragmentAdapter mTabsAdapter;
//    protected EmptyLayout mErrorLayouto;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.base_viewpage_fragment, null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        mTabStrip = (PagerSlidingTabStrip) view.findViewById(R.id.pager_tabstrip);
        mViewPager = (ViewPager) view.findViewById(R.id.pager);
        mTabsAdapter = new ViewPageFragmentAdapter(getChildFragmentManager(),
                mTabStrip, mViewPager);

        setScreentPageLimit();

        onSetupTabAdapter(mTabsAdapter);
    }

    protected abstract void onSetupTabAdapter(ViewPageFragmentAdapter adapter);

    protected void setScreentPageLimit() {

    }
}
