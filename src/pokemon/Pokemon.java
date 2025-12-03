package pokemon;


//ATRIBUTOS
public class Pokemon {
    private String nombre;
    private int nivel;
    private int puntosSalud;
    private int ataque;

    private enum Tipo {NORMAL, FUEGO, AGUA, PLANTA, SINIESTRO, PSIQUICO}

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
}
