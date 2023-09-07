package Main;

import Entities.Electrodomestico;
import Entities.Lavadora;
import Entities.Televisor;
import Service.ElectrodomesticoService;
import Service.LavadoraService;
import Service.TelevisorService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Electrodomestico> electrodomesticos = crearLista();

        recorrerYSumar(electrodomesticos);

//        ElectrodomesticoService es = new ElectrodomesticoService();
//        Electrodomestico e = es.crearElectrodomestico();
//        System.out.println(e);
//        e.precioFinal();
//        System.out.println(e);
//
//        LavadoraService ls = new LavadoraService();
//        Lavadora l = ls.crearLavadora();
//        System.out.println(l);
//        l.precioFinal();
//        System.out.println(l);
//
//        TelevisorService ts = new TelevisorService();
//        Televisor t = ts.crearTelevisor();
//        System.out.println(t);
//        t.precioFinal();
//        System.out.println(t);

    }

    public static List<Electrodomestico> crearLista() {

        List<Electrodomestico> electrodomesticos = new ArrayList<>();

        Televisor t1 = new Televisor(1000, "blanco", 'C', 98, 45, true); // 3880
        Televisor t2 = new Televisor(1000, "negro", 'A', 67, 22, false); // 2800
        Lavadora l1 = new Lavadora(1000, "azul", 'E', 89, 23); // 2300
        Lavadora l2 = new Lavadora(1000, "gris", 'D', 56, 67); // 2800

        electrodomesticos.add(t1);
        electrodomesticos.add(t2);
        electrodomesticos.add(l1);
        electrodomesticos.add(l2);

        return electrodomesticos;

    }

    public static void recorrerYSumar(List<Electrodomestico> e) {

        double sumaTotal = 0;
        double sumaLavadoras = 0;
        double sumaTelevisores = 0;

        for (Electrodomestico aux : e) {

            aux.precioFinal();
            if (aux instanceof Televisor) sumaTelevisores += aux.getPrecio();
            if (aux instanceof Lavadora) sumaLavadoras += aux.getPrecio();
            sumaTotal += aux.getPrecio();

            System.out.println("Precio: " + aux.getPrecio());

        }

        System.out.println("La sumatoria total de todas las lavadoras es de: " + sumaLavadoras);
        System.out.println("La sumatoria total de todos los televisores es de: " + sumaTelevisores);
        System.out.println("La sumatoria total de todos los electrodomesticos es de: " + sumaTotal);

    }

}
