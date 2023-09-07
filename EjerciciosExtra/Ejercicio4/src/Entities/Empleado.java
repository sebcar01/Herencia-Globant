package Entities;

public class Empleado extends Persona {

    protected int anioIncorporacion;
    protected int numeroDespacho;

    public Empleado() {
    }

    public Empleado(String nombre, String apellidos, int id, String estadoCivil, int anioIncorporacion, int numeroDespacho) {
        super(nombre, apellidos, id, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    public void reasignacionDespacho() {

        System.out.println("Ingresa el nuevo número de despacho");
        numeroDespacho = sc.nextInt();

        System.out.println("Número de despacho actualizado exitosamente!");

    }

    @Override
    public String toString() {
        return "Empleado{" +
                "anioIncorporacion=" + anioIncorporacion +
                ", numeroDespacho=" + numeroDespacho +
                "} " + super.toString();
    }

}
