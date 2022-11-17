package Cliente;

import java.util.Iterator;
import Alimentos.Comida;
import Maquina.SigmaMeal;

public class Vip implements Modo{

    public void mostrarComidas(){

        Iterator<Comida> i = SigmaMeal.iteradorComidasPredeterminadas();
        while(i.hasNext()){
            System.out.println(i.next().getDescripcion());
        }
    }

    public void mostrarBatidos(){}
    
    public void personalizarBatido(){}

    public void personalizarComida(){}

    public void mostrarPlanNutricional(){}

    public static void main(String[] Args){
        Vip v = new Vip();
        v.mostrarComidas();
    }
}
