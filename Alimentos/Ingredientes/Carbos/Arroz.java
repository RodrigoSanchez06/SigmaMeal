package Alimentos.Ingredientes.Carbos;

import Alimentos.Comida;

/**
 * Clase que representa al ingrediente Arroz y extiende de comida.
 */
public class Arroz extends Comida {

    /**
     * Constructor por defecto del ingrediente arroz.
     */
    public Arroz() {
        descripcion = this.getDescripcion() + " Arroz";
    }

    /**
     * Devuelve el costo de la comida con el arroz.
     * 
     * 
     * @return double del costo de la comida con el arroz.
     * 
     */
    @Override
    public double cost() {
        return 25;
    }

    /**
     * Devuelve las calorias totales de la comida con el arroz.
     * 
     * 
     * @return double del total de calorias de la comida con el arroz.
     * 
     */
    @Override
    public double calories() {
        return 242;
    }

    /**
     * Devuelve las grasas totales de la comida con el arroz.
     * 
     * 
     * @return double del total de grasas de la comida con el arroz.
     * 
     */
    @Override
    public double fat() {
        return 0.4;
    }

    /**
     * Devuelve los carbohidratos totales de la comida con el arroz.
     * 
     * 
     * @return double del total de caloritas de la comida con el arroz.
     * 
     */
    @Override
    public double carbh() {
        return 53.1;
    }

    /**
     * Devuelve la proteina total de la comida con el arroz.
     * 
     * @return double del total de proteina de la comida con el arroz.
     */
    @Override
    public double protein() {
        return 4.4;
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
