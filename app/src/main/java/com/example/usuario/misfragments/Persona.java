package com.example.usuario.misfragments;

/**
 * Created by Usuario on 05/04/2018.
 */

public class Persona {
    private String Nombre;
    private String Apellido;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        Nombre = nombre;
        Apellido = apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (getNombre() != null ? !getNombre().equals(persona.getNombre()) : persona.getNombre() != null)
            return false;
        return getApellido() != null ? getApellido().equals(persona.getApellido()) : persona.getApellido() == null;
    }

    @Override
    public int hashCode() {
        int result = getNombre() != null ? getNombre().hashCode() : 0;
        result = 31 * result + (getApellido() != null ? getApellido().hashCode() : 0);
        return result;
    }
}
