package com.example.basic_app_work;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.List;

import static java.util.Collections.sort;

public class MainActivity extends AppCompatActivity {


    String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            InputStream is = this.getAssets().open("hotels.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            String json = new String(buffer, "UTF-8");
            JSONObject reader = new JSONObject(json);
            String content1 = reader.getString("hotels");
            JSONArray jsonArray = new JSONArray(content1);
//            ----------------------------------------------------------------------------------
            RecyclerView recyclerView = findViewById(R.id.recyclerview);
            //ตั้งค่า Layout
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(layoutManager);

            final ArrayList<String> strings = new ArrayList<>();
            //ตั้งค่า Adapter
            Log.d(TAG, "JsonArray: " + jsonArray.length());
//            ----------------------------------------------------------------- sort -----------------------------------------------------------------
            int state=0;
            int check=0;
            try {
                Bundle StarRate = getIntent().getExtras();
                float StarforSort = StarRate.getFloat("StarforSort");
                float star2 = StarforSort;
                boolean checksort = StarRate.getBoolean("check");

                Log.d(TAG, "StarforSort: "+StarforSort+" : "+star2);


                    for (int i = 0; i <= jsonArray.length() - 1; i++){
                        JSONObject object1 = jsonArray.getJSONObject(i);
                        int starcheck = object1.getInt("star");
                        if (starcheck == star2){
                            String hotelName = object1.getString("hotelName");
                            strings.add(hotelName);
                            if (checksort){
                                Log.d(TAG, "checksort: "+checksort);
                                Collections.sort(strings);
                                                            }
                            Log.d(TAG, "Loop Recy Star: "+strings);

                            state=1;

                    }
                }

            } catch (Exception e) {


            }




//            --------------------------------------------------------------------------------------------------------------------------------------------
            if (state == 0) {
                try {
                    Log.d(TAG, "state 0 : ");
                    Bundle StarRate = getIntent().getExtras();
                    boolean checksort = StarRate.getBoolean("check");
                    check = 1;
                } catch (Exception e) {

                }
                    for (int i = 0; i <= jsonArray.length() - 1; i++) {


                        JSONObject object1 = jsonArray.getJSONObject(i);
                        String hotelName = object1.getString("hotelName");
                        strings.add(hotelName);
                        if (check == 1) {
                            Log.d(TAG, "checksortNOstar: ");
                            Collections.sort(strings);

                        }

//                    Log.d(TAG, "onCreate: " + i + strings);


                    }
                    Log.d(TAG, "endLoop: ");

            }
            MyRecyclerAdapter adapter = new MyRecyclerAdapter(strings);
            adapter.setItemClickListener(new MyRecyclerAdapter.ItemClickListener() {
                @Override
                public void onItemClick(int position) {
                    Log.d("test", "onItemClick: index = " + position);
                    Intent GoDetail = new Intent(MainActivity.this, HotelDetails.class);
                    GoDetail.putExtra("position", position);
                    startActivity(GoDetail);
                }
            });
            recyclerView.setAdapter(adapter);
        } catch (IOException e) {
        } catch (JSONException e) {
        }

//        ---------------------------------------------------------------------------------------------------------------
//        ----------------------------------Sort------------------------------------------------------------------------
        ImageView Sortbtn = findViewById(R.id.sortBtn);
        Sortbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goSort = new Intent(MainActivity.this, SortAndFilter.class);
                startActivity(goSort);
            }
        });


    }
}



