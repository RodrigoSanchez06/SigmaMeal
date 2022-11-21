package Productos.Alimentos;

import Productos.Batido.Batido;

/**
 * Clase que adapta un batido con una comida, tienen comportamiento identico
 */
public class AdapterBatido extends Batido{
    private Comida alimento;

    /**
     * Constructor de adpterBatido que asigna una comida a convertir
     * @param c comida a convertir
     */
    public AdapterBatido(Comida c){
        if(c == null)
            throw new NullPointerException();
        this.alimento=c;
    }

    /**
     * Devuelve la descripción del batido preparado.
     * 
     * @return descripción del batido.
     */
    @Override
    public String getDescripcion() {
        return this.alimento.getDescripcion();
    }

    /**
     * devuelve el costo total de los ingredientes agregados.
     * 
     * @return devuelve el costo total de los ingredientes agregados.
     */
    public double cost(){
        return this.alimento.cost();
    }

    /**
     * devuelve las calorias totales del batido.
     * 
     * @return devuelve el numero de calorias totales del batido.
     */
    public double calories(){
        return this.alimento.calories();
    }

    /**
     * devuelve la grasa total del batido.
     * 
     * @return devuelve el numero de grasas totales del batido.
     */
    public double fat(){
        return this.alimento.fat();
    }

    /**
     * devuelve los carbohidratos totales del batido.
     * 
     * @return devuelve el numero de carbohidratos totales del batido.
     */
    public double carbh(){
        return this.alimento.carbh();
    }

    /**
     * devuelve el total de proteina contenida en el batido.
     * 
     * @return devuelve el numero total de proteina del batido.
     */
    public double protein(){
        return this.alimento.protein();
    }

    /**
     * Devuelve el total de gramos de la comida.
     * 
     * @return double del total de gramos de la comida.
     */
    public double portion(){
        return this.alimento.portion();
    }
}
