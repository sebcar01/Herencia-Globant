package Entities;

import java.time.LocalDate;

public class Velero extends Barco {

    private int numeroMastiles;

    public Velero(String matricula, int eslora, int anioFabricacion, int numeroMastiles) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" +
                "numeroMastiles=" + numeroMastiles +
                "} " + super.toString();
    }
}
