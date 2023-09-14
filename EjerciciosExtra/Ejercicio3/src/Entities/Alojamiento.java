package Entities;

public class Alojamiento {

    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerenteEncargado;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String gerenteEncargado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerenteEncargado = gerenteEncargado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getGerenteEncargado() {
        return gerenteEncargado;
    }

    public void precioHabitacion() {};
    public boolean poseeRestaurante() {return false;};
    public boolean hayDescuento(){return false;};
    public double getPrecioHabitaciones() {return 0;};

    @Override
    public String toString() {
        return "Alojamiento{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", gerenteEncargado='" + gerenteEncargado + '\'' +
                '}';
    }
}
