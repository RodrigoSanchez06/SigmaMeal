package Productos.Batido.Ingredientes.Leches;

import Productos.Batido.Batido;

/**
 * Clase que representa al ingrediente LecheDeslactosada.
 */
public class LecheDeslactosada extends Batido {
    /**
     * Constructor de LecheDeslactosada, añade descripción.
     */
    public LecheDeslactosada() {
        descripcion = this.getDescripcion() + " Leche deslactosada";
    }

    /**
     * Devuelve el costo del batido con leche deslactosada.
     * 
     * @return double con el costo del batido con leche deslactosada.
     */
    @Override
    public double cost() {
        return 20;
    }

    /**
     * Devuelve el numero de calorias del batido con leche deslactosada.
     * 
     * @return double con el numero de calorias con leche deslactosada.
     */
    @Override
    public double calories() {
        return 144;
    }

    /**
     * Devuelve el numero de grasas del batido con leche deslactosada.
     * 
     * @return double con el numero de grasa total con leche deslactosada.
     */
    @Override
    public double fat() {
        return 5.4;
    }

    /**
     * Devuelve el numero de carbohidratos del batido con leche deslactosada.
     * 
     * @return double con el numero de carbohidratos con leche deslactosada.
     */
    @Override
    public double carbh() {
        return 14.4;
    }

    /**
     * Devuelve el numero de proteinas del batido con leche deslactosada.
     * 
     * @return double con el numero de proteina contenida con leche deslactosada.
     */
    @Override
    public double protein() {
        return 9.3;
    }

    /**
     * Devuelve el numero de mililitros del batido con leche deslactosada.
     * 
     * @return double con los milititros contenida con leche deslactosada.
     */
    @Override
    public double portion() {
        return 300;
    }
}
