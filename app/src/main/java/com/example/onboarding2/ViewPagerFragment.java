package com.example.onboarding2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ViewPagerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ViewPagerFragment extends Fragment {


    private static final String AGR_ITEM =  "onboardItem";

    private OnboardItem mOnboardItem;

    LottieAnimationView mAnimationView;
    TextView mTooltip;
    Button mButtonFirstOption;
    Button mButtonSecondOption;

    public static ViewPagerFragment newInstance(OnboardItem onboardItem) {
        ViewPagerFragment fragment = new ViewPagerFragment();
        Bundle args = new Bundle();
        args.putSerializable(AGR_ITEM, onboardItem);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mOnboardItem = (OnboardItem) getArguments().get(AGR_ITEM);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_view_pager, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mAnimationView = view.findViewById(R.id.animationView);
        mTooltip = view.findViewById(R.id.tool_tip);
        mButtonFirstOption = view.findViewById(R.id.first_option);
        mButtonSecondOption = view.findViewById(R.id.second_option);

        mAnimationView.setAnimation(mOnboardItem.getmAnimation().getmAnimationId());
        mAnimationView.playAnimation();

        mTooltip.setText(mOnboardItem.getmToolTip());
    }
}