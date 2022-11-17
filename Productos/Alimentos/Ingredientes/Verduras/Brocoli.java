package Productos.Alimentos.Ingredientes.Verduras;

import Productos.Alimentos.Comida;
import Productos.Alimentos.Ingredientes.Ingrediente;

/**
 * Clase que representa al ingrediente Brocoli y extiende de comida.
 */
public class Brocoli extends Ingrediente {
    Comida comida;

    /**
     * Constructor por defecto del ingrediente Brocoli.
     */
    public Brocoli(Comida comida) {
        this.comida = comida;
    }

    /**
     * Devuelve la descripcion de la comida con el ingrediente añadido.
     * 
     * @return Descripcion de la comida añadiendo el ingrediente.
     */
    @Override
    public String getDescripcion() {
        return comida.getDescripcion() + ", Brocoli";
    }

    /**
     * Devuelve el costo de la comida con el brocoli.
     * 
     * @return double del costo de la comida con el brocoli.
     * 
     */
    @Override
    public double cost() {
        return 25 + comida.cost();
    }

    /**
     * Devuelve las calorias totales de la comida con el brocoli.
     * 
     * @return double del total de calorias de la comida con el brocoli.
     * 
     */
    @Override
    public double calories() {
        return 34 + comida.calories();
    }

    /**
     * Devuelve las grasas totales de la comida con el brocoli.
     * 
     * @return double del total de grasas de la comida con el brocoli.
     * 
     */
    @Override
    public double fat() {
        return 0.4 + comida.fat();
    }

    /**
     * Devuelve los carbohidratos totales de la comida con el brocoli.
     * 
     * @return double del total de caloritas de la comida con el brocoli.
     * 
     */
    @Override
    public double carbh() {
        return 6.9 + comida.carbh();
    }

    /**
     * Devuelve la proteina total de la comida con el brocoli
     * 
     * @return double del total de proteina de la comida con el brocoli
     */
    @Override
    public double protein() {
        return 2.3 + comida.protein();
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
