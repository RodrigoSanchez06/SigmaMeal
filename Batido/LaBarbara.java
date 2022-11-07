package Batido;

import Batido.Ingredientes.Frutas.*;
import Batido.Ingredientes.Scoops.*;
import Batido.Ingredientes.Cereales.*;

public class LaBarbara extends Batido {

    Batido batido;

    public LaBarbara() {
        batido = new LecheDeslactosada();
        batido = new Fresa(batido);
        batido = new Mamey(batido);
        batido = new Granola(batido);
    }

    @Override
    public double cost() {
        return batido.cost();
    }

    @Override
    public double calories() {

        return batido.calories();
    }

    @Override
    public double fat() {

        return batido.fat();
    }

    @Override
    public double carbh() {

        return batido.carbh();
    }

    @Override
    public double protein() {

        return batido.protein();
    }

}
