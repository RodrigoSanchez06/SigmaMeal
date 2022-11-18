package Productos;

public interface Producto {
    
    public String getDescripcion();

    /**
     * devuelve el costo total de los ingredientes agregados.
     * 
     * @return devuelve el costo total de los ingredientes agregados.
     */
    public abstract double cost();

    /**
     * devuelve las calorias totales de la comida.
     * 
     * @return devuelve el numero de calorias totales de la comida.
     */
    public abstract double calories();

    /**
     * devuelve la grasa total de la comida.
     * 
     * @return devuelve el numero de grasas totales de la comida.
     */
    public abstract double fat();

    /**
     * devuelve los carbohidratos totales de la comida.
     * 
     * @return devuelve el numero de carbohidratos totales de la comida.
     */
    public abstract double carbh();

    /**
     * devuelve el total de proteina contenida en la comida.
     * 
     * @return devuelve el numero total de proteina de la comida.
     */
    public abstract double protein();

    /**
     * devuelve el total de gramos de la comida.
     * 
     * @return devuelve el total de gramos de la comida.
     */
    public abstract double portion();
}
