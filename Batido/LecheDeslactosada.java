package Batido;

public class LecheDeslactosada extends Batido {
    /**
     * Constructor de LecheDeslactosada, añade descripción.
     */
    public LecheDeslactosada() {
        descripcion = getDescripcion() + ", Leche deslactosada";
    }

    /**
     * Devuelve el costo del batido con leche deslactosada
     * 
     * @return double con el costo del batido con leche deslactosada
     */
    @Override
    public double cost() {
        return 20;
    }

    /**
     * Devuelve el numero de calorias del batido con leche deslactosada
     * 
     * @return double con el numero de calorias con leche deslactosada
     */
    @Override
    public double calories() {
        return 144;
    }

    /**
     * Devuelve el numero de grasas del batido con leche deslactosada
     * 
     * @return double con el numero de grasa total con leche deslactosada
     */
    @Override
    public double fat() {
        return 5.4;
    }

    /**
     * Devuelve el numero de carbohidratos del batido con leche deslactosada
     * 
     * @return double con el numero de carbohidratos con leche deslactosada
     */
    @Override
    public double carbh() {
        return 14.4;
    }

    /**
     * Devuelve el numero de proteinas del batido con leche deslactosada
     * 
     * @return double con el numero de proteina contenida con leche deslactosada
     */
    @Override
    public double protein() {
        return 9.3;
    }
}
