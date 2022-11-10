package Batido.Predeterminados;

import Batido.Ingredientes.Frutas.*;
import Batido.Ingredientes.Leches.LecheEntera;
import Batido.Ingredientes.Scoops.*;
import Batido.Batido;
import Batido.Ingredientes.Cereales.*;

public class LaPonchada extends Batido {
    Batido batido = new LecheEntera();

    public LaPonchada() {
        batido = new Chocolate(batido);
        batido = new Platano(batido);
        batido = new Avena(batido);
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
