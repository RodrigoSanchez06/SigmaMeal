package Batido.Ingredientes.Frutas;

import Batido.Batido;
import Batido.Ingredientes.Ingrediente;

public class FresaNatural extends Ingrediente {
    Batido batido;

    public FresaNatural(Batido batido) {
        this.batido = batido;
    }

    /**
     * Devuelve la descripcion del batido con el ingrediente añadido
     * 
     * @return Descripcion del batido añadiendo el ingrediente
     */
    @Override
    public String getDescripcion() {
        return batido.getDescripcion() + ", fresas";
    }

    /**
     * Devuelve el costo del batido con las fresas
     * 
     * @return double del costo del batido con las fresas
     */
    @Override
    public double cost() {
        return 15 + batido.cost();
    }

    /**
     * Devuelve las calorias totales del batido con las fresas
     * 
     * @return double del total de calorias del batido con las fresas
     */
    @Override
    public double calories() {
        return 49;
    }

    /**
     * Devuelve las grasas totales del batido con las fresas
     * 
     * @return double del total de grasas del batido con las fresas
     */
    @Override
    public double fat() {
        return 0.4;
    }

    /**
     * Devuelve los carbohidratos totales del batido con las fresas
     * 
     * @return double del total de caloritas del batido con las fresas
     */
    @Override
    public double carbh() {
        return 11.6;
    }

    /**
     * Devuelve la proteina total del batido con las fresas
     * 
     * @return double del total de proteina del batido con las fresas
     */
    @Override
    public double protein() {
        return 1.2;
    }
}
