package Alimentos.Ingredientes.Carbos;

import Alimentos.Comida;

/**
 * Clase que representa al ingrediente Lentejas y extiende de comida.
 */
public class Lentejas extends Comida {

    /**
     * Constructor por defecto del ingrediente Lentejas.
     */
    public Lentejas() {
        descripcion = this.getDescripcion() + ", Lentejas";
    }

    /**
     * Devuelve el costo de la comida con las lentejas.
     * 
     * 
     * @return double del costo de la comida con las lentejas.
     * 
     */
    @Override
    public double cost() {
        return 25;
    }

    /**
     * Devuelve las calorias totales de la comida con las lentejas.
     * 
     * 
     * @return double del total de calorias de la comida con las lentejas.
     * 
     */
    @Override
    public double calories() {
        return 165;
    }

    /**
     * Devuelve las grasas totales de la comida con las lentejas.
     * 
     * 
     * @return double del total de grasas de la comida con las lentejas.
     * 
     */
    @Override
    public double fat() {
        return 6.7;
    }

    /**
     * Devuelve los carbohidratos totales de la comida con las lentejas.
     * 
     * 
     * @return double del total de caloritas de la comida con las lentejas.
     * 
     */
    @Override
    public double carbh() {
        return 18.7;
    }

    /**
     * Devuelve la proteina total de la comida con las lentejas.
     * 
     * @return double del total de proteina de la comida con las lentejas.
     */
    @Override
    public double protein() {
        return 8.3;
    }

    /**
     * Devuelve el total de gramos de la comida.
     * 
     * @return double del total de gramos de la comida.
     */
    @Override
    public double portion() {
        return 100;
    }
}
