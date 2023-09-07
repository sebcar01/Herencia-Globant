package Main;

import Entities.Circulo;
import Entities.Rectangulo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Circulo c = new Circulo(13);
        Rectangulo r = new Rectangulo(7, 9);

        System.out.println("Area del círculo: " + c.calculoArea());
        System.out.println("Perímetro del círculo: " + c.calculoPerimetro());

        System.out.println("Area del rectángulo: " + r.calculoArea());
        System.out.println("Perímetro del rectángulo: " + r.calculoPerimetro());

    }

}
