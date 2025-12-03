package pokemon;

public class Pocion {

    //ATRIBUTOS
    private int puntosRestaurados;
    private double precio;

    //CONSTRUCTOR COMPLETO
    public Pocion(int puntosRestaurados, double precio) {
        this.puntosRestaurados = puntosRestaurados;
        this.precio = precio;
    }

    //CONSTRUCTOR VACIO
    public Pocion() {
    }

    //TODOS LOS GETTERS Y SETTERS

    public int getPuntosRestaurados() {
        return puntosRestaurados;
    }

    public void setPuntosRestaurados(int puntosRestaurados) {
        this.puntosRestaurados = puntosRestaurados;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //METODO curar(pokemon) que sume al Pokémon que se pasa como parámetro tantos puntos de salud como puntosRestaurados tiene la poción

    public void curar(Pokemon objetivo) {
        objetivo.puntosSalud += this.puntosRestaurados;
    }

    //METODO getPrecioConImpuesto(impuesto), que devuelva el precio tras aplicar un impuesto dado en tanto por ciento
    //Utilizo 1 en la fórmula entre paréntesis para factorizar y evitar redundancias con el precio


    public double getPrecioConImpuesto(double impuesto) {
        return this.precio * (1 + impuesto / 100);
    }

    //TOSTRING que devuelva “Poción: <precio> Pokédólares”
    @Override
    public String toString() {
        return "Poción: " + precio + " Pokédólares";
    }

}
