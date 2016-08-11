package com.sayem.android.coloringbuttons;

import android.content.res.ColorStateList;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.content.res.AppCompatResources;

import com.sayem.android.coloringbuttons.databinding.TestLayoutBinding;

public class MainActivity extends AppCompatActivity {


    TestLayoutBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.test_layout);

        ColorStateList backgroundTintList = AppCompatResources.getColorStateList(this,R.color.btn_colored_background_tint);
        ViewCompat.setBackgroundTintList(binding.programTintingButton,backgroundTintList);

        ViewCompat.setBackgroundTintList(binding.program2TintingButton,
                BackgroundTints.forColoredButton(this,getResources().getColor(R.color.googleRed500)));
    }
}
