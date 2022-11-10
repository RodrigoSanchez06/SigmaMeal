package Alimentos.Predeterminadas;

import Alimentos.Comida;
import Alimentos.Ingredientes.Carbos.Lentejas;
import Alimentos.Ingredientes.Proteinas.Atun;
import Alimentos.Ingredientes.Verduras.Brocoli;

public class Ligero extends Comida {
    Comida comida = new Lentejas();

    public Ligero() {
        comida = new Atun(comida);
        comida = new Brocoli(comida);
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
