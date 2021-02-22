package com.example.slider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class Inventaire extends AppCompatActivity {
        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventaire);
    }

    public void versPersonnage (View view) {
        Intent intent = new Intent(Inventaire.this, Personnage.class);
        Inventaire.this.startActivity(intent);
    }

    public void onHat2 (View view) {
            Switch sw2 = findViewById(R.id.switchHat2);
            ImageView imgv2 = findViewById(R.id.imageViewHat2);
            imgv2.setImageResource(R.drawable.hat2);
            sw2.setText("Disponible");
            sw2.setClickable(false);
            Personnage.HataddElement(R.drawable.hat2);
    }

    public void onTorso2 (View view) {
            Switch sw2 = findViewById(R.id.switchTorso2);
            ImageView imgv2 = findViewById(R.id.imageViewTorso2);
            imgv2.setImageResource(R.drawable.torso2);
            sw2.setText("Disponible");
            sw2.setClickable(false);
            Personnage.TorsoaddElement(R.drawable.torso2);
    }

}
