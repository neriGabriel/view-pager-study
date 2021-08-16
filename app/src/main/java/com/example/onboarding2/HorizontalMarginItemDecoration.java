package com.example.onboarding2;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HorizontalMarginItemDecoration extends RecyclerView.ItemDecoration {

    private Context mContext;
    private int mHorizontalMarginInDp;
    private int mHorizontalMarginInPx;

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.right = mHorizontalMarginInPx;
        outRect.left = mHorizontalMarginInPx;
    }

    public HorizontalMarginItemDecoration(Context context, @DimenRes int horizontalMarginInDp)  {
        mContext = context;
        mHorizontalMarginInDp = horizontalMarginInDp;
        mHorizontalMarginInPx = (int) mContext.getResources().getDimension(mHorizontalMarginInDp);


    }
}
