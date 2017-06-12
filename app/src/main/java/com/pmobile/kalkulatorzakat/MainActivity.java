package com.pmobile.kalkulatorzakat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

   private ImageButton btnFitrah,btnProfesi,btnMal,btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Klik Fitrah
        btnFitrah = (ImageButton) findViewById(R.id.btnFitrah);
        btnFitrah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Fitrah.class);
                startActivity(intent);
            }
        });

        //Klik Ptofesi
        btnProfesi = (ImageButton) findViewById(R.id.btnProfesi);
        btnProfesi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Profesi.class);
                startActivity(intent);
            }
        });

        //Klik Mal
        btnMal = (ImageButton) findViewById(R.id.btnMal);
        btnMal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Mal.class);
                startActivity(intent);
            }
        });

        //Klik About
        btnAbout = (ImageButton) findViewById(R.id.btnAbout);
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
            }
        });
    }
}
