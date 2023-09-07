package Main;

import Entities.Empleado;
import Entities.Estudiante;
import Entities.PersonalDeServicio;
import Entities.Profesor;

public class Main {

    public static void main(String[] args) {

        Estudiante es = new Estudiante("Federico", "Gonzalez", 6789, "Soltero", 6);
        Profesor pf = new Profesor("Ramon", "Ramirez", 32426, "Viudo", 2005, 45, "Arquitectura");
        PersonalDeServicio ps = new PersonalDeServicio("Juan", "Perez", 12345, "Casado", 2010, 56, "Biblioteca");

        System.out.println(es);
        System.out.println(pf);
        System.out.println(ps);

        es.cambioEstadoCivil();
        pf.reasignacionDespacho();
        es.matricularNuevoCurso();
        pf.cambioDepartamento();
        ps.trasladoSeccion();

        System.out.println(es);
        System.out.println(pf);
        System.out.println(ps);

    }

}
