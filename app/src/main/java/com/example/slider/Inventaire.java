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
            if (Modele.canAddHat2On == false) {
                Switch sw2Hat = findViewById(R.id.switchHat2);
                sw2Hat.setClickable(false);
                sw2Hat.setChecked(true);
                ImageView imgv2Hat = findViewById(R.id.imageViewHat2);
                imgv2Hat.setImageResource(R.drawable.hat2);
                sw2Hat.setText("Disponible");
            }
            if (Modele.canAddTorso2On == false) {
                Switch sw2Torso = findViewById(R.id.switchTorso2);
                sw2Torso.setClickable(false);
                sw2Torso.setChecked(true);
                ImageView imgv2Torso = findViewById(R.id.imageViewTorso2);
                imgv2Torso.setImageResource(R.drawable.torso2);
                sw2Torso.setText("Disponible");
            }
    }

    public void versPersonnage (View view) {
        Intent intent = new Intent(Inventaire.this, Personnage.class);
        Inventaire.this.startActivity(intent);
    }

    public void onHat2 (View view) {
            if (Modele.canAddHat2On == true) {
                Modele.canAddHat2On = false;
                Switch sw2Hat = findViewById(R.id.switchHat2);
                sw2Hat.setClickable(false);
                ImageView imgv2Hat = findViewById(R.id.imageViewHat2);
                imgv2Hat.setImageResource(R.drawable.hat2);
                sw2Hat.setText("Disponible");
                Personnage.HataddElement(R.drawable.hat2);
            }
    }

    public void onTorso2 (View view) {
            if (Modele.canAddTorso2On == true) {
                Modele.canAddTorso2On = false;
                Switch sw2Torso = findViewById(R.id.switchTorso2);
                sw2Torso.setClickable(false);
                ImageView imgv2Torso = findViewById(R.id.imageViewTorso2);
                imgv2Torso.setImageResource(R.drawable.torso2);
                sw2Torso.setText("Disponible");
                Personnage.TorsoaddElement(R.drawable.torso2);
            }
    }

}
