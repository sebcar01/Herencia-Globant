package Service;

import Entities.Electrodomestico;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ElectrodomesticoService {

    protected Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico crearElectrodomestico() {

        System.out.println("Ingresa la letra del consumo");
        char consumo = sc.next().charAt(0);
        char consumo1 = comprobarConsumoEnergetico(consumo);

        System.out.println("Ingresa el color");
        String color = sc.next();
        String color1 = comprobarColor(color);

        System.out.println("Ingresa el peso");
        double peso = sc.nextDouble();

        return new Electrodomestico(1000, color1, consumo1, peso);

    }

    public char comprobarConsumoEnergetico(char letra) {

        if (letra != 'A' && letra != 'B' && letra != 'C' && letra != 'D' && letra != 'E' && letra != 'F') {

            return 'F';

        } else {

            return letra;

        }

    }

    public String comprobarColor(String color) {

        if (!color.equalsIgnoreCase("blanco") && !color.equalsIgnoreCase("negro") &&
                !color.equalsIgnoreCase("rojo") && !color.equalsIgnoreCase("azul") &&
                !color.equalsIgnoreCase("gris")) {

            return "Blanco";

        } else {

            return color;

        }

    }

}
