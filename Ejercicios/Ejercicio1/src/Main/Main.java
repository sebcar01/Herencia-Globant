package Main;

import Entities.Animal;
import Entities.Caballo;
import Entities.Gato;
import Entities.Perro;

public class Main {

    public static void main(String[] args) {

        Animal perro1 = new Perro("Stitch", "Carne", 15, "Doberman");
        perro1.Alimentarse();

        Animal perro2 = new Perro("Teddy", "Croquetas", 18, "Chihuahua");
        perro2.Alimentarse();

        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        gato1.Alimentarse();

        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.Alimentarse();

    }

}
