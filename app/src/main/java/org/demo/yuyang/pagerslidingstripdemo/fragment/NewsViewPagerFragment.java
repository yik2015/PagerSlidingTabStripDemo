package org.demo.yuyang.pagerslidingstripdemo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import org.demo.yuyang.pagerslidingstripdemo.R;
import org.demo.yuyang.pagerslidingstripdemo.adapter.ViewPageFragmentAdapter;
import org.demo.yuyang.pagerslidingstripdemo.base.BaseViewPagerFragment;
import org.demo.yuyang.pagerslidingstripdemo.bean.BlogList;
import org.demo.yuyang.pagerslidingstripdemo.bean.NewsList;
import org.demo.yuyang.pagerslidingstripdemo.interf.OnTabReselectListener;

public class NewsViewPagerFragment extends BaseViewPagerFragment
        implements OnTabReselectListener {

    public static final String BUNDLE_KEY_CATALOG = "BUNDLE_KEY_CATALOG";

    @Override
    protected void onSetupTabAdapter(ViewPageFragmentAdapter adapter) {
        String[] title = getResources().getStringArray(R.array.news_viewpage_arrays);
        adapter.addTab(title[0], "news", NewsFragment.class,
                getBundle(NewsList.CATALOG_ALL));
        adapter.addTab(title[1], "news_week", NewsFragment.class,
                getBundle(NewsList.CATALOG_WEEK));

        adapter.addTab(title[2], "latest_blog", BlogFragment.class,
                getBundle(BlogList.CATALOG_LATEST));
        adapter.addTab(title[3], "recommend_blog", BlogFragment.class,
                getBundle(BlogList.CATALOG_RECOMMEND));
    }

    private Bundle getBundle(int newType) {
        Bundle bundle = new Bundle();
        bundle.putInt(BUNDLE_KEY_CATALOG, newType);
        return bundle;
    }

    private Bundle getBundle(String catalog) {
        Bundle bundle = new Bundle();
        bundle.putString(BUNDLE_KEY_CATALOG, catalog);
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
