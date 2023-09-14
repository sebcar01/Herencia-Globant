package Entities;

public class CuatroEstrellas extends Hotel {

    protected char gimnasio;
    protected String nombreRestaurante;
    protected int capacidadRestaurante;

    public CuatroEstrellas() {
    }

    public CuatroEstrellas(String nombre, String direccion, String localidad, String gerenteEncargado,
                           int cantidadHabitaciones, int numeroCamas, int numeroPisos,
                           char gimnasio, String nombreRestaurante, int capacidadRestaurante) {
        super(nombre, direccion, localidad, gerenteEncargado, cantidadHabitaciones, numeroCamas, numeroPisos);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public void precioHabitacion() {

        precioHabitaciones = 50 + cantidadHabitaciones + valorAgregadoRestaurante() + valorAgregadoGimnasio();

    }

    public int valorAgregadoRestaurante() {

        return capacidadRestaurante < 30 ? 10 : capacidadRestaurante > 30 && capacidadRestaurante < 50 ? 30 : 50;

    }

    public int valorAgregadoGimnasio() {

        return gimnasio == 'A' ? 50 : 30;

    }

    @Override
    public String toString() {
        return "CuatroEstrellas{" +
                "gimnasio=" + gimnasio +
                ", nombreRestaurante='" + nombreRestaurante + '\'' +
                ", capacidadRestaurante=" + capacidadRestaurante +
                "} " + super.toString();
    }
}
