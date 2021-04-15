package co.edu.poli.jurassicrock.model;

/**
 * // Clase que representa el contexto en el que se desarrolla el juego.
 *
 * @author Willmar Pacheco Olaya, Sofia Florez Delgadillo, Joan Nicolas Chavez Angel
 * @version 1.0
 * @since 15/04/2021
 *
 */
public class Mundo {

    /**
     * Default constructor
     */
    public Mundo() {
    }

    /**
     * @param personajes Arreglo personajes
     * @param puntaje valor del puntaje inicial
     * @param nivel valor del nivel
     * @param numeroEnemigos numero de enemigos que se ubicaran en el juego
     * @param numeroAuxiliares numero de perosonajes de ayuda que se ubicaran en el juego
     */
    public Mundo(Personaje[] personajes, int puntaje, int nivel, int numeroEnemigos, int numeroAuxiliares){
        this.personajes = personajes;
        this.puntaje = puntaje;
        this.nivel = nivel;
        this.numeroEnemigos = numeroEnemigos;
        this.numeroAuxiliares = numeroAuxiliares;
    }

    /**
     * 
     */
    private Personaje[] personajes;

    /**
     * 
     */
    private int puntaje;

    /**
     *
     */
    private int nivel;

    /**
     * 
     */
    private int numeroEnemigos;

    /**
     * 
     */
    private int numeroAuxiliares;

    /**
     * @param personaje Objeto personaje que se ubicara en el mundo
     * @param coordenadaX coordena en el eje X del tablero
     * @param coordenadaY coordenada en el Y del tablero
     *
     */
    public void anadirObjetoAlMundo(Personaje personaje, int coordenadaX, int coordenadaY) {
    }

    /**
     * 
     */
    public void aumentarDificultad() {
    }

    /**
     * 
     */
    public void anadirEnemigos() {
    }

    /**
     * @param valor variable que especifica el puntaje durante el contexto del juego.
     */
    public void aumentarPuntaje(int valor) {
    }

    /**
     * @param inicio inicio del rango que generara la posicion aleatoria
     * @param fin fin del rango que generara la posicion aleatoria
     */
    public void generadorPosicionRandom(int inicio, int fin) {}

}