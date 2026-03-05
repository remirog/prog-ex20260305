public class CentroFP {

    private Alumno[] alumnos;
    private final int MAX_ALUMNOS;

    /**
     * Constructor de la clase CentroFP
     * @param MAX_ALUMNOS maximo de alumno de el array alumnos
     */
    public CentroFP(int MAX_ALUMNOS) {
        this.MAX_ALUMNOS = MAX_ALUMNOS;
        alumnos = new Alumno[MAX_ALUMNOS];
    }

    /**
     * Busca al alumno por un id recibido
     * @param id Identificador del alumno
     * @return Devuelve un alumno si lo ha encontrado o sino un null si no lo ha encontrado
     */
    public Alumno buscarAlumno(int id){
        boolean encontrado = false;
        Alumno alumno = null;

        for (int i = 0; i < MAX_ALUMNOS && !encontrado; i++){
            if (alumnos[i].getId() == id){
                alumno = alumnos[i];
                encontrado = true;
            }
        }
        return alumno;
    }

    /**
     * Busca el primer hueco libre que encuentre en el arrray alumnos
     * @return Devuelve la posicion de el hueco libre o sino hay hueco libre devuelve -1
     */
    private int buscarPrimerHuecoLibre(){
        boolean encontrado = false;
        int posicion = -1;

        for (int i = 0; i < MAX_ALUMNOS && !encontrado; i++){
            if (alumnos[i] == null){
                posicion = i;
                encontrado = true;
            }
        }
        return posicion;
    }




}
