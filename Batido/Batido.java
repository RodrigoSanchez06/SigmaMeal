package Batido;

public abstract class Batido {
    String descripcion = "Batido", nombre;

    /**
     * Devuelve la descripción del batido preparado.
     * 
     * @return descripción del batido.
     */
    public String getDescripcion() {
        return this.descripcion;
    }

    /**
     * devuelve el costo total de los ingredientes agregados.
     * 
     * @return devuelve el costo total de los ingredientes agregados.
     */
    public abstract double cost();

    /**
     * devuelve las calorias totales del batido
     * 
     * @return devuelve el numero de calorias totales del batido
     */
    public abstract double calories();

    /**
     * devuelve la grasa total del batido
     * 
     * @return devuelve el numero de grasas totales del batido
     */
    public abstract double fat();

    /**
     * devuelve los carbohidratos totales del batido
     * 
     * @return devuelve el numero de carbohidratos totales del batido
     */
    public abstract double carbh();

    /**
     * devuelve el total de proteina contenida en el batido
     * 
     * @return devuelve el numero total de proteina del batido
     */
    public abstract double protein();

}