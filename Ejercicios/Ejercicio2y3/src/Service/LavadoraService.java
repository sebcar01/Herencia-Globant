package Service;

import Entities.Lavadora;
import Entities.Electrodomestico;

public class LavadoraService extends ElectrodomesticoService {

    public Lavadora crearLavadora() {

        Electrodomestico e = crearElectrodomestico();

        System.out.println("Ingresa la carga de la lavadora");
        double carga = sc.nextDouble();

        return new Lavadora(1000, e.getColor(), e.getConsumo(), e.getPeso(), carga);

    }

}
