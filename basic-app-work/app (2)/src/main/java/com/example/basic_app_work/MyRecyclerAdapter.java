package com.example.basic_app_work;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.basic_app_work.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.Holder>{
    String TAG;

    private ArrayList<String> mDataSet;
    ItemClickListener mListener;

    public void setItemClickListener(ItemClickListener listener){
        mListener = listener;
    }

    public interface ItemClickListener{
        void onItemClick(int position);
    }

    public MyRecyclerAdapter(ArrayList<String> dataSet){
        mDataSet = dataSet;
        Log.d(TAG, "MyRecyclerAdapter: Test1");


    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_hotels,parent,false);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.setItem(position);
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    class Holder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textTitle;
        TextView textDescription;


        public Holder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            textTitle = itemView.findViewById(R.id.hotelName);


//            textDescription = itemView.findViewById(R.id.hotel_Index);
        }
        @Override
        public void onClick (View view){
            if(mListener!=null)
                mListener.onItemClick(getAdapterPosition());
        }

        public void setItem(int position){
            Log.d(TAG, "setItem: test2");
            textTitle.setText(mDataSet.get(position));
//            textDescription.setText("index = " + position);
        }

    }


}