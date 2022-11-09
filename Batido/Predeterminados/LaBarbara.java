package Batido.Predeterminados;

import Batido.Ingredientes.Frutas.Mamey;
import Batido.Ingredientes.Scoops.Fresa;
import Batido.Leche.LecheDeslactosada;
import Batido.Batido;
import Batido.Ingredientes.Cereales.Granola;

public class LaBarbara extends Batido {

    Batido batido = new LecheDeslactosada();

    public LaBarbara() {
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

    @Override
    public String getDescripcion(){
        return batido.getDescripcion();
    }

}
