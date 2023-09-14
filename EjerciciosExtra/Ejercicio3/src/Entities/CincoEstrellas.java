package Entities;

public class CincoEstrellas extends CuatroEstrellas {

    private int salonesDeConferencia;
    private int cantidadSuites;
    private int cantidadLimosinas;

    public CincoEstrellas(String nombre, String direccion, String localidad, String gerenteEncargado,
                          int cantidadHabitaciones, int numeroCamas, int numeroPisos,
                          char gimnasio, String nombreRestaurante, int capacidadRestaurante, int salonesDeConferencia,
                          int cantidadSuites, int cantidadLimosinas) {
        super(nombre, direccion, localidad, gerenteEncargado, cantidadHabitaciones,
                numeroCamas, numeroPisos, gimnasio, nombreRestaurante, capacidadRestaurante);
        this.salonesDeConferencia = salonesDeConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public void precioHabitacion() {

        precioHabitaciones = 50 + (cantidadHabitaciones + cantidadSuites) + valorAgregadoRestaurante() +
                valorAgregadoGimnasio() + valorAgregadoLimosinas();

    }

    public double valorAgregadoLimosinas() {

        return cantidadLimosinas * 15;

    }

    public int getSalonesDeConferencia() {
        return salonesDeConferencia;
    }

    public void setSalonesDeConferencia(int salonesDeConferencia) {
        this.salonesDeConferencia = salonesDeConferencia;
    }

    public int getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(int cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(int cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }

    @Override
    public String toString() {
        return "CincoEstrellas{" +
                "salonesDeConferencia=" + salonesDeConferencia +
                ", cantidadSuites=" + cantidadSuites +
                ", cantidadLimosinas=" + cantidadLimosinas +
                "} " + super.toString();
    }
}
