package Entities;

import java.time.LocalDate;
import java.util.Formatter;

public class Alquiler {

    private String nombre;
    private int documento;
    private LocalDate fechaInicio;
    private LocalDate fechaDevolucion;
    private String posicion;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, int documento, LocalDate fechaInicio, LocalDate fechaDevolucion, String posicion, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaInicio = fechaInicio;
        this.fechaDevolucion = fechaDevolucion;
        this.posicion = posicion;
        this.barco = barco;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "nombre='" + nombre + '\'' +
                ", documento=" + documento +
                ", fechaInicio=" + fechaInicio +
                ", fechaDevolucion=" + fechaDevolucion +
                ", posicion='" + posicion + '\'' +
                ", barco='" + barco + '\'' +
                '}';
    }
}
