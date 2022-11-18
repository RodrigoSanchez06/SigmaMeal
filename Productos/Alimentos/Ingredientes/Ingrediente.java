package Productos.Alimentos.Ingredientes;

import Productos.Alimentos.Comida;

/**
 * Clase abstra que representa a un ingrediente de algun alimento.
 */
public abstract class Ingrediente extends Comida {
    /**
     * devuelve la descripción del batido con el ingrediente añadido.
     * 
     * @return descripción de la bagguette añadiendo el ingrediente.
     */
    public abstract String getDescripcion();
}
