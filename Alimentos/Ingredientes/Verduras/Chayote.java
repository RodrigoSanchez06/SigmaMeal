package Alimentos.Ingredientes.Verduras;

import Alimentos.Ingredientes.Ingrediente;

import Alimentos.Comida;

public class Chayote extends Ingrediente {
    Comida comida;

    public Chayote(Comida comida) {
        this.comida = comida;
    }

    /**
     * Devuelve la descripcion de la comida con el ingrediente añadido
     * 
     * @return Descripcion de la comida añadiendo el ingrediente
     */
    @Override
    public String getDescripcion() {
        return comida.getDescripcion() + ", Chayote";
    }

    /**
     * Devuelve el costo de la comida con el arroz
     * 
     * 
     * @return double del costo de la comida con el arroz
     * 
     */
    @Override
    public double cost() {
        return 25 + comida.cost();
    }

    /**
     * Devuelve las calorias totales de la comida con el arroz
     * 
     * 
     * @return double del total de calorias de la comida con el arroz
     * 
     */
    @Override
    public double calories() {
        return 38 + comida.calories();
    }

    /**
     * Devuelve las grasas totales de la comida con el arroz
     * 
     * 
     * @return double del total de grasas de la comida con el arroz
     * 
     */
    @Override
    public double fat() {
        return 0.7 + comida.fat();
    }

    /**
     * Devuelve los carbohidratos totales de la comida con el arroz
     * 
     * 
     * @return double del total de caloritas de la comida con el arroz
     * 
     */
    @Override
    public double carbh() {
        return 8.1 + comida.carbh();
    }

    /**
     * Devuelve la proteina total de la comida con el arroz
     * 
     * @return double del total de proteina de la comida con el arroz
     */
    @Override
    public double protein() {
        return 1 + comida.protein();
    }

    /**
     * Devuelve el total de gramos de la comida
     * 
     * @return double del total de gramos de la comida
     */
    @Override
    public double portion() {
        return 100 + comida.portion();
    }
}
