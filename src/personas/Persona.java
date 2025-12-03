package personas;

import pokemon.Pokemon;

//ATRIBUTOS
public class Persona {
    private String nombre;
    private int edad;
    private Pokemon pokemonFavorito;
    private int numPokemon;

    //CONSTRUCTOR COMPLETO
    public Persona(String nombre, int edad, Pokemon pokemonFavorito, int numPokemon) {
        this.nombre = nombre;
        this.edad = edad;
        this.pokemonFavorito = pokemonFavorito;
        this.numPokemon = numPokemon;
    }

    //CONSTRUCTOR VACIO
    public Persona() {
    }

    //TODOS LOS GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Pokemon getPokemonFavorito() {
        return pokemonFavorito;
    }

    public void setPokemonFavorito(Pokemon pokemonFavorito) {
        this.pokemonFavorito = pokemonFavorito;
    }

    public int getNumPokemon() {
        return numPokemon;
    }

    public void setNumPokemon(int numPokemon) {
        this.numPokemon = numPokemon;
    }

    //METODO SALUDO
    public void saludo() {
        System.out.println("Hola, soy " + this.nombre + " y mi Pokémon favorito es " + this.pokemonFavorito.getNombre());
    }

    //toSRING que devuelva “<nombre> (<edad> años)”
    @Override
    public String toString() {
        return this.nombre + " (Edad: " + this.getEdad() + "años" + ")";

    }
}
