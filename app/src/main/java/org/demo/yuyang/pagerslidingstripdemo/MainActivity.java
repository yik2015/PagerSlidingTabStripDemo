package org.demo.yuyang.pagerslidingstripdemo;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.demo.yuyang.pagerslidingstripdemo.fragment.NewsViewPagerFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        NewsViewPagerFragment fragment = new NewsViewPagerFragment();
        transaction.add(R.id.fragment_container, fragment);
        transaction.commit();
    }
}
