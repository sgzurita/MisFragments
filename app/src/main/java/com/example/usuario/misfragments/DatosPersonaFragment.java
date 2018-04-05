package com.example.usuario.misfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DatosPersonaFragment extends Fragment {

        private EditText editTextNombre;
        private EditText editTextApellido;



    public DatosPersonaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_datos_persona, container, false);

        editTextNombre=view.findViewById(R.id.editTextNombre);
        editTextApellido=view.findViewById(R.id.editTextApellido);

        return view;
    }

    public void renderData(Persona persona){

        editTextNombre.setText(persona.getNombre());
        editTextApellido.setText(persona.getApellido());

    }

}
