package com.example.usuario.misfragments;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity implements BotoneraFragment.CursorListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BotoneraFragment botoneraFragment=(BotoneraFragment)
                getSupportFragmentManager().findFragmentById(R.id.botoneraFragment);
        List<Persona> lista=new ArrayList<>();
        lista.add(new Persona("pepe","nora"));
        lista.add(new Persona("eva","gomez"));
        lista.add(new Persona("manuel","baena"));
        botoneraFragment.setLista(lista);
    }

    @Override
    public boolean moveFirst(Persona persona) {
        DatosPersonaFragment datosPersonaFragment=(DatosPersonaFragment)
                getSupportFragmentManager().findFragmentById(R.id.datos);
        datosPersonaFragment.renderData(persona);

        return true;
    }

    @Override
    public boolean movePrevious(Persona persona) {
        DatosPersonaFragment datosPersonaFragment=(DatosPersonaFragment)
                getSupportFragmentManager().findFragmentById(R.id.datos);
        datosPersonaFragment.renderData(persona);

        return true;
    }

    @Override
    public boolean moveNext(Persona persona) {
        return true;
    }

    @Override
    public boolean moveLast(Persona persona) {
        return true;
    }
}
