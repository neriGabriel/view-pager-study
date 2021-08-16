package com.example.onboarding2;

import java.io.Serializable;

public class OnboardItem implements Serializable {

    private String mTitle;
    private String mSubtitle;
    private String mToolTip;
    private MediaItem mAnimation;

    private OnboardItem(Builder builder) {
        mTitle = builder.title;
        mSubtitle = builder.subtitle;
        mToolTip = builder.tooltip;
        mAnimation = builder.animation;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmSubtitle() {
        return mSubtitle;
    }

    public void setmSubtitle(String mSubtitle) {
        this.mSubtitle = mSubtitle;
    }

    public String getmToolTip() {
        return mToolTip;
    }

    public void setmToolTip(String mToolTip) {
        this.mToolTip = mToolTip;
    }

    public MediaItem getmAnimation() {
        return mAnimation;
    }

    public void setmAnimation(MediaItem mAnimation) {
        this.mAnimation = mAnimation;
    }

    public static final class Builder {
        private String title;
        private String subtitle;
        private String tooltip;
        private MediaItem animation;


        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setSubtitle(String subtitle) {
            this.subtitle = subtitle;
            return this;
        }


        public Builder setTooltip(String tooltip) {
            this.tooltip = tooltip;
            return this;
        }


        public Builder setAnimation(MediaItem animation) {
            this.animation = animation;
            return this;
        }

        public final OnboardItem build() {
            return new OnboardItem(this);
        }
    }

    public static class MediaItem implements Serializable {
        public enum Type {
            NONE,
            DRAWABLE,
            ANIMATION
        }
        private Type mType;
        private int mAnimationId;

        public MediaItem(int mAnimationId, Type mType) {
            this.mType = mType;
            this.mAnimationId = mAnimationId;
        }

        public Type getmType() {
            return mType;
        }

        public void setmType(Type mType) {
            this.mType = mType;
        }

        public int getmAnimationId() {
            return mAnimationId;
        }

        public void setmAnimationId(int mAnimationId) {
            this.mAnimationId = mAnimationId;
        }
    }
}
