package co.edu.poli.jurassicrock.model;

/**
 * // Clase que representa los enemigos del juego.
 *
 * @author Willmar Pacheco Olaya, Sofia Florez Delgadillo, Joan Nicolas Chavez Angel
 * @version 1.0
 * @since 15/04/2021
 *
 */
public class Enemigo extends Personaje {

    /**
     * @param idPersonajeEnemigo
     * @param  velocidad
     */
    public Enemigo(String idPersonajeEnemigo, int velocidad) {
        super(velocidad);
        this.idPersonajeEnemigo = idPersonajeEnemigo;
    }

    /**
     * 
     */
    private String idPersonajeEnemigo;

    /**
     * @param vidas 
     * @return int
     */
    public int quitarVidas(int vidas) {
        return 0;
    }

    /**
     * 
     */
    public void desplazarse(){

    }

}