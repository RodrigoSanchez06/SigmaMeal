package Batido.Ingredientes.Frutas;

import Batido.Batido;
import Batido.Ingredientes.Ingrediente;

/**
 * Clase que representa al ingrediente FresaNatural.
 */
public class FresaNatural extends Ingrediente {
    Batido batido;

    /**
     * Constructor que aplica a un batido el ingrediente FresaNatural.
     * 
     * @param batido batido al que se le agregará el ingrediente.
     */
    public FresaNatural(Batido batido) {
        this.batido = batido;
    }

    /**
     * Devuelve la descripcion del batido con el ingrediente añadido.
     * 
     * @return Descripcion del batido añadiendo el ingrediente.
     */
    @Override
    public String getDescripcion() {
        return batido.getDescripcion() + ", fresas";
    }

    /**
     * Devuelve el costo del batido con las fresas.
     * 
     * @return double del costo del batido con las fresas.
     */
    @Override
    public double cost() {
        return 15 + batido.cost();
    }

    /**
     * Devuelve las calorias totales del batido con las fresas.
     * 
     * @return double del total de calorias del batido con las fresas.
     */
    @Override
    public double calories() {
        return 49 + batido.calories();
    }

    /**
     * Devuelve las grasas totales del batido con las fresas.
     * 
     * @return double del total de grasas del batido con las fresas.
     */
    @Override
    public double fat() {
        return 0.4 + batido.fat();
    }

    /**
     * Devuelve los carbohidratos totales del batido con las fresas.
     * 
     * @return double del total de caloritas del batido con las fresas.
     */
    @Override
    public double carbh() {
        return 11.6 + batido.carbh();
    }

    /**
     * Devuelve la proteina total del batido con las fresas.
     * 
     * @return double del total de proteina del batido con las fresas.
     */
    @Override
    public double protein() {
        return 1.2 + batido.protein();
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
