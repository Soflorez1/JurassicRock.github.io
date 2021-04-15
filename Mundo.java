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
     * @param personajes
     * @param puntaje
     * @param nivel
     * @param numeroEnemigos
     * @param numeroAuxiliares
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
     * @param personaje 
     * @param coordenadaX 
     * @param coordenadaY
     *
     */
    public void añadirObjetoAlMundo(Personaje personaje, int coordenadaX, int coordenadaY) {
    }

    /**
     * 
     */
    public void aumentarDificultad() {
    }

    /**
     * 
     */
    public void añadirEnemigos() {
    }

    /**
     * @param valor
     */
    public void aumentarPuntaje(int valor) {
    }

    /**
     * @param inicio 
     * @param fin
     */
    public void generadorPosicionRandom(int inicio, int fin) {}

}