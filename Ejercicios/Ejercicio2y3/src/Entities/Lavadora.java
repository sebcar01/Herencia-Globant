package Entities;

public class Lavadora extends Electrodomestico {

    private double carga;

    public Lavadora() {
    }

    public Lavadora(double precio, String color, char consumo, double peso, double carga) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public void precioFinal() {

        super.precioFinal();

        if (carga > 30) precio += 500;

    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                "} " + super.toString();
    }
}
