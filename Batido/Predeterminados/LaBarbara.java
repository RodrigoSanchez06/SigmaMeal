package Batido.Predeterminados;

import Batido.Ingredientes.Frutas.*;
import Batido.Ingredientes.Leches.LecheDeslactosada;
import Batido.Ingredientes.Scoops.*;
import Batido.Batido;
import Batido.Ingredientes.Cereales.*;

/**
 * Clase que representa a un Batido predeterminado.
 */
public class LaBarbara extends Batido {
    Batido batido = new LecheDeslactosada();

    /**
     * Constructor por defecto del batido predeterminado.
     */
    public LaBarbara() {
        batido = new Fresa(batido);
        batido = new Mamey(batido);
        batido = new Granola(batido);
    }

    /**
     * devuelve el costo total de los ingredientes agregados.
     * 
     * @return devuelve el costo total de los ingredientes agregados.
     */
    @Override
    public double cost() {
        return batido.cost();
    }

    /**
     * devuelve las calorias totales del batido.
     * 
     * @return devuelve el numero de calorias totales del batido.
     */
    @Override
    public double calories() {

        return batido.calories();
    }

    /**
     * devuelve la grasa total del batido.
     * 
     * @return devuelve el numero de grasas totales del batido.
     */
    @Override
    public double fat() {

        return batido.fat();
    }

    /**
     * devuelve los carbohidratos totales del batido.
     * 
     * @return devuelve el numero de carbohidratos totales del batido.
     */
    @Override
    public double carbh() {

        return batido.carbh();
    }

    /**
     * devuelve el total de proteina contenida en el batido.
     * 
     * @return devuelve el numero total de proteina del batido.
     */
    @Override
    public double protein() {

        return batido.protein();
    }

    /**
     * Devuelve el total de gramos de la comida.
     * 
     * @return double del total de gramos de la comida.
     */
    @Override
    public double portion() {
        return batido.portion();
    }

    /**
     * Devuelve la descripción del batido preparado.
     * 
     * @return descripción del batido.
     */
    @Override
    public String getDescripcion() {
        return batido.getDescripcion();
    }
}
