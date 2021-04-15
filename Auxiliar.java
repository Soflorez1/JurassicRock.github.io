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
     * @param idPersonajeAuxiliar
     * @param velocidad
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
     * @param vidas 
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