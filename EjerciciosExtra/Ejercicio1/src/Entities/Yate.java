package Entities;

import java.time.LocalDate;

public class Yate extends Motor {

    private int camarotes;

    public Yate(String matricula, int eslora, int anioFabricacion, int potencia, int camarotes) {
        super(matricula, eslora, anioFabricacion, potencia);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return "Yate{" +
                "camarotes=" + camarotes +
                "} " + super.toString();
    }
}
