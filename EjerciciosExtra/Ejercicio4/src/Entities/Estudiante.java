package Entities;

public class Estudiante extends Persona {

    private int curso;

    public Estudiante(String nombre, String apellidos, int id, String estadoCivil, int curso) {
        super(nombre, apellidos, id, estadoCivil);
        this.curso = curso;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void matricularNuevoCurso() {

        System.out.println("Ingresa el nuevo curso a donde quieres matricular el alumno");
        curso = sc.nextInt();

        System.out.println("Estudiante reasignado a nuevo curso exitosamente!");

    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "curso=" + curso +
                "} " + super.toString();
    }
}
