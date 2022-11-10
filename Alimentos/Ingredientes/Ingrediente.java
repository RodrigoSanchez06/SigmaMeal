package Alimentos.Ingredientes;

import Alimentos.Comida;

public abstract class Ingrediente extends Comida {
    /**
     * devuelve la descripción del batido con el ingrediente añadido.
     * 
     * @return descripción de la bagguette añadiendo el ingrediente.
     */
    public abstract String getDescripcion();
}
