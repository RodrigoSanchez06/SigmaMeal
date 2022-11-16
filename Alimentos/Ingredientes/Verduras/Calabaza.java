package Alimentos.Ingredientes.Verduras;

import Alimentos.Ingredientes.Ingrediente;
import Alimentos.Comida;

/**
 * Clase que representa al ingrediente Calabaza y extiende de comida.
 */
public class Calabaza extends Ingrediente {
    Comida comida;

    /**
     * Constructor por defecto del ingrediente Calabaza.
     */
    public Calabaza(Comida comida) {
        this.comida = comida;
    }

    /**
     * Devuelve la descripcion de la comida con el ingrediente añadido.
     * 
     * @return Descripcion de la comida añadiendo el ingrediente.
     */
    @Override
    public String getDescripcion() {
        return comida.getDescripcion() + ", Calabaza";
    }

    /**
     * Devuelve el costo de la comida con el Calabaza.
     * 
     * @return double del costo de la comida con el Calabaza.
     * 
     */
    @Override
    public double cost() {
        return 26 + comida.cost();
    }

    /**
     * Devuelve las calorias totales de la comida con el Calabaza.
     * 
     * @return double del total de calorias de la comida con el Calabaza.
     * 
     */
    @Override
    public double calories() {
        return 30 + comida.calories();
    }

    /**
     * Devuelve las grasas totales de la comida con el Calabaza.
     * 
     * @return double del total de grasas de la comida con el Calabaza.
     * 
     */
    @Override
    public double fat() {
        return 0.1 + comida.fat();
    }

    /**
     * Devuelve los carbohidratos totales de la comida con el brocoli.
     * 
     * @return double del total de caloritas de la comida con el brocoli.
     * 
     */
    @Override
    public double carbh() {
        return 7.5 + comida.carbh();
    }

    /**
     * Devuelve la proteina total de la comida con el brocoli.
     * 
     * @return double del total de proteina de la comida con el brocoli.
     */
    @Override
    public double protein() {
        return 1 + comida.protein();
    }

    /**
     * Devuelve el total de gramos de la comida.
     * 
     * @return double del total de gramos de la comida.
     */
    @Override
    public double portion() {
        return 100 + comida.portion();
    }
}
