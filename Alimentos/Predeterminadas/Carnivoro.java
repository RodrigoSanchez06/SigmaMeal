package Alimentos.Predeterminadas;

import Alimentos.Comida;
import Alimentos.Ingredientes.Carbos.Arroz;
import Alimentos.Ingredientes.Proteinas.Pollo;
import Alimentos.Ingredientes.Verduras.Brocoli;

public class Carnivoro extends Comida {
    Comida comida = new Arroz();

    public Carnivoro() {
        comida = new Pollo(comida);
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
