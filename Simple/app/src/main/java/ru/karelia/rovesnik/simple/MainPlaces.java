package ru.karelia.rovesnik.simple;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class MainPlaces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_places);

        Button tetris_button = (Button)findViewById(R.id.button_tetris);

        tetris_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent  = new Intent(MainPlaces.this, Tetris.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
            }
        });

    }

//    @Override
//    public  void onBackPressed(){
//        try {
//            Intent intent  = new Intent(MainPlaces.this, MainActivity.class);
//        } catch (Exception e){
//
//        }
//    }
    //Button  o  fusion

}
