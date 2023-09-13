package Main;

import Entities.Edificio;
import Entities.EdificioDeOficinas;
import Entities.Polideportivo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Edificio> edificios = new ArrayList<>();

        Polideportivo p1 = new Polideportivo(23, 12, 45, "Olaya Herrera",
                "Techado"); // volumen: 12420 / superficie: 1035

        Polideportivo p2 = new Polideportivo(25, 15, 50, "Campincito",
                "Abierto"); // volumen: 18750 / superficie: 1250

        EdificioDeOficinas ed1 = new EdificioDeOficinas(20, 18, 67, 5,
                15, 10); // volumen: 24120 / superficie: 1340

        EdificioDeOficinas ed2 = new EdificioDeOficinas(28, 11, 75, 9,
                37, 15); // volumen: 23100 / superficie: 2100

        edificios.add(p1);
        edificios.add(p2);
        edificios.add(ed1);
        edificios.add(ed2);

        calcularEdificio(edificios);

    }

    public static void calcularEdificio(List<Edificio> edificios) {

        int polideportivosTechados = 0;
        int polideportivosAbiertos = 0;

        for (Edificio aux : edificios) {

            System.out.println("La superficie es: " + aux.calcularSuperficie());
            System.out.println("El volumen es: " + aux.calcularVolumen());

            if (aux instanceof Polideportivo) {

                if (((Polideportivo) aux).getTipoDeInstalacion().equalsIgnoreCase("techado")) {

                    polideportivosTechados += 1;

                } else {

                    polideportivosAbiertos += 1;

                }

            } else if (aux instanceof EdificioDeOficinas) {

                ((EdificioDeOficinas) aux).cantPersonas();

            }

        }

        System.out.println("Cantidad de polideportivos techados: " + polideportivosTechados);
        System.out.println("Cantidad de polideportivos abiertos: " + polideportivosAbiertos);

    }

}
