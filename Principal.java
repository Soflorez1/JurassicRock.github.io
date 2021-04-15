package co.edu.poli.jurassicrock.model;

/**
 * // Clase que representa el jugador principal.
 *
 * @author Willmar Pacheco Olaya, Sofia Florez Delgadillo, Joan Nicolas Chavez Angel
 * @version 1.0
 * @since 15/04/2021
 *
 */
public class Principal extends Personaje {

    /**
     *
     * @param idPersonajePrincipal identificador del objeto
     * @param velocidad velocidad de movimiento del objeto
     */
    public Principal(String idPersonajePrincipal, int velocidad) {
        super(velocidad);
        this.idPersonajePrincipal = idPersonajePrincipal;
    }

    /**
     * 
     */
    private String idPersonajePrincipal;

    /**
     * 
     */
    public void alimentarse() {
    }

    /**
     * 
     */
    public void colicionar() {
    }

    /**
     * 
     */
    public void eliminarEnemigo() {
    }

    /**
     * 
     */
    public void aumentarVelocidad() {
    }

    /**
     * 
     */
    public void desplazarse(){

    }

    public String getIdPersonajePrincipal() {
        return idPersonajePrincipal;
    }

    /**
     *
     * @param idPersonajePrincipal identificador del personaje
     */
    public void setIdPersonajePrincipal(String idPersonajePrincipal) {
        this.idPersonajePrincipal = idPersonajePrincipal;
    }
}