package Alimentos.Ingredientes.Proteinas;

import Alimentos.Comida;
import Alimentos.Ingredientes.Ingrediente;

/**
 * Clase que representa al ingrediente Atun y extiende de comida.
 */
public class Atun extends Ingrediente {
    Comida comida;

    /**
     * Constructor por defecto del ingrediente Pasta.
     */
    public Atun(Comida comida) {
        this.comida = comida;
    }

    /**
     * Devuelve la descripcion de la comida con el ingrediente añadido.
     * 
     * @return Descripcion de la comida añadiendo el ingrediente.
     */
    @Override
    public String getDescripcion() {
        return comida.getDescripcion() + ", Atun";
    }

    /**
     * Devuelve el costo de la comida con el atun.
     * 
     * @return double del costo de la comida con el atun.
     * 
     */
    @Override
    public double cost() {
        return 25 + comida.cost();
    }

    /**
     * Devuelve las calorias totales de la comida con el atun.
     * 
     * 
     * @return double del total de calorias de la comida con el atun.
     * 
     */
    @Override
    public double calories() {
        return 116 + comida.calories();
    }

    /**
     * Devuelve las grasas totales de la comida con el atun.
     * 
     * 
     * @return double del total de grasas de la comida con el atun.
     * 
     */
    @Override
    public double fat() {
        return 0.8 + comida.fat();
    }

    /**
     * Devuelve los carbohidratos totales de la comida con el atun.
     * 
     * 
     * @return double del total de caloritas de la comida con el atun.
     * 
     */
    @Override
    public double carbh() {
        return 0 + comida.carbh();
    }

    /**
     * Devuelve la proteina total de la comida con el atun.
     * 
     * @return double del total de proteina de la comida con el atun.
     */
    @Override
    public double protein() {
        return 25.5 + comida.protein();
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
