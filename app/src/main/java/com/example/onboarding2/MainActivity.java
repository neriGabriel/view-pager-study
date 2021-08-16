package com.example.onboarding2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    FrameLayout mFragmentContainer;
    Button mNextButton;
    Button mPreviousButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFragmentContainer = findViewById(R.id.fragment_content);
        mNextButton = findViewById(R.id.button_primary);
        mPreviousButton = findViewById(R.id.button_secondary);

        //temporary
        GolfinhoFragment newFragment = new GolfinhoFragment();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_content, newFragment)
                .commit();

        mNextButton.setOnClickListener(v -> {
            BananaFragment newBananaFragment = new BananaFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_content, newBananaFragment)
                    .commit();
            mPreviousButton.setVisibility(View.VISIBLE);
        });

        mPreviousButton.setOnClickListener(v -> {
            GolfinhoFragment newGolfinhoFragment = new GolfinhoFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_content, newGolfinhoFragment)
                    .commit();
            mPreviousButton.setVisibility(View.GONE);
        });
    }
}