public class Alumno {

    private int id;
    private String nombre;
    private String tituloFP;
    private int edad;

    /**
     * Constructor de la clase Alumno
     *
     * @param id       Identificador del alumno
     * @param nombre   Nombre del alumno
     * @param tituloFP tituloFP del alumno
     * @param edad     edad del alumno
     */
    public Alumno(int id, String nombre, String tituloFP, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.tituloFP = tituloFP;
        this.edad = edad;
    }

    /**
     * Devuelve el Id del alumno
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Devuelve el nombre del alumno
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el tituloFP del alumno
     *
     * @return
     */
    public String getTituloFP() {
        return tituloFP;
    }

    /**
     * Devuelve la edad del alumno
     *
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Devuelve un String con los datos del alumno
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Alumnos: {");

        sb.append(String.format(" id: %d ", id));
        sb.append(String.format(" nombre: %s ", nombre));
        sb.append(String.format(" tituloFP: %s ", tituloFP));
        sb.append(String.format(" edad: %d ", edad));
        sb.append("}");

        return sb.toString();
    }


}
