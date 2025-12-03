import pokemon.Pokemon;
import pokemon.Pocion;
import personas.Persona;
import personas.Entrenador;
import personas.LiderGimnasio;


public class Main {
    public static void main(String[] args) {
        //Crear 4 Pokémon e imprimir sus toString

        Pokemon pikachu = new Pokemon ("Pikachu", 3, 78, 66);
        Pokemon geodude = new Pokemon ("Geodude", 4, 366, 43);
        Pokemon psyduck = new Pokemon ("Psyduck", 65, 179, 67);
        Pokemon snorlax = new Pokemon ("Snorlax", 6, 100, 100);

        System.out.println(pikachu);
        System.out.println(geodude);
        System.out.println(psyduck);
        System.out.println(snorlax);

        System.out.println("---------------");
        //Ejecutar 2 ataques e imprimir los puntos de salud restantes de los Pokémon atacados
        pikachu.atacar(geodude); // pikachu ataca a geodude
        psyduck.atacar(snorlax); // psyduck ataca snorlax

        System.out.println("Puntos de salud restantes:");
        System.out.println(geodude.getNombre() + ": " + geodude.getPuntosSalud());
        System.out.println(snorlax.getNombre() + ": " + snorlax.getPuntosSalud());

        System.out.println("-------------");
        //Crear 1 poción, curar a un Pokémon atacado e imprimir los puntos de salud restantes
        Pocion pocion = new Pocion(10, 50.0);
        pocion.curar(snorlax);

        System.out.println("Después de usar la poción:");
        System.out.println(snorlax.getNombre() + ": " + snorlax.getPuntosSalud());
        System.out.println("-----------");

        //Crear 2 entrenadores e imprimir sus toString

        Entrenador entrenador1 = new Entrenador ("Ash", 16, pikachu, 6, Entrenador.Clase.MONTANYERO);
        Entrenador entrenador2 = new Entrenador ("Gary", 18, geodude, 5, 6, Entrenador.Clase.DOMINGUERO);

        System.out.println(entrenador1);
        System.out.println(entrenador2);

        //Crear 1 líder de gimnasio e imprimir su toString

        LiderGimnasio Manue = new LiderGimnasio("Manué", 18, pikachu, 6, "El polígono San Pablo", "Sevilla", true);
        System.out.println(Manue);

    }
}