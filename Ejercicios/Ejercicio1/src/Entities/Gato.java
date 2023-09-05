package Entities;

public class Gato extends Animal{

    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public void Alimentarse() {

        System.out.println("El gato " + nombre + " se alimenta de " + alimento);

    }

}
