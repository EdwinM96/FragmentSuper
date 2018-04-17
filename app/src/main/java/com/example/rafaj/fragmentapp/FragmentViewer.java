package com.example.rafaj.fragmentapp;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.Intent.getIntent;

/**
 * Created by rafaj on 8/4/2018.
 */

public class FragmentViewer extends Fragment {
    TextView text;
    ImageView imagen;
    TextView text2;
    Persona persona;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.viewer_fragment, container, false);

        text = view.findViewById(R.id.textId);
        text2 = view.findViewById(R.id.textId2);
        imagen = view.findViewById(R.id.imageId);
        persona = (Persona)getArguments().getSerializable("lolazo");

        if(persona != null){
            text.setText(persona.getNombre());
            text2.setText(persona.getEdad());
            setImagen(persona.getImagen());
        }



        /*if(bundle != null){
            Toast.makeText(getActivity(), "Item: " + bundle.getString("KEY"), Toast.LENGTH_SHORT).show();

            text.setText(bundle.getString("KEY"));

        }*/

        return view;
    }

    public void setImagen(String i){
        if (i.equals("0")){
        imagen.setImageResource(R.drawable.ahri_cosplay);
        }
        if(i.equals("1")){
        imagen.setImageResource(R.drawable.braum_splash);
        }
        if(i.equals("2")){
        imagen.setImageResource(R.drawable.kaisa_splash);
        }
        if(i.equals("3")){
        imagen.setImageResource(R.drawable.missfortune_splash);
        }
        if(i.equals("4")){
        imagen.setImageResource(R.drawable.orianna_splash);
        }
        if(i.equals("5")){
        imagen.setImageResource(R.drawable.rengar_splash);
        }
        if(i.equals("6")){
        imagen.setImageResource(R.drawable.sona_splash);
        }

    }

}
