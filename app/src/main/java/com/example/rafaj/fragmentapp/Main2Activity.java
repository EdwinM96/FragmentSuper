package com.example.rafaj.fragmentapp;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
public class Main2Activity extends AppCompatActivity {
    TextView text;
    TextView text2;
    ImageView image;
    Resources res;
    int imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text = findViewById(R.id.texto1);
        text2 = findViewById(R.id.texto2);
        image = findViewById(R.id.imagen_persona);

        Intent callingIntent = getIntent();
        Bundle bundle = callingIntent.getExtras();

        Persona persona = (Persona)bundle.getSerializable("lolazo");
        //res = getResources();
        //Context context = this.getBaseContext();
        //imagen = getResources().getIdentifier(persona.getImagen(), "drawable", getPackageName());
        //TypedArray icons = res.obtainTypeArray(R.array.)
         // Drawable imagenPersona = context.getResources().getDrawable(imagen);
        setImagen(persona.getImagen());
        text.setText(persona.getNombre());
        text2.setText(persona.getEdad());



    }
    public void setImagen(String i){
        if (i.equals("0")){
        image.setImageResource(R.drawable.ahri_cosplay);
        }
        if(i.equals("1")){
        image.setImageResource(R.drawable.braum_splash);
        }
        if(i.equals("2")){
        image.setImageResource(R.drawable.kaisa_splash);
        }
        if(i.equals("3")){
        image.setImageResource(R.drawable.missfortune_splash);
        }
        if(i.equals("4")){
        image.setImageResource(R.drawable.orianna_splash);
        }
        if(i.equals("5")){
        image.setImageResource(R.drawable.rengar_splash);
        }
        if(i.equals("6")){
        image.setImageResource(R.drawable.sona_splash);
        }

}
}
