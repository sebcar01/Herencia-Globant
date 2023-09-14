package Entities;

public class Residencia extends ExtraHotelero {

    private int cantidadHabitaciones;
    private boolean seHaceDescuento;
    private boolean poseeCampoDeportivo;

    public Residencia(String nombre, String direccion, String localidad, String gerenteEncargado,
                      boolean esPrivado, double metrosCuadrados, int cantidadHabitaciones,
                      boolean seHaceDescuento, boolean poseeCampoDeportivo) {
        super(nombre, direccion, localidad, gerenteEncargado, esPrivado, metrosCuadrados);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.seHaceDescuento = seHaceDescuento;
        this.poseeCampoDeportivo = poseeCampoDeportivo;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public boolean hayDescuento() {
        return seHaceDescuento;
    }

    public void setSeHaceDescuento(boolean seHaceDescuento) {
        this.seHaceDescuento = seHaceDescuento;
    }

    public boolean isPoseeCampoDeportivo() {
        return poseeCampoDeportivo;
    }

    public void setPoseeCampoDeportivo(boolean poseeCampoDeportivo) {
        this.poseeCampoDeportivo = poseeCampoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencia{" +
                "cantidadHabitaciones=" + cantidadHabitaciones +
                ", seHaceDescuento=" + seHaceDescuento +
                ", poseeCampoDeportivo=" + poseeCampoDeportivo +
                "} " + super.toString();
    }
}
