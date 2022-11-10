package Alimentos.Predeterminadas;

import Alimentos.Comida;
import Alimentos.Ingredientes.Carbos.Pasta;
import Alimentos.Ingredientes.Proteinas.Pollo;
import Alimentos.Ingredientes.Verduras.Chayote;

public class Tradicional extends Comida {
    Comida comida = new Pasta();

    public Tradicional() {
        comida = new Pollo(comida);
        comida = new Chayote(comida);
    }

    @Override
    public double cost() {
        return comida.cost();
    }

    @Override
    public double calories() {

        return comida.calories();
    }

    @Override
    public double fat() {

        return comida.fat();
    }

    @Override
    public double carbh() {

        return comida.carbh();
    }

    @Override
    public double protein() {

        return comida.protein();
    }

    @Override
    public double portion() {
        return comida.portion();
    }

    @Override
    public String getDescripcion() {
        return comida.getDescripcion();
    }
}
