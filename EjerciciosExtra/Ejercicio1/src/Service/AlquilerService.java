package Service;

import Entities.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AlquilerService {

    private Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Alquiler crearAlquiler() {

        System.out.println("Ingresa tu nombre");
        String nombre = sc.next();
        System.out.println("Ingresa tu documento");
        int documento = sc.nextInt();
        System.out.println("Ingresa la fecha de inicio");
        LocalDate fechaInicio = obtenerFecha();
        System.out.println("Ingresa la fecha de devolución");
        LocalDate fechaDevolucion = obtenerFecha();
        System.out.println("Ingresa la posición del amarre");
        String posicion = sc.next();

        System.out.println("Elige el tipo de barco de las siguientes opciones");
        System.out.println("1 - Barco normal");
        System.out.println("2 - Velero");
        System.out.println("3 - Barco a motor");
        System.out.println("4 - Yate");
        int opcion = sc.nextInt();

        Barco b = infoBarco(opcion);

        return new Alquiler(nombre, documento, fechaInicio, fechaDevolucion, posicion, b);

    }

    private LocalDate obtenerFecha() {

        System.out.println("Ingresa el año");
        int anio = sc.nextInt();
        System.out.println("Ingresa el mes");
        int mes = sc.nextInt();
        System.out.println("Ingresa el día");
        int dia = sc.nextInt();

        return LocalDate.of(anio, mes, dia);

    }

    private Barco infoBarco(int opcion) {

        Barco b;

        System.out.println("Ingresa la matricula");
        String matricula = sc.next();
        System.out.println("Ingresa la eslora en metros");
        int eslora = sc.nextInt();
        System.out.println("Ingresa el año de fabricación");
        int anio = sc.nextInt();

        switch (opcion) {

            case 2 -> {

                System.out.println("Ingresa el número de mástiles");
                int mastiles = sc.nextInt();

                b = new Velero(matricula, eslora, anio, mastiles);

            }
            case 3, 4 -> {

                System.out.println("Ingresa la potencia");
                int potencia = sc.nextInt();

                if (opcion == 3) {

                    b = new Motor(matricula, eslora, anio, potencia);

                } else {

                    System.out.println("Ingesa la cantidad de camarotes");
                    int camarotes = sc.nextInt();
                    b = new Yate(matricula, eslora, anio, potencia, camarotes);

                }

            }

            default -> b = new Barco(matricula, eslora, anio);

        }

        return b;

    }

    public double calcularAlquiler(Alquiler a) {

        double comparison = ChronoUnit.DAYS.between(a.getFechaInicio(), a.getFechaDevolucion());

        double calculoAlquiler = comparison * (a.getBarco().getEslora() * 10);

        if (a.getBarco() instanceof Velero) {

            calculoAlquiler += ((Velero) a.getBarco()).getNumeroMastiles();

        } else if (a.getBarco() instanceof Yate) {

            calculoAlquiler += ((Yate) a.getBarco()).getPotencia() + ((Yate) a.getBarco()).getCamarotes();

        } else if (a.getBarco() instanceof Motor) {

            calculoAlquiler += ((Motor) a.getBarco()).getPotencia();

        }

        return calculoAlquiler;

    }

}
