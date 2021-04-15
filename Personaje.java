package co.edu.poli.jurassicrock.model;

/**
 * // Clase abstracta que representa el comportamiento de los personajes en el juego.
 *
 * @author Willmar Pacheco Olaya, Sofia Florez Delgadillo, Joan Nicolas Chavez Angel
 * @version 1.0
 * @since 15/04/2021
 *
 */
public abstract class Personaje {

    /**
     * 
     */
    private int velocidad;

    /**
     *
     * @param velocidad
     */
    public Personaje(int velocidad) {
        this.velocidad = velocidad;
    }

    /**
     *
     */
    public abstract void desplazarse();

    /**
     * 
     */
    public void eliminarDelMapa() {
    }

}