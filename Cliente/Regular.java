package Cliente;


public class Regular extends Modo{
    
    public void personalizarBatido(){
        throw new IllegalStateException();
    }

    public void personalizarComida(){
        throw new IllegalStateException();
    }

    public void mostrarPlanNutricional(){
        throw new IllegalStateException();
    }

    public static void main(String[] sgra){
        Regular r = new Regular();
        r.mostrarBatidos();
    }
}
