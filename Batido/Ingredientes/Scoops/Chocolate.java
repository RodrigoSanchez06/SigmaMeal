package Batido.Ingredientes.Scoops;

import Batido.Batido;
import Batido.Ingredientes.Ingrediente;

public class Chocolate extends Ingrediente {

    Batido batido;

    public Chocolate(Batido batido) {
        this.batido = batido;
    }

    /**
     * Devuelve la descripcion del batido con el ingrediente añadido
     * 
     * @return Descripcion del batido añadiendo el ingrediente
     */
    @Override
    public String getDescripcion() {
        return batido.getDescripcion() + ", Scoop whey de chocholate";
    }

    /**
     * Devuelve el costo del batido con el scoop de chocolate
     * 
     * @return double del costo del batido con el scoop de chocolate
     */
    @Override
    public double cost() {
        return 25 + batido.cost();
    }

    /**
     * Devuelve las calorias totales del batido con el scoop de chocolate
     * 
     * @return double del total de calorias del batido con el scoop de chocolate
     */
    @Override
    public double calories() {
        return 131 + batido.calories();
    }

    /**
     * Devuelve las grasas totales del batido con el scoop de chocolate
     * 
     * @return double del total de grasas del batido con el scoop de chocolate
     */
    @Override
    public double fat() {
        return 2.4 + batido.calories();
    }

    /**
     * Devuelve los carbohidratos totales del batido con el scoop de chocolate
     * 
     * @return double del total de caloritas del batido con el scoop de chocolate
     */
    @Override
    public double carbh() {
        return 2.6 + batido.carbh();
    }

    /**
     * Devuelve la proteina total del batido con el scoop de chocolate
     * 
     * @return double del total de proteina del batido con el scoop de chocolate
     */
    @Override
    public double protein() {
        return 24.6 + batido.protein();
    }

}
