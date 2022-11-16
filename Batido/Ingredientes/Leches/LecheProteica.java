package Batido.Ingredientes.Leches;

import Batido.Batido;

/**
 * Clase que representa al ingrediente LecheProteica.
 */
public class LecheProteica extends Batido {
    /**
     * Constructor de LecheDeslactosada, añade descripción.
     */
    public LecheProteica() {
        descripcion = "Leche proteica";
    }

    /**
     * Devuelve el costo del batido con leche Proteica.
     * 
     * @return double con el costo del batido con leche Proteica.
     */
    @Override
    public double cost() {
        return 20;
    }

    /**
     * Devuelve el numero de calorias del batido con leche Proteica.
     * 
     * @return entero con el numero de calorias con leche Proteica.
     */
    @Override
    public double calories() {
        return 175;
    }

    /**
     * Devuelve el numero de grasas del batido con leche Proteica.
     * 
     * @return double con el numero de grasa total con leche Proteica.
     */
    @Override
    public double fat() {
        return 6.6;
    }

    /**
     * Devuelve el numero de carbohidratos del batido con leche Proteica.
     * 
     * @return double con el numero de carbohidratos con leche Proteica.
     */
    @Override
    public double carbh() {
        return 11.1;
    }

    /**
     * Devuelve el numero de proteinas del batido con leche Proteica.
     * 
     * @return double con el numero de proteina contenida con leche Proteica.
     */
    @Override
    public double protein() {
        return 17.8;
    }

    /**
     * Devuelve el numero de mililitros del batido con leche Proteica.
     * 
     * @return double con los milititros contenida con leche Proteica.
     */
    @Override
    public double portion() {
        return 300;
    }
}
