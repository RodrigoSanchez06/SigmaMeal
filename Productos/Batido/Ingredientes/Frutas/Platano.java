package Productos.Batido.Ingredientes.Frutas;

import Productos.Batido.Batido;
import Productos.Batido.Ingredientes.Ingrediente;

/**
 * Clase que representa al ingrediente Platano.
 */
public class Platano extends Ingrediente {

    Batido batido;

    /**
     * Constructor que aplica a un batido el ingrediente Platano.
     * 
     * @param batido batido al que se le agregará el ingrediente.
     */
    public Platano(Batido batido) {
        this.batido = batido;
    }

    /**
     * Devuelve la descripcion del batido con el ingrediente añadido.
     * 
     * @return Descripcion del batido añadiendo el ingrediente.
     */
    @Override
    public String getDescripcion() {
        return batido.getDescripcion() + ", platano";
    }

    /**
     * Devuelve el costo del batido con el platano.
     * 
     * @return double del costo del batido con el platano.
     */
    @Override
    public double cost() {
        return 6 + batido.cost();
    }

    /**
     * Devuelve las calorias totales del batido con el platano.
     * 
     * @return double del total de calorias del batido con el platano.
     */
    @Override
    public double calories() {
        return 91 + batido.calories();
    }

    /**
     * Devuelve las grasas totales del batido con el platano.
     * 
     * @return double del total de grasas del batido con el platano.
     */
    @Override
    public double fat() {
        return 0.3 + batido.fat();
    }

    /**
     * Devuelve los carbohidratos totales del batido con el platano.
     * 
     * @return double del total de caloritas del batido con el platano.
     */
    @Override
    public double carbh() {
        return 21.1 + batido.carbh();
    }

    /**
     * Devuelve la proteina total del batido con el platano.
     * 
     * @return double del total de proteina del batido con el platano.
     */
    @Override
    public double protein() {
        return 1.1 + batido.protein();
    }

    /**
     * Devuelve el numero de mililitros del batido con leche deslactosada.
     * 
     * @return double con los milititros contenida con leche deslactosada.
     */
    @Override
    public double portion() {
        return 100 + batido.portion();
    }
}
