public class Main {
    public static void main(String[] args) {

        CentroFP uax = new CentroFP(10);

        Alumno alumno1 = new Alumno(1, "Victor", "DAM", 19);
        Alumno alumno2 = new Alumno(2, "Luca", "DAM", 19);
        Alumno alumno3 = new Alumno(3, "Cristobal", "ASIR", 20);

        uax.registrarAlumno(alumno1);
        uax.registrarAlumno(alumno2);
        uax.registrarAlumno(alumno3);

        System.out.println("Mostrar alumnos");
        System.out.println(uax.mostrarAlumnos());

        System.out.println("Numero de alumnos registrados:");
        System.out.println(uax.contarAlumnos());

        System.out.println();

        System.out.println("Buscar alumno1:");
        System.out.println(uax.buscarAlumno(1));

        System.out.println();

        System.out.println("Buscar alumno4:");
        System.out.println(uax.buscarAlumno(4));

    }
}