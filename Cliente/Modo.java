package Cliente;
import java.util.Iterator;
import Maquina.SigmaMeal;
import Productos.Alimentos.Comida;
import Productos.Batido.Batido;

public abstract class Modo {
    public void mostrarComidas(){
        Iterator<Comida> i = SigmaMeal.iteradorComidasPredeterminadas();
        while(i.hasNext()){
            System.out.println(i.next().getDescripcion());
        }
    }

    public void mostrarBatidos(){
        Iterator<Batido> i=SigmaMeal.iteradorBatidosPredeterminados();
        while(i.hasNext()){
            System.out.println(i.next().getDescripcion());
        }
    }
    
    public abstract void personalizarBatido();

    public abstract void personalizarComida();

    public abstract void mostrarPlanNutricional();
}
