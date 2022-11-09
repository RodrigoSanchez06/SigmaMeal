package Batido.Predeterminados;

import Batido.Ingredientes.Frutas.*;
import Batido.Ingredientes.Leches.LecheProteica;
import Batido.Ingredientes.Scoops.*;
import Batido.Batido;
import Batido.Ingredientes.Cereales.*;

public class LaCoqueta extends Batido {
    Batido batido = new LecheProteica();

    public LaCoqueta() {
        batido = new Vainilla(batido);
        batido = new FresaNatural(batido);
        batido = new Amaranto(batido);
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
    public double portion() {
        return batido.portion();
    }

    @Override
    public String getDescripcion() {
        return batido.getDescripcion();
    }
}
