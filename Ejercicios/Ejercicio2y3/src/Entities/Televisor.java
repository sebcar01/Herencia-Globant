package Entities;

public class Televisor extends Electrodomestico {

    private double resolucion;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(double precio, String color, char consumo, double peso, double resolucion, boolean TDT) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    public void precioFinal() {

        super.precioFinal();

        if (resolucion > 40) precio *= 1.3;

        if (TDT) precio += 500;

    }

    @Override
    public String toString() {
        return "Televisor{" +
                "resolucion=" + resolucion +
                ", TDT=" + TDT +
                "} " + super.toString();
    }
}
