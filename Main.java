import Alimentos.Comida;
import Alimentos.Predeterminadas.Carnivoro;
import Batido.Batido;
import Batido.Predeterminados.*;

public class Main {
    public static void main(String[] args) {
        Batido prueba = new LaBarbara();
        Batido prueba2 = new LaCoqueta();
        Batido prueba3 = new LaPonchada();
        Comida comida1 = new Carnivoro();

        System.out.println("Su batido es la barbara " + prueba.getDescripcion() + " \n" + prueba.cost() + " \n"
                + prueba.calories() + " \n" + prueba.protein() + " \n" + prueba.portion());

        System.out.println("Su batido es la coqueta " + prueba2.getDescripcion() + " \n" + prueba2.cost() + " \n"
                + prueba2.calories() + " \n" + prueba2.protein() + " \n" + prueba2.portion());

        System.out.println("Su batido es la coqueta " + prueba3.getDescripcion() + " \n" + prueba3.cost() + " \n"
                + prueba3.calories() + " \n" + prueba3.protein() + " \n" + prueba3.portion());

        System.out.println("-------------------------------------------------------");
        System.out.println("Su " + comida1.getDescripcion());
    }
}