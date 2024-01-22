public abstract class  Videojuego {

    //atributos
    private String titulo;
    private String genero;
    private int calificacionEdad;
    private double puntuacionUsuarios;

    //constructor
    public Videojuego(String titulo, String genero, int calificacionEdad, double puntuacionUsuarios){
        this.titulo = titulo;
        this.genero = genero;
        this.calificacionEdad = calificacionEdad;
        this.puntuacionUsuarios = puntuacionUsuarios;
    }

    //getters and setters


    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getCalificacionEdad() {
        return calificacionEdad;
    }

    public double getPuntuacionUsuarios() {
        return puntuacionUsuarios;
    }

    //metodos

    abstract void mostrarInformacion();

}
