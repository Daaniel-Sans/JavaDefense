package pokemon;


//ATRIBUTOS
public class Pokemon {
    private String nombre;
    private int nivel;
    protected int puntosSalud;
    private int ataque;
    public enum Tipo {NORMAL, FUEGO, AGUA, PLANTA, SINIESTRO, PSIQUICO}
    private Tipo tipo;

    //CONSTRUCTOR COMPLETO
    public Pokemon(String nombre, int nivel, int puntosSalud, int ataque, Tipo tipo) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosSalud = puntosSalud;
        this.ataque = ataque;
        this.tipo = tipo;
    }

    //CONSTRUCTOR VACIO
    public Pokemon() {
    }

    //CONSTRUCTOR COMPLETO SALVO TIPO, PONIENDO TIPO A NORMAL
    public Pokemon(String nombre, int nivel, int puntosSalud, int ataque) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosSalud = puntosSalud;
        this.ataque = ataque;
        this.tipo = Tipo.NORMAL;
    }

    //TODOS LOS GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosSalud() {
        return puntosSalud;
    }

    public void setPuntosSalud(int puntosSalud) {
        this.puntosSalud = puntosSalud;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    //METODO debilitado() que devuelva true si puntosSalud es menor o igual que 0, y false en caso contrario

    public boolean debilitado() {
        return puntosSalud <= 0;
    }

    //atacar(pokemon), que reste al Pokémon que se pasa como parámetro tantos puntos de salud como ataque tiene el Pokémon atacante

    public void atacar(Pokemon objetivo) {
        objetivo.puntosSalud -= this.ataque;
    }


    //TOSTRING que devuelva “<nombre> (nivel <nivel>)”

    @Override
    public String toString() {
        return this.nombre + " (Nivel: " + this.getNivel() + ")";

    }
}

