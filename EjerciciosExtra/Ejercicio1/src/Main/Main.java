package Main;

import Entities.Alquiler;
import Service.AlquilerService;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AlquilerService as = new AlquilerService();

        Alquiler a = as.crearAlquiler();
        System.out.println("El total del alquiler es: " + as.calcularAlquiler(a));

    }

}
