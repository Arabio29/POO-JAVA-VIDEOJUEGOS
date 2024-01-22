public class MostrardorInformacion extends Videojuego{

    public MostrardorInformacion(String titulo, String genero, int calificacionEdad, double puntuacionUsuarios){
        super(titulo, genero, calificacionEdad, puntuacionUsuarios);
    }

    public void mostrarInformacion(){
        System.out.println("Videojuegos ⚔️");
        System.out.println("Titulo: " + getTitulo() + "Genero: " + getGenero() + "Calificación por edad: " + getCalificacionEdad() + "Puntuación: " + getPuntuacionUsuarios() + ".");
    }



}
