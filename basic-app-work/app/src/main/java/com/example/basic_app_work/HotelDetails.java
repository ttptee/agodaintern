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
        Bundle indexHotle = getIntent().getExtras();

        String Hotellist = indexHotle.getString("stringsHotel");
        String Arealist = indexHotle.getString("StringArea");
        String Starlist = indexHotle.getString("StringStar");
        String Roomlist = indexHotle.getString("StringRoom");



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
           Log.d(TAG, "content1: "+content1);
            JSONArray jsonArray = new JSONArray(content1);



                    String HotelName = Hotellist;
                    String Area = Arealist;
                    String Star = Starlist;
                    String Room = Roomlist;

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

