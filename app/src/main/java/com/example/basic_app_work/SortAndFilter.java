package com.example.basic_app_work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Switch;

public class SortAndFilter extends AppCompatActivity {
String TAG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort_and_filter);
        final RatingBar ratingBar = findViewById(R.id.ratingStar);
        Button ShowSort = findViewById(R.id.showSort);
        ImageView Closebtn = findViewById(R.id.closeBtn);
        final Switch switchSort = findViewById(R.id.switchSortName);



        Closebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent close = new Intent(SortAndFilter.this,MainActivity.class);
                startActivity(close);
            }
        });
        ShowSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (switchSort.isChecked()){
                    Log.d(TAG, "check: "+switchSort.isChecked());
                    Log.d(TAG, "Star : " + ratingBar.getRating());
                    Intent sendStar = new Intent(SortAndFilter.this, MainActivity.class);
                    sendStar.putExtra("StarforSort", ratingBar.getRating());
                    sendStar.putExtra("check", switchSort.isChecked());
                    startActivity(sendStar);
                }
                else {
                    Log.d(TAG, "Star : " + ratingBar.getRating());
                    Intent sendStar = new Intent(SortAndFilter.this, MainActivity.class);
                    sendStar.putExtra("StarforSort", ratingBar.getRating());
                    startActivity(sendStar);
                }
            }
        });
    }
}
