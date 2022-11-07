package Batido.Ingredientes.Frutas;

import Batido.Batido;
import Batido.Ingredientes.Ingrediente;

public class Mamey extends Ingrediente {
    Batido batido;

    public Mamey(Batido batido) {
        this.batido = batido;
    }

    /**
     * Devuelve la descripcion del batido con el ingrediente añadido
     * 
     * @return Descripcion del batido añadiendo el ingrediente
     */
    @Override
    public String getDescripcion() {
        return batido.getDescripcion() + ", mamey";
    }

    /**
     * Devuelve el costo del batido con el mamey
     * 
     * @return double del costo del batido con el mamey
     */
    @Override
    public double cost() {
        return 10 + batido.cost();
    }

    /**
     * Devuelve las calorias totales del batido con el mamey
     * 
     * @return double del total de calorias del batido con el mamey
     */
    @Override
    public double calories() {
        return 431;
    }

    /**
     * Devuelve las grasas totales del batido con el mamey
     * 
     * @return double del total de grasas del batido con el mamey
     */
    @Override
    public double fat() {
        return 4.2;
    }

    /**
     * Devuelve los carbohidratos totales del batido con el mamey
     * 
     * @return double del total de caloritas del batido con el mamey
     */
    @Override
    public double carbh() {
        return 105.7;
    }

    /**
     * Devuelve la proteina total del batido con el mamey
     * 
     * @return double del total de proteina del batido con el mamey
     */
    @Override
    public double protein() {
        return 4.2;
    }
}
