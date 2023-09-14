package Main;

import Entities.*;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        List<Alojamiento> alojamientos = new ArrayList<>();

        CuatroEstrellas ce = new CuatroEstrellas("Hotel Buenos Hermanos", "Calle siempre viva 2",
                "Usaquen", "Ramon", 62, 124, 10,
                'A', "Los Galenos", 120);
        CincoEstrellas ce1 = new CincoEstrellas("Hotel Holiday Inn", "Calle de los ricos 23",
                "Usaquen", "Ignacio", 120, 250, 15,
                'B', "Harry Sazón", 200, 5, 23,
                5);
        Camping ca = new Camping("Camping Guatavita", "En la mierda", "Cundinamarca",
                "Rosa", true, 300, 25, 5,
                true);
        Residencia r = new Residencia("Residencia Los Amigos", "En el centro", "Centro",
                "Pepe", false, 120, 18, false,
                true);

        alojamientos.add(ce);
        alojamientos.add(ce1);
        alojamientos.add(ca);
        alojamientos.add(r);

        int opcion = menu(sc);

        calcularPrecioHabitacion(alojamientos);

        switch (opcion) {

            case 1 -> mostrarNombres(alojamientos);
            case 2 -> ordenHoteles(alojamientos);
            case 3 -> mostrarCampingsConRestaurante(alojamientos);
            case 4 -> mostrarResidenciasConDescuento(alojamientos);

        }

    }

    public static int menu(Scanner sc) {

        int opcion;

        do {

            System.out.println("Elige una de las siguientes opciones");
            System.out.println("1 - Listar todos los alojamientos por nombre.");
            System.out.println("2 - Mostrar hoteles del más caro a más barato.");
            System.out.println("3 - Mostrar los campings con restaurante.");
            System.out.println("4 - Mostrar residencias con descuento.");
            opcion = sc.nextInt();

        } while (opcion > 4 || opcion < 1);

        return opcion;

    }

    public static void calcularPrecioHabitacion(List<Alojamiento> a) {

        for (Alojamiento aux : a) {

            aux.precioHabitacion();

        }

    }

    public static void mostrarNombres(List<Alojamiento> a) {

        System.out.println("Listado de alojamientos");

        for (Alojamiento aux : a) {

            System.out.println(aux.getNombre());

        }

    }

    public static void ordenHoteles(List<Alojamiento> a) {

        Comparator<Alojamiento> comparadorPrecios = new Comparator<Alojamiento>() {
            @Override
            public int compare(Alojamiento h1, Alojamiento h2) {

                return Double.compare(h2.getPrecioHabitaciones(), h1.getPrecioHabitaciones());

            }
        };

        a.sort(comparadorPrecios);

        for (Alojamiento aux : a) {

            if (aux.getPrecioHabitaciones() > 0) {

                System.out.println(aux.getNombre() + ". Precio: $" + aux.getPrecioHabitaciones());

            }

        }

    }

    public static void mostrarCampingsConRestaurante(List<Alojamiento> a) {

        int positivos = 0;

        System.out.println("Campings con restaurante");

        for (Alojamiento aux : a) {

            if (aux.poseeRestaurante()) {

                System.out.println(aux.getNombre());
                positivos += 1;

            }

        }

        System.out.println("Cantidad de campings con restaurante: " + positivos);

    }

    public static void mostrarResidenciasConDescuento(List<Alojamiento> a) {

        int positivos = 0;

        for (Alojamiento aux : a) {

            if (aux.hayDescuento()) {

                System.out.println(aux.getNombre());
                positivos += 1;

            }

        }

        System.out.println("Cantidad de residencias con descuento: " + positivos);

    }

}
