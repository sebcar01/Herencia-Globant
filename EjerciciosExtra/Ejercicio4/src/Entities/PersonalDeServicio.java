package Entities;

public class PersonalDeServicio extends Empleado {

    private String seccion;

    public PersonalDeServicio(String nombre, String apellidos, int id, String estadoCivil, int anioIncorporacion, int numeroDespacho, String seccion) {
        super(nombre, apellidos, id, estadoCivil, anioIncorporacion, numeroDespacho);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public void trasladoSeccion() {

        System.out.println("Ingresa la nueva sección del empleado de servicio");
        seccion = sc.next();

        System.out.println("Empleado trasladado exitosamente!");

    }

    @Override
    public String toString() {
        return "PersonalDeServicio{" +
                "seccion='" + seccion + '\'' +
                "} " + super.toString();
    }
}
