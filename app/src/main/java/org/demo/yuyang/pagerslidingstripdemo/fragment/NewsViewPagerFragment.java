package org.demo.yuyang.pagerslidingstripdemo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import org.demo.yuyang.pagerslidingstripdemo.R;
import org.demo.yuyang.pagerslidingstripdemo.adapter.ViewPageFragmentAdapter;
import org.demo.yuyang.pagerslidingstripdemo.base.BaseViewPagerFragment;
import org.demo.yuyang.pagerslidingstripdemo.interf.OnTabReselectListener;

public class NewsViewPagerFragment extends BaseViewPagerFragment
        implements OnTabReselectListener {

    @Override
    protected void onSetupTabAdapter(ViewPageFragmentAdapter adapter) {
        String[] title = getResources().getStringArray(R.array.news_viewpage_arrays);
        adapter.addTab(title[0], "news", Fragment1.class, null);
        adapter.addTab(title[1], "news_week", Fragment2.class, null);
        adapter.addTab(title[2], "latest_blog", Fragment3.class, null);
        adapter.addTab(title[3], "recommend_blog", Fragment4.class, null);
    }

    private Bundle getBundle(int newType) {
        Bundle bundle = new Bundle();
        bundle.putInt("key", newType);
        return bundle;
    }

    private Bundle getBundle(String catalog) {
        Bundle bundle = new Bundle();
        bundle.putString("key2", catalog);
        return bundle;
    }

    @Override
    protected void setScreentPageLimit() {
        mViewPager.setOffscreenPageLimit(3);
    }

    @Override
    public void onTabReselect() {
        try {
            int currentIndex = mViewPager.getCurrentItem();
            Fragment currentFragment =
                    getChildFragmentManager().getFragments().get(currentIndex);
            if (currentFragment != null
                    && currentFragment instanceof OnTabReselectListener) {
                OnTabReselectListener listener = (OnTabReselectListener) currentFragment;
                listener.onTabReselect();
            }
        } catch (NullPointerException e) {

        }
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void initView(View view) {

    }

    @Override
    public void initData() {

    }
}
