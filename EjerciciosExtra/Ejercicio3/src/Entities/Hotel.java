package Entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hotel extends Alojamiento {

    protected int cantidadHabitaciones;
    protected int numeroCamas;
    protected int numeroPisos;
    protected double precioHabitaciones;

    public Hotel() {
    }

    public Hotel(String nombre, String direccion, String localidad, String gerenteEncargado, int cantidadHabitaciones,
                 int numeroCamas, int numeroPisos) {
        super(nombre, direccion, localidad, gerenteEncargado);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.numeroPisos = numeroPisos;
    }

    public double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "cantidadHabitaciones=" + cantidadHabitaciones +
                ", numeroCamas=" + numeroCamas +
                ", numeroPisos=" + numeroPisos +
                "} " + super.toString();
    }
}
