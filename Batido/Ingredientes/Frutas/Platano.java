package Batido.Ingredientes.Frutas;

import Batido.Batido;
import Batido.Ingredientes.Ingrediente;

public class Platano extends Ingrediente {

    Batido batido;

    public Platano(Batido batido) {
        this.batido = batido;
    }

    /**
     * Devuelve la descripcion del batido con el ingrediente añadido
     * 
     * @return Descripcion del batido añadiendo el ingrediente
     */
    @Override
    public String getDescripcion() {
        return batido.getDescripcion() + ", platano";
    }

    /**
     * Devuelve el costo del batido con el platano
     * 
     * @return double del costo del batido con el platano
     */
    @Override
    public double cost() {
        return 6 + batido.cost();
    }

    /**
     * Devuelve las calorias totales del batido con el platano
     * 
     * @return double del total de calorias del batido con el platano
     */
    @Override
    public double calories() {
        return 91;
    }

    /**
     * Devuelve las grasas totales del batido con el platano
     * 
     * @return double del total de grasas del batido con el platano
     */
    @Override
    public double fat() {
        return 0.3;
    }

    /**
     * Devuelve los carbohidratos totales del batido con el platano
     * 
     * @return double del total de caloritas del batido con el platano
     */
    @Override
    public double carbh() {
        return 21.1;
    }

    /**
     * Devuelve la proteina total del batido con el platano
     * 
     * @return double del total de proteina del batido con el platano
     */
    @Override
    public double protein() {
        return 1.1;
    }

}
