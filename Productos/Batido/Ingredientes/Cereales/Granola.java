package Productos.Batido.Ingredientes.Cereales;

import Productos.Batido.Batido;
import Productos.Batido.Ingredientes.Ingrediente;

/**
 * Clase que representa al ingrediente Granola.
 */
public class Granola extends Ingrediente {
    Batido batido;

    /**
     * Constructor que aplica a un batido el ingrediente Granola.
     * 
     * @param batido batido al que se le agregará el ingrediente.
     */
    public Granola(Batido batido) {
        this.batido = batido;
    }

    /**
     * Devuelve la descripcion del batido con el ingrediente añadido.
     * 
     * @return Descripcion del batido añadiendo el ingrediente.
     */
    @Override
    public String getDescripcion() {
        return batido.getDescripcion() + ", Granola";
    }

    /**
     * Devuelve el costo del batido con la granola.
     * 
     * @return double del costo del batido con la granola.
     * 
     */
    @Override
    public double cost() {
        return 5 + batido.cost();
    }

    /**
     * Devuelve las calorias totales del batido con la granola.
     * 
     * @return double del total de calorias del batido con la granola.
     * 
     */
    @Override
    public double calories() {
        return 453 + batido.calories();
    }

    /**
     * Devuelve las grasas totales del batido con la granola.
     * 
     * @return double del total de grasas del batido con la granola.
     * 
     */
    @Override
    public double fat() {
        return 12.2 + batido.fat();
    }

    /**
     * Devuelve los carbohidratos totales del batido con la granola.
     * 
     * @return double del total de caloritas del batido con la granola.
     * 
     */
    @Override
    public double carbh() {
        return 80.3 + batido.carbh();
    }

    /**
     * Devuelve la proteina total del batido con la granola.
     * 
     * @return double del total de proteina del batido con la granola.
     */
    @Override
    public double protein() {
        return 10.2 + batido.protein();
    }

    /**
     * Devuelve el numero de mililitros del batido con leche deslactosada.
     * 
     * @return double con los milititros contenida con leche deslactosada.
     */
    @Override
    public double portion() {
        return 30 + batido.portion();
    }

}
