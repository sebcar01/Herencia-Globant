package Entities;

public class EdificioDeOficinas extends Edificio {

    private int numeroDeOficinas;
    private int cantidadPersonasPorOficina;
    private int numeroDePisos;

    public EdificioDeOficinas(double ancho, double alto, double largo, int numeroDeOficinas,
                              int cantidadPersonasPorOficina, int numeroDePisos) {
        super(ancho, alto, largo);
        this.numeroDeOficinas = numeroDeOficinas;
        this.cantidadPersonasPorOficina = cantidadPersonasPorOficina;
        this.numeroDePisos = numeroDePisos;
    }

    public double calcularSuperficie() {

        return ancho * largo;

    }

    public double calcularVolumen() {

        return largo * ancho * alto;

    }

    public void cantPersonas() {

        System.out.println("La cantidad de personas por piso es de: " + cantidadPersonasPorOficina);
        System.out.println("La cantidad de personas en todo el edificio es de: " +
                (cantidadPersonasPorOficina * numeroDeOficinas));

    }

    public int getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(int numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }

    public int getCantidadPersonasPorOficina() {
        return cantidadPersonasPorOficina;
    }

    public void setCantidadPersonasPorOficina(int cantidadPersonasPorOficina) {
        this.cantidadPersonasPorOficina = cantidadPersonasPorOficina;
    }

    public int getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(int numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" +
                "numeroDeOficinas=" + numeroDeOficinas +
                ", cantidadPersonasPorOficina=" + cantidadPersonasPorOficina +
                ", numeroDePisos=" + numeroDePisos +
                "} " + super.toString();
    }
}
