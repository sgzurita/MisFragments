package com.example.usuario.misfragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.sql.ResultSet;
import java.util.List;
import java.util.ListIterator;

public class BotoneraFragment extends Fragment {

        private Button buttonMoveFirst;
        private Button buttonMovePrevious;
        private Button buttonMoveNext;
        private Button buttonMoveLast;
        private CursorListener cursor;
        private int indice=0;
        private List<Persona> lista;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

            cursor = (CursorListener) context;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_botonera,container,false);

        buttonMoveFirst=view.findViewById(R.id.buttonMoveFirst);
        buttonMovePrevious=view.findViewById(R.id.buttonMovePrevious);
        buttonMoveNext=view.findViewById(R.id.buttonMoveNext);
        buttonMoveLast=view.findViewById(R.id.buttonMoveLast);

        buttonMoveFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                indice=0;
                cursor.moveFirst(lista.get(indice));


            }
        });

        buttonMovePrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                indice=indice-1;
                cursor.movePrevious(lista.get(indice));
            }
        });

        buttonMoveNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                indice=indice+1;
                cursor.moveNext(lista.get(indice));
            }
        });

        buttonMoveLast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                indice=lista.size()-1;
                cursor.moveLast(lista.get(indice));

            }
        });
        return view;
    }

    public interface CursorListener{
         boolean moveFirst(Persona persona);
         boolean movePrevious(Persona persona);
         boolean moveNext(Persona persona);
         boolean moveLast(Persona persona);
    }

    public List<Persona> getLista() {
        return lista;
    }

    public void setLista(List<Persona> lista) {
        this.lista = lista;
    }
}
