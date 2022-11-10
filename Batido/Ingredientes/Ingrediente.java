package Batido.Ingredientes;

import Batido.Batido;

public abstract class Ingrediente extends Batido {
    /**
     * devuelve la descripción del batido con el ingrediente añadido.
     * 
     * @return descripción de la bagguette añadiendo el ingrediente.
     */
    public abstract String getDescripcion();
}
