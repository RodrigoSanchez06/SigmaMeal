package Cliente;
import Alimentos.Comida;
import Batido.Batido;

public interface Modo {
    void mostrarComidas();

    void mostrarBatidos();
    
    void personalizarBatido();

    void personalizarComida();

    void mostrarPlanNutricional();
}
