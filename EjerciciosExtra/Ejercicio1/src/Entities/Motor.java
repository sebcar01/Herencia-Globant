package Entities;

import java.time.LocalDate;

public class Motor extends Barco {

    protected int potencia;

    public Motor() {
    }

    public Motor(String matricula, int eslora, int anioFabricacion, int potencia) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "potencia=" + potencia +
                "} " + super.toString();
    }
}
