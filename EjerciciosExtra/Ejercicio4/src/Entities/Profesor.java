package Entities;

public class Profesor extends Empleado {

    private String departamento;

    public Profesor(String nombre, String apellidos, int id, String estadoCivil, int anioIncorporacion, int numeroDespacho, String departamento) {
        super(nombre, apellidos, id, estadoCivil, anioIncorporacion, numeroDespacho);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void cambioDepartamento() {

        System.out.println("Ingresa el nuevo departamento del profesor");
        departamento = sc.next();

        System.out.println("Profesor trasladado de departamento exitosamente!");

    }

    @Override
    public String toString() {
        return "Profesor{" +
                "departamento='" + departamento + '\'' +
                "} " + super.toString();
    }
}
