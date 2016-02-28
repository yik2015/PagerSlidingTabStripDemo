package org.demo.yuyang.pagerslidingstripdemo.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import org.demo.yuyang.pagerslidingstripdemo.widget.PagerSlidingTabStrip;
import org.demo.yuyang.pagerslidingstripdemo.R;

import java.util.ArrayList;

public class ViewPageFragmentAdapter extends FragmentStatePagerAdapter {


    private final Context mContext;
    protected PagerSlidingTabStrip mPagerStrip;
    private final ViewPager mViewPager;
    private final ArrayList<ViewPageInfo> mTabs = new ArrayList<>();

    public ViewPageFragmentAdapter(FragmentManager fm, PagerSlidingTabStrip pageStrip,
                                   ViewPager pager) {
        super(fm);
        mContext = pager.getContext();
        mPagerStrip = pageStrip;

        mViewPager = pager;
        mViewPager.setAdapter(this);
        mPagerStrip.setViewPager(mViewPager);
    }

    public void addTab(String title, String tag, Class<?> clz, Bundle args) {
        ViewPageInfo viewPageInfo = new ViewPageInfo(title, tag, clz, args);
        addFragment(viewPageInfo);
    }

    private void addFragment(ViewPageInfo info) {
        if(info == null) return;

        View v = LayoutInflater.from(mContext).inflate(
                R.layout.base_viewpage_fragment_tab_item, null, false);

        TextView title = (TextView) v.findViewById(R.id.tab_title);
        title.setText(info.title);

        // add tab's view.
        mPagerStrip.addTab(v);

        mTabs.add(info);

        notifyDataSetChanged();
    }

    public void remove() {
        remove(0);
    }

    public void remove(int index) {
        if (mTabs.isEmpty()) return;

        if (index < 0) index = 0;
        if (index > mTabs.size()) index = mTabs.size() - 1;

        mTabs.remove(index);
        mPagerStrip.removeTab(index, 1);

        notifyDataSetChanged();
    }

    public void removeAll() {
        if (mTabs.isEmpty()) return;

        mPagerStrip.removeAllTab();

        mTabs.clear();

        notifyDataSetChanged();
    }

    @Override
    public Fragment getItem(int position) {
        ViewPageInfo info = mTabs.get(position);
        return Fragment.instantiate(mContext, info.clz.getName(), info.args);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabs.get(position).title;
    }

    @Override
    public int getItemPosition(Object object) {
        return PagerAdapter.POSITION_NONE;
    }

    @Override
    public int getCount() {
        return mTabs.size();
    }
}
