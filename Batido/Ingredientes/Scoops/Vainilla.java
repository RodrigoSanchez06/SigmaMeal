package Batido.Ingredientes.Scoops;

import Batido.Batido;
import Batido.Ingredientes.Ingrediente;

public class Vainilla extends Ingrediente {

    Batido batido;

    public Vainilla(Batido batido) {
        this.batido = batido;
    }

    /**
     * Devuelve la descripcion del batido con el ingrediente añadido
     * 
     * @return Desctipcion del batido añadiendo el ingrediente
     */
    @Override
    public String getDescripcion() {
        return batido.getDescripcion() + ", Scoop whey de vainilla";
    }

    /**
     * Devuelve el costo del batido con el scoop de vainilla
     * 
     * @return double del costo del batido con el scoop de vainilla
     */
    @Override
    public double cost() {
        return 28 + batido.cost();
    }

    /**
     * Devuelve las calorias totales del batido con el scoop de vainilla
     * 
     * @return double del total de calorias del batido con el scoop de vainilla
     */
    @Override
    public double calories() {
        return 131 + batido.calories();
    }

    /**
     * Devuelve las grasas totales del batido con el scoop de vainilla
     * 
     * @return double del total de grasas del batido con el scoop de vainilla
     */
    @Override
    public double fat() {
        return 2.4 + batido.fat();
    }

    /**
     * Devuelve los carbohidratos totales del batido con el scoop de vainilla
     * 
     * @return double del total de caloritas del batido con el scoop de vainilla
     */
    @Override
    public double carbh() {
        return 2.6 + batido.carbh();
    }

    /**
     * Devuelve la proteina total del batido con el scoop de vainilla
     * 
     * @return double del total de proteina del batido con el scoop de vainilla
     */
    @Override
    public double protein() {
        return 24.6 + batido.protein();
    }

    /**
     * Devuelve el numero de mililitros del batido con leche deslactosada
     * 
     * @return double con los milititros contenida con leche deslactosada
     */
    @Override
    public double portion() {
        return 34 + batido.portion();
    }

}
