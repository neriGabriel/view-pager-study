package com.example.onboarding2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BananaFragment extends BaseFragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTitle.setText(R.string.title);
        mSubtitle.setText(R.string.subtitle);
    }

    @Override
    protected BaseViewPagerAdpter createFragmentStateAdapter() {
        return new BaseViewPagerAdpter(this, OnboardItemFactory.getListBanana());
    }

}