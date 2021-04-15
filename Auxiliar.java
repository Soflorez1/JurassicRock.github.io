package co.edu.poli.jurassicrock.model;

/**
 * // Clase que representa los personajes de ayuda.
 *
 * @author Willmar Pacheco Olaya, Sofia Florez Delgadillo, Joan Nicolas Chavez Angel
 * @version 1.0
 * @since 15/04/2021
 *
 */
public class Auxiliar extends Personaje {

    /**
     *
     * @param idPersonajeAuxiliar identificador del objeto
     * @param velocidad velocidad de movimiento del objeto
     */
    public Auxiliar(String idPersonajeAuxiliar, int velocidad) {
        super(velocidad);
        this.idPersonajeAuxiliar = idPersonajeAuxiliar;
    }

    /**
     * 
     */
    private String idPersonajeAuxiliar;

    /**
     * @param vidas se refiere al numero de vidas que tiene el personaje durante la ejecucion del juego.
     * @return int
     */
    public int aumentarVidas(int vidas) {
        return 0;
    }

    /**
     * 
     */
    public void desplazarse(){

    };

}