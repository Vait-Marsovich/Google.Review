package ru.karelia.rovesnik.simple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonStart = (Button)findViewById(R.id.Start_Button);

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Intent intent  = new Intent(MainActivity.this, MainPlaces.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e) {

                }
            }
        });
    }
}
