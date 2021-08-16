package com.example.onboarding2;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public abstract class BaseFragment extends Fragment {

    TextView mTitle;
    TextView mSubtitle;
    TextView mToolTip;
    ViewPager2 mViewPager;
    List<Fragment> mFragmentList = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_base, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTitle = view.findViewById(R.id.title);
        mSubtitle = view.findViewById(R.id.subtitle);
        mViewPager = view.findViewById(R.id.view_pager);

        mViewPager.setAdapter(createFragmentStateAdapter());
        mViewPager.setClipToPadding(false);
        mViewPager.setClipChildren(false);
        mViewPager.setOffscreenPageLimit(3);

        CompositePageTransformer transformer = new CompositePageTransformer();
        transformer.addTransformer((page, position) -> {
            float a = 1- Math.abs(position);
            page.setScaleY(0.85f + a * 0.15f);
            page.setPadding(30,30,30,30);
        });

        mViewPager.setPageTransformer(transformer);
    }

    protected BaseViewPagerAdpter createFragmentStateAdapter() {
        return null;
    }

    static class BaseViewPagerAdpter extends FragmentStateAdapter {

        public final OnboardItem[] mList;
        private long baseId = 0;

        public BaseViewPagerAdpter(@NonNull Fragment fragment, OnboardItem[] list) {
            super(fragment);
            mList = list;
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
                return ViewPagerFragment.newInstance(mList[position]);
        }

        @Override
        public int getItemCount() {
            return mList.length;
        }

    }
}