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
            if (alumnos[i] != null && alumnos[i].getId() == id){
                alumno = alumnos[i];
                encontrado = true;
            }
        }
        return alumno;
    }

    /**
     * Busca el primer hueco libre que encuentre en el arrray alumnos
     * @return Devuelve la posicion de el hueco libre o si no hay hueco libre devuelve -1
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

    /**
     * Añade al array alumno un nuevo Alumno si hay hueco disponible y no esta ua dentro
     * @param alumno
     * @return Devuelve un true si lo ha añadido correctamente y si no un false
     */
    public boolean registrarAlumno(Alumno alumno){
        boolean encontrado = false;
        int posicion;

        if (buscarAlumno(alumno.getId()) == null){
            posicion = buscarPrimerHuecoLibre();
            if (posicion != -1){
                alumnos[posicion] = alumno;
                encontrado = true;
            }
        }
        return encontrado;
    }

    /**
     * Recorre el array de alumnos y recoge toda la información de los alumnos del array
     * @return Devuelve la información de todos los alumnos del array alumnos
     */
    public String mostrarAlumnos(){
        StringBuilder sb = new StringBuilder("Alumnos: {");

        for (int i = 0; i < MAX_ALUMNOS; i++){
            if (alumnos[i] != null){
                sb.append(alumnos[i].toString() + "\n");
            }
        }
        return sb.toString();
    }

    /**
     * Cuenta todos los alumnos que hay en el array de alumnos
     * @return Devuelve el número de alumnos
     */
    public int contarAlumnos(){
        int contador = 0;

        for (int i = 0; i < MAX_ALUMNOS; i++){
            if (alumnos[i] != null){
                contador++;
            }
        }
        return contador;
    }




}
