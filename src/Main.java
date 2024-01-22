public class Main {
    public static void main(String[] args) {
        Videojuego videojuego1 = new Videojuego("Call of duty", "Acción, disparos", 16, 9.7);
        Videojuego videojuego2 = new Videojuego("Fortnite", "Battle royale", 14, 8.9);

        videojuego1.mostrarInformacion();
        videojuego2.mostrarInformacion();


    }
}

/*Sistema de Videojuegos

Crea un sistema simple para gestionar videojuegos en Java. Cada videojuego tiene un título, un género, una calificación de edad y una puntuación promedio de los usuarios. Debes implementar las siguientes funcionalidades:

1.Agregar un nuevo videojuego al sistema.
2.Mostrar la lista de todos los videojuegos en el sistema.
3.Filtrar y mostrar los videojuegos de un género específico.
4.Mostrar los videojuegos con una calificación de edad determinada.
5.Calificar un videojuego específico. La calificación debe ser un número entre 1 y 5.
6.Mostrar la puntuación promedio de un videojuego.
7.Recomendar al usuario un videojuego basado en sus preferencias de género y calificación de edad.*/