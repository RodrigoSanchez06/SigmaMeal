package Alimentos.Ingredientes.Carbos;

import Alimentos.Comida;

public class Pasta extends Comida {

    public Pasta() {
        descripcion = this.getDescripcion() + " Pasta";

    }

    /**
     * Devuelve el costo de la comida con la pasta
     * 
     * 
     * @return double del costo de la comida con la pasta
     * 
     */
    @Override
    public double cost() {
        return 25;
    }

    /**
     * Devuelve las calorias totales de la comida con la pasta
     * 
     * 
     * @return double del total de calorias de la comida con la pasta
     * 
     */
    @Override
    public double calories() {
        return 131;
    }

    /**
     * Devuelve las grasas totales de la comida con la pasta
     * 
     * 
     * @return double del total de grasas de la comida con la pasta
     * 
     */
    @Override
    public double fat() {
        return 1.05;
    }

    /**
     * Devuelve los carbohidratos totales de la comida con la pasta
     * 
     * 
     * @return double del total de caloritas de la comida con la pasta
     * 
     */
    @Override
    public double carbh() {
        return 24.9;
    }

    /**
     * Devuelve la proteina total de la comida con la pasta
     * 
     * @return double del total de proteina de la comida con la pasta
     */
    @Override
    public double protein() {
        return 5.1;
    }

    /**
     * Devuelve el total de gramos de la comida
     * 
     * @return double del total de gramos de la comida
     */
    @Override
    public double portion() {
        return 100;
    }
}
