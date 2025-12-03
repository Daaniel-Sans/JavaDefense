package personas;

import pokemon.Pokemon;

public class Entrenador extends Persona {
    private int medallas;
    public enum Clase { DOMINGUERO, CAZABICHOS, MONTANYERO, PESCADOR, ORNITOLOGO }
    private Clase clase;

    // Constructor completo
    public Entrenador(String nombre, int edad, Pokemon pokemonFavorito, int numPokemon, int medallas, Clase clase) {
        super(nombre, edad, pokemonFavorito, numPokemon);
        this.medallas = medallas;
        this.clase = clase;
    }

    // Constructor vacío
    public Entrenador() {
    }

    // Con todos los atributos excepto medallas, que ponga medallas a 0
    public Entrenador(String nombre, int edad, Pokemon pokemonFavorito, int numPokemon, Clase clase) {
        super(nombre, edad, pokemonFavorito, numPokemon);
        this.clase = clase;
        this.medallas = 0;
    }

    //GETTERS Y SETTERS
    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }
    // METODO ganarMedallas(numMedallas) que sume numMedallas a medallas

    public void ganarMedallas(int numMedallas) {
        this.medallas += numMedallas;
    }

    public boolean ligaDisponible() {
        return this.medallas >= 8;
    }

    //toSTRING que devuelva “<clase> <nombre> (<edad> años)”

    @Override
    public String toString() {
        return this.clase + " " + this.getNombre() + " (" + this.getEdad() + " años)";
    }

}
