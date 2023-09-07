package Entities;

public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumo;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void precioFinal() {

        switch (consumo) {

            case 'A' -> precio += 1000;
            case 'B' -> precio += 800;
            case 'C' -> precio += 600;
            case 'D' -> precio += 500;
            case 'E' -> precio += 300;
            case 'F' -> precio += 100;

        }

        if (peso > 1 && peso <= 19) {

            precio += 100;

        } else if (peso > 20 && peso <= 49) {

            precio += 500;

        } else if (peso > 50 && peso <= 79) {

            precio += 800;

        } else {

            precio += 1000;

        }

    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precio=" + precio +
                ", color='" + color + '\'' +
                ", consumo=" + consumo +
                ", peso=" + peso +
                '}';
    }
}
