package com.example.basic_app_work;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class HotelDetails extends AppCompatActivity {

   String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels_details);
        ImageView Back = findViewById(R.id.backbtn);
//        ----------------------------------------back -------------------------------------------------------
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Goback =  new Intent(HotelDetails.this, MainActivity.class);
                startActivity(Goback);
            }
        });

//
        Bundle extras = getIntent().getExtras();
        int position = extras.getInt("position");

//        Log.d(TAG, "onCreate: "+position);
//        --------------------------------------------------------------------------------------------------------------------------------------------------------------

        try
        {
            InputStream is = this.getAssets().open("hotels.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            String json =  new String(buffer, "UTF-8");
            JSONObject reader = new JSONObject(json);
            String content1 = reader.getString("hotels");
            JSONArray jsonArray = new JSONArray(content1);

            //ตั้งค่า Layout



            //ตั้งค่า Adapter
            Log.d(TAG, "JsonArrat: "+jsonArray.length());



                JSONObject object1 = jsonArray.getJSONObject(position);
                String HotelName = object1.getString("hotelName");
                String Area = object1.getString("area");
                String Star = object1.getString("star");
                String Room = object1.getString("numberOfRoom");

                TextView HotelText = findViewById(R.id.ShowHotelName);
                TextView AreaText = findViewById(R.id.ShowHotelArea);
                TextView StarText = findViewById(R.id.ShowHotelStar);
                TextView RoomText = findViewById(R.id.ShowHotelRoom);
                HotelText.setText(HotelName);
                AreaText.setText(Area);
                StarText.setText(Star);
                RoomText.setText(Room);







//            JSONObject object1 = hotel.getJSONArray(1);

//            test.setText(content1);
        }

        catch(IOException e){

        }
        catch (JSONException e){}




    }

    }

