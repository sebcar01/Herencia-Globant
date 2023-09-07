package Entities;

public class Circulo implements calculosFormas {

    private double radio;
    private double diametro;

    public Circulo(double radio) {
        this.radio = radio;
        this.diametro = 2 * radio;
    }

    public double calculoArea() {

        return Math.pow(radio, 2) * PI;

    }

    public double calculoPerimetro() {

        return PI * diametro;

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", diametro=" + diametro +
                '}';
    }
}
