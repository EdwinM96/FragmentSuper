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
        res = getResources();
        Context context = this.getBaseContext();
        imagen = getResources().getIdentifier(persona.getImagen(), "drawable", getPackageName());
        //TypedArray icons = res.obtainTypeArray(R.array.)
       // Drawable imagenPersona = context.getResources().getDrawable(imagen);
        image.setImageResource(imagen);
        text.setText(persona.getNombre());
        text2.setText(persona.getEdad());



    }


}
