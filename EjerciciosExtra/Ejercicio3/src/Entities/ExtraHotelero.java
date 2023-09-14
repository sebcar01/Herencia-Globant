package Entities;

public class ExtraHotelero extends Alojamiento {

    protected boolean esPrivado;
    protected double metrosCuadrados;

    public ExtraHotelero() {
    }

    public ExtraHotelero(String nombre, String direccion, String localidad, String gerenteEncargado,
                         boolean esPrivado, double metrosCuadrados) {
        super(nombre, direccion, localidad, gerenteEncargado);
        this.esPrivado = esPrivado;
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return "ExtraHotelero{" +
                "esPrivado=" + esPrivado +
                ", metrosCuadrados=" + metrosCuadrados +
                "} " + super.toString();
    }
}
