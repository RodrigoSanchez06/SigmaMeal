package Batido.Ingredientes.Cereales;

import Batido.Batido;
import Batido.Ingredientes.Ingrediente;

public class Amaranto extends Ingrediente {
    Batido batido;

    public Amaranto(Batido batido) {
        this.batido = batido;
    }

    /**
     * Devuelve la descripcion del batido con el ingrediente añadido
     * 
     * @return Descripcion del batido añadiendo el ingrediente
     */
    @Override
    public String getDescripcion() {
        return batido.getDescripcion() + ", Amaranto";
    }

    /**
     * Devuelve el costo del batido con el amaranto
     * 
     * 
     * @return double del costo del batido con el amaranto
     * 
     */
    @Override
    public double cost() {
        return 5 + batido.cost();
    }

    /**
     * Devuelve las calorias totales del batido con el amaranto
     * 
     * 
     * @return double del total de calorias del batido con el amaranto
     * 
     */
    @Override
    public double calories() {
        return 374 + batido.calories();
    }

    /**
     * Devuelve las grasas totales del batido con el amaranto
     * 
     * 
     * @return double del total de grasas del batido con el amaranto
     * 
     */
    @Override
    public double fat() {
        return 6.5 + batido.fat();
    }

    /**
     * Devuelve los carbohidratos totales del batido con el amaranto
     * 
     * 
     * @return double del total de caloritas del batido con el amaranto
     * 
     */
    @Override
    public double carbh() {
        return 66.1 + batido.carbh();
    }

    /**
     * Devuelve la proteina total del batido con el amaranto
     * 
     * @return double del total de proteina del batido con el amaranto
     */
    @Override
    public double protein() {
        return 14.4 + batido.protein();
    }

    /**
     * Devuelve el numero de mililitros del batido con leche deslactosada
     * 
     * @return double con los milititros contenida con leche deslactosada
     */
    @Override
    public double portion() {
        return 30 + batido.portion();
    }
}
