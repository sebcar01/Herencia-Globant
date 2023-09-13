package Entities;

public class Polideportivo extends Edificio {

    private String nombre;
    private String tipoDeInstalacion;

    public Polideportivo(double ancho, double alto, double largo, String nombre, String tipoDeInstalacion) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    public double calcularSuperficie() {

        return ancho * largo;

    }

    public double calcularVolumen() {

        return largo * ancho * alto;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeInstalacion() {
        return tipoDeInstalacion;
    }

    public void setTipoDeInstalacion(String tipoDeInstalacion) {
        this.tipoDeInstalacion = tipoDeInstalacion;
    }

    @Override
    public String toString() {
        return "Polideportivo{" +
                "nombre='" + nombre + '\'' +
                ", tipoDeInstalacion='" + tipoDeInstalacion + '\'' +
                "} " + super.toString();
    }
}
