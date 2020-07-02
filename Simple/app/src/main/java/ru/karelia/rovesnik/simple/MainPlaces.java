package ru.karelia.rovesnik.simple;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainPlaces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_places);
    }

//    @Override
//    public  void onBackPressed(){
//        try {
//            Intent intent  = new Intent(MainPlaces.this, MainActivity.class);
//        } catch (Exception e){
//
//        }
//    }
}
