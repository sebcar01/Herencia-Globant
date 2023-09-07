package Entities;

import java.util.Scanner;

public class Persona {

    protected String nombre;
    protected String apellidos;
    protected int id;
    protected String estadoCivil;

    protected Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Persona() {
    }

    public Persona(String nombre, String apellidos, int id, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = id;
        this.estadoCivil = estadoCivil;
    }

    public void cambioEstadoCivil() {

        System.out.println("Ingresa tu nuevo estado civil");
        estadoCivil = sc.next();

        System.out.println("Estado civil actualizado exitosamente!");

    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", id=" + id +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}
