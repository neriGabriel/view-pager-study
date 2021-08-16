package com.example.onboarding2;

public class OnboardItemFactory {

    public static final OnboardItem.Builder DOLPHIN = new OnboardItem.Builder()
            .setTitle("Dolphin")
            .setSubtitle("Dolphin subtitle")
            .setTooltip("Tooltip Dolphin")
            .setAnimation(new OnboardItem.MediaItem(R.raw.teste,
                    OnboardItem.MediaItem.Type.ANIMATION));

    public static final OnboardItem.Builder DOLPHIN_2 = new OnboardItem.Builder()
            .setTitle("Dolphin2")
            .setSubtitle("Dolphin subtitle2")
            .setTooltip("Tooltip Dolphin2")
            .setAnimation(new OnboardItem.MediaItem(R.raw.angry_banana,
                    OnboardItem.MediaItem.Type.ANIMATION));

    public static final OnboardItem.Builder BANANA = new OnboardItem.Builder()
            .setTitle("Banana")
            .setSubtitle("Banana subtitle")
            .setTooltip("Tooltip Banana")
            .setAnimation(new OnboardItem.MediaItem(R.raw.banana,
                    OnboardItem.MediaItem.Type.ANIMATION));

    public static final OnboardItem.Builder BANANA_2 = new OnboardItem.Builder()
            .setTitle("Banana2")
            .setSubtitle("Banana2 subtitle")
            .setTooltip("Tooltip Banana2")
            .setAnimation(new OnboardItem.MediaItem(R.raw.angry_banana,
                    OnboardItem.MediaItem.Type.ANIMATION));

    public static final OnboardItem[] getListDolphin() {
        OnboardItem[] items = new OnboardItem[2];
        items[0] = DOLPHIN.build();
        items[1] = DOLPHIN_2.build();

        return items;
    }

    public static final OnboardItem[] getListBanana() {
        OnboardItem[] items = new OnboardItem[2];
        items[0] = BANANA.build();
        items[1] = BANANA_2.build();

        return items;
    }
}
