package com.example.rtc.somruethaianusa.animal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class DetailLIstView extends AppCompatActivity {

    //Explicit


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_view);

        try {

            GetAnimal getAnimal = new GetAnimal(DetailLIstView.this);
            getAnimal.execute();
            String strJSON = getAnimal.get();
            Log.d("21novV2", "JSoN ==> " + strJSON);

        } catch (Exception e) {
            Log.d("21novV2", "e onCreate ==> " + e.toString());
        }


    }   // Main Method

}   // Main Class
