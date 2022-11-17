package Batido.Ingredientes;

import Batido.Batido;

/**
 * Clase abstracta que represanta a un ingrediente de los productos que ofrece
 * SigmaMeal.
 */
public abstract class Ingrediente extends Batido {
    /**
     * devuelve la descripción del batido con el ingrediente añadido.
     * 
     * @return descripción de la bagguette añadiendo el ingrediente.
     */
    public abstract String getDescripcion();
}
