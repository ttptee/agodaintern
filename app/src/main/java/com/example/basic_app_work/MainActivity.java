package com.example.basic_app_work;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try
        {
            InputStream is = this.getAssets().open("hotels.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            String json =  new String(buffer, "UTF-8");
//            Log.d(TAG, "onCreate: "+json);
//            JSONObject jsonArray = new JSONObject(json);
////            JSONArray jsonArray = new JSONArray(json);
////            JSONObject object1 = jsonArray.getJSONObject(1);
////            String content1 = object1.getString("hotels");
//            JSONObject object1 = jsonArray.getJSONObject("hotels");
//            Log.d(TAG, "onCreate: "+object1);
//            TextView test = findViewById(R.id.testJson);
            JSONObject reader = new JSONObject(json);
            Log.d(TAG, "onCreate: "+reader);
            String content1 = reader.getString("hotels");
            Log.d(TAG, "onCreate2: "+content1);
            JSONArray jsonArray = new JSONArray(content1);
            JSONObject object1 = jsonArray.getJSONObject(1);
            String id = object1.getString("id");
            Log.d(TAG, "ID : "+id);



            JSONObject hotel = reader.getJSONObject("id");

//            JSONObject object1 = hotel.getJSONArray(1);

//            test.setText(content1);
        }

        catch(IOException e){

        }
        catch (JSONException e){}

    }
}
