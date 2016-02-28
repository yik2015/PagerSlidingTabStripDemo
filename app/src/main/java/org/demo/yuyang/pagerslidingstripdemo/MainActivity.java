package org.demo.yuyang.pagerslidingstripdemo;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import org.demo.yuyang.pagerslidingstripdemo.fragment.NewsViewPagerFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        NewsViewPagerFragment fragment = new NewsViewPagerFragment();

        transaction.add(R.id.fragment_container, fragment);
        transaction.commit();
    }
}
