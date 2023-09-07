package Service;

import Entities.Electrodomestico;
import Entities.Televisor;

public class TelevisorService extends ElectrodomesticoService {

    public Televisor crearTelevisor() {

        Electrodomestico e = crearElectrodomestico();

        System.out.println("Ingresa las pulgadas");
        double pulgadas = sc.nextDouble();
        System.out.println("Confirma si cuenta o no con TDT");
        boolean TDT = sc.nextBoolean();

        return new Televisor(1000, e.getColor(), e.getConsumo(), e.getPeso(), pulgadas, TDT);

    }

}
