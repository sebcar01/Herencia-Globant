package Entities;

public class Camping extends ExtraHotelero {

    private int capacidadMaxCarpas;
    private int cantidadBanios;
    private boolean poseeRestaurante;

    public Camping(String nombre, String direccion, String localidad, String gerenteEncargado,
                   boolean esPrivado, double metrosCuadrados, int capacidadMaxCarpas, int cantidadBanios,
                   boolean poseeRestaurante) {
        super(nombre, direccion, localidad, gerenteEncargado, esPrivado, metrosCuadrados);
        this.capacidadMaxCarpas = capacidadMaxCarpas;
        this.cantidadBanios = cantidadBanios;
        this.poseeRestaurante = poseeRestaurante;
    }
    public int getCapacidadMaxCarpas() {
        return capacidadMaxCarpas;
    }

    public void setCapacidadMaxCarpas(int capacidadMaxCarpas) {
        this.capacidadMaxCarpas = capacidadMaxCarpas;
    }

    public int getCantidadBanios() {
        return cantidadBanios;
    }

    public void setCantidadBanios(int cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }

    public boolean poseeRestaurante() {
        return poseeRestaurante;
    }

    public void setPoseeRestaurante(boolean poseeRestaurante) {
        this.poseeRestaurante = poseeRestaurante;
    }

    @Override
    public String toString() {
        return "Camping{" +
                "capacidadMaxCarpas=" + capacidadMaxCarpas +
                ", cantidadBanios=" + cantidadBanios +
                ", poseeRestaurante=" + poseeRestaurante +
                "} " + super.toString();
    }
}
