package com.example.base2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        ImageSlider imageSlider = findViewById(R.id.imageSlider);
        ArrayList<SlideModel> slideModel = new ArrayList<>();

        slideModel.add(new SlideModel(R.drawable.melissa, ScaleTypes.FIT));
        slideModel.add(new SlideModel(R.drawable.paras, ScaleTypes.FIT));
        slideModel.add(new SlideModel(R.drawable.ola, ScaleTypes.FIT));
        slideModel.add(new SlideModel(R.drawable.nathan, ScaleTypes.FIT));

        imageSlider.setImageList(slideModel, ScaleTypes.FIT);
    }
}