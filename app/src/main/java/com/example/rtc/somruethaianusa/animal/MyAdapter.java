package com.example.rtc.somruethaianusa.animal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by masterUNG on 11/21/2016 AD.
 */

public class MyAdapter extends BaseAdapter{

    //Explicit
    private Context context;
    private String[] titleStrings, imageStrings, detailStrings;
    private TextView titleTextView, detailTextView;
    private ImageView imageView;

    public MyAdapter(Context context,
                     String[] titleStrings,
                     String[] imageStrings,
                     String[] detailStrings) {
        this.context = context;
        this.titleStrings = titleStrings;
        this.imageStrings = imageStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        //Bind Widget
        titleTextView = (TextView) view1.findViewById(R.id.textView6);
        detailTextView = (TextView) view1.findViewById(R.id.textView7);
        imageView = (ImageView) view1.findViewById(R.id.imageView);

        //Show View
        titleTextView.setText(titleStrings[i]);
        detailTextView.setText(detailStrings[i]);
        Picasso.with(context).load(imageStrings[i]).into(imageView);

        return view1;
    }
}   // Main Class
