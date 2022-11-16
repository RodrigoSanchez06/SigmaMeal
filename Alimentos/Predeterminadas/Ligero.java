package Alimentos.Predeterminadas;

import Alimentos.Comida;
import Alimentos.Ingredientes.Carbos.Lentejas;
import Alimentos.Ingredientes.Proteinas.Atun;
import Alimentos.Ingredientes.Verduras.Brocoli;

/**
 * Platillo predeterminado Ligero que extiende de Comida.
 */
public class Ligero extends Comida {
    Comida comida = new Lentejas();

    /**
     * Constructor del platillo Ligero por defecto.
     */
    public Ligero() {
        comida = new Atun(comida);
        comida = new Brocoli(comida);
    }

    /**
     * Devuelve el costo del platillo.
     * 
     * @return costo del platillo.
     */
    @Override
    public double cost() {
        return comida.cost();
    }

    /**
     * Devuelve las calorias del platillo.
     * 
     * @return calorias del platillo.
     */
    @Override
    public double calories() {

        return comida.calories();
    }

    /**
     * devuelve la grasa total de la comida.
     * 
     * @return devuelve el numero de grasas totales de la comida.
     */
    @Override
    public double fat() {

        return comida.fat();
    }

    /**
     * devuelve los carbohidratos totales de la comida.
     * 
     * @return devuelve el numero de carbohidratos totales de la comida.
     */
    @Override
    public double carbh() {

        return comida.carbh();
    }

    /**
     * devuelve el total de proteina contenida en la comida.
     * 
     * @return devuelve el numero total de proteina de la comida.
     */
    @Override
    public double protein() {

        return comida.protein();
    }

    /**
     * devuelve el total de gramos de la comida.
     * 
     * @return devuelve el total de gramos de la comida.
     */
    @Override
    public double portion() {
        return comida.portion();
    }

    /**
     * Devuelve la descripcion del alimento.
     * 
     * @return descripcion del alimento.
     */
    @Override
    public String getDescripcion() {
        return comida.getDescripcion();
    }
}
