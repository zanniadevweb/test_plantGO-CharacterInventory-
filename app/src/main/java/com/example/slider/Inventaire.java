package com.example.slider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Inventaire extends AppCompatActivity {
        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventaire);

        /*
            Switch swi = (Switch) findViewById(R.id.switchHat2);
            swi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
            {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) //Line A
                {
                    if (isChecked) {
                        ImageView imgv2 = findViewById(R.id.imageViewHat2);
                        imgv2.setImageResource(R.drawable.hat2);
                    }

                }
            });
       */
    }

    public void versPersonnage (View view) {
        Intent intent = new Intent(Inventaire.this, Personnage.class);
        Inventaire.this.startActivity(intent);
    }

    public void onHat2 (View view) {
        boolean switchHat2On = false;

        if (switchHat2On == false) {
            Switch sw2 = findViewById(R.id.switchHat2);
            TextView tv2 = findViewById(R.id.textViewHat2);
            ImageView imgv2 = findViewById(R.id.imageViewHat2);
            imgv2.setImageResource(R.drawable.hat2);
            sw2.setText("Disponible");
            sw2.setClickable(false);
            //switchHat2On = true;

        }
    }

    public void onTorso2 (View view) {
        boolean switchTorso2On = false;

        if (switchTorso2On == false) {
            Switch sw2 = findViewById(R.id.switchTorso2);
            ImageView imgv2 = findViewById(R.id.imageViewTorso2);
            imgv2.setImageResource(R.drawable.torso2);
            sw2.setText("Disponible");
            sw2.setClickable(false);
            //switchTorso2O = true;

        }
    }

}
