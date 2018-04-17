package com.example.rafaj.fragmentapp;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;


/**
 * Created by rafaj on 8/4/2018.
 */

public class FragmentList extends ListFragment implements AdapterView.OnItemClickListener{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment, container, false);
        return view;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.Nombres, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //Toast.makeText(getActivity(), "Item: " + adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
        //Para la vista vertical, creamos el bundle con un objeto persona, lo mandamos por medio de un intent.
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            Intent newIntent = new Intent(getActivity().getApplicationContext(), Main2Activity.class);
            Resources res = getResources();
            String [] edad = res.getStringArray(R.array.Edades);
            //String [] imagen = res.getStringArray(R.array.imagenes);
            //int imagenPersona = getResources().getIdentifier(imagen[i], "drawable", getActivity().getPackageName());
            Persona persona = new Persona(adapterView.getItemAtPosition(i).toString(),edad[i],Integer.toString(i));
            Bundle bundle = new Bundle();
            bundle.putSerializable("lolazo",persona);
            newIntent.putExtras(bundle);
            startActivity(newIntent);
        }else if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            Toast.makeText(getActivity(), "Item: " + adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();
            Resources res = getResources();
            String [] edad = res.getStringArray(R.array.Edades);
            //String [] imagen = res.getStringArray(R.array.imagenes);
            Persona persona = new Persona(adapterView.getItemAtPosition(i).toString(),edad[i],Integer.toString(i));
            Bundle bundle = new Bundle();
            bundle.putSerializable("lolazo", persona);
            FragmentViewer frag = new FragmentViewer();
            frag.setArguments(bundle);

            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            fragmentTransaction.replace(R.id.viewer, frag);
            fragmentTransaction.commit();
        }



    }
}
