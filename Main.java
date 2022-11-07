import Batido.Batido;
import Batido.LaBarbara;

public class Main {
    public static void main(String[] args) {
        Batido prueba = new LaBarbara();
        System.out.println("Su batido es la barbara " + prueba.getDescripcion());
    }
}
