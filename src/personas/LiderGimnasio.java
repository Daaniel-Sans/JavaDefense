package personas;


import pokemon.Pokemon;

public class LiderGimnasio extends Persona {
    private String region;
    private String ciudad;
    private boolean sinDerrotar;

   //CONSTRUCTOR COMPLETO
    public LiderGimnasio(String nombre, int edad, Pokemon pokemonFavorito, int numPokemon, String region, String ciudad, boolean sinDerrotar) {
        super(nombre, edad, pokemonFavorito, numPokemon);
        this.region = region;
        this.ciudad = ciudad;
        this.sinDerrotar = sinDerrotar;
    }
    //CONSTRUCTOR VACIO
    public LiderGimnasio() {
    }

    //GETTERS Y SETTERS

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public boolean isSinDerrotar() {
        return sinDerrotar;
    }

    public void setSinDerrotar(boolean sinDerrotar) {
        this.sinDerrotar = sinDerrotar;
    }


    //TO STRING que devuelva “LIDER <nombre>, de ciudad <ciudad> (<edad> años)”
    @Override
    public String toString() {
        return "Lider: " + this.getNombre() + " de ciudad" + this.getCiudad() + "(" + this.getEdad() + " años)";
    }

}
