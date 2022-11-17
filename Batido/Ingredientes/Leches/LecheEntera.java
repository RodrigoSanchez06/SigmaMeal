package Batido.Ingredientes.Leches;

import Batido.Batido;

/**
 * Clase que representa al ingrediente LecheEntera.
 */
public class LecheEntera extends Batido {
    /**
     * Constructor de LecheEntera, añade descripción.
     */
    public LecheEntera() {
        descripcion = "Leche entera";
    }

    /**
     * Devuelve el costo del batido con LecheEntera.
     * 
     * @return double con el costo del batido con LecheEntera.
     */
    @Override
    public double cost() {
        return 20;
    }

    /**
     * Devuelve el numero de calorias del batido con LecheEntera.
     * 
     * @return entero con el numero de calorias con LecheEntera.
     */
    @Override
    public double calories() {
        return 155;
    }

    /**
     * Devuelve el numero de grasas del batido con leche entera.
     * 
     * @return double con el numero de grasa total con leche entera.
     */
    @Override
    public double fat() {
        return 6.1;
    }

    /**
     * Devuelve el numero de carbohidratos del batido con leche entera.
     * 
     * @return double con el numero de carbohidratos con leche entera.
     */
    @Override
    public double carbh() {
        return 14.5;
    }

    /**
     * Devuelve el numero de proteinas del batido con leche entera.
     * 
     * @return double con el numero de proteina contenida con leche entera.
     */
    @Override
    public double protein() {
        return 10.1;
    }

    /**
     * Devuelve el numero de mililitros del batido con LecheEntera.
     * 
     * @return double con los milititros contenida con LecheEntera.
     */
    @Override
    public double portion() {
        return 300;
    }
}
