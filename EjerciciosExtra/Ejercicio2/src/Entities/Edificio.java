package Entities;

public abstract class Edificio {

    protected double ancho;
    protected double alto;
    protected double largo;

    public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public abstract double calcularSuperficie();
    public abstract double calcularVolumen();

    @Override
    public String toString() {
        return "Edificio{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", largo=" + largo +
                '}';
    }
}




