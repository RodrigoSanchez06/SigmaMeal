package Vista;

import java.util.Scanner;

import Controlador.Controlador;

/**
 * Vista de un usuario Regular
 */
public class VistaUsuarioRegular {

    Controlador controlador;
    Scanner entrada = new Scanner(System.in);

    /**
     * Constructor de una vista Regular que asigna un controlador a la vista.
     * @param controlador controlador a asignar
     */
    public VistaUsuarioRegular(Controlador controlador) {
        this.controlador = controlador;
    }

    /**
     * Muestra el menú de opciones de un cliente regular
     */
    public void menuRegular() {
        while (true) {

            System.out
                    .println("Aquí tienes el menú de opciones para usuarios REGULAR, Selecciona la que más te guste: \n"
                            + "1.- Ver menú de Batidos. \n"
                            + "2.- Ver menú de Alimentos. \n"
                            + "3.- Compra un Batido. \n"
                            + "4.- Compra tu Comida. \n"
                            + "5.- Realiza una consulta.");
            String entradaOpcionMenu = entrada.nextLine();
            try {
                int opcion = Integer.parseInt(entradaOpcionMenu);
                controlador.ejecutarOpcionDeMenuRegular(opcion);
            } catch (Exception e) {
                System.out.println("Entrada inválida, intentalo de nuevo por favor.");
            }
        }
    }

    /**
     * Hace saber al usuario el menú de batidos y le da a escoger, recolectando la 
     * opción del usuario.
     */
    public void compraBatidosPredeterminados(){
        while (true) {
            try {
                System.out.println("Elige el batido predeterminado de tu preferencia: ");
                controlador.ejecutarOpcionDeMenuPremium(1);
                System.out.println("4.- Regresar al menu  de opciones.");
                String entradaPredeterminado = entrada.nextLine();
                int opcion = Integer.parseInt(entradaPredeterminado);
                if (opcion == 1 || opcion == 2 || opcion == 3) {
                    controlador.realizaCompraBatidoRegular(opcion);
                    break;   
                } else if(opcion == 4){
                    controlador.regresaMenuDeOpcionesPremium();
                    break;
                } else {
                    System.out.println("Esta opcion no existe intentaló de nuevo");
                }
            } catch (NumberFormatException e) {
                System.out.println("Intentalo de nuevo");
            }
        }
    }

    /**
     * Hace saber al usuario el costo de su producto y que debe pagarlo en caja.
     * @param costo costo del producto.
     */
    public void pagar(double costo){
        System.out.println("El costo de su producto es de: $" +  costo + " pase a pagar en caja");
    }

    /**
     * Hace saber al usuario el menú de comida y le da a escoger, recolectando la 
     * opción del usuario.
     */
    public void compraComidaPredeterminada() {
        while (true) {
            try {
                System.out.println("Elige la comida predeterminada de tu preferencia: ");
                controlador.ejecutarOpcionDeMenuPremium(2);
                String entradaPredeterminado = entrada.nextLine();
                int opcion = Integer.parseInt(entradaPredeterminado);
                if (opcion == 1 || opcion == 2 || opcion == 3) {
                    controlador.realizaCompraComidaRegular(opcion);
                    break;
                } else {
                    System.out.println("Esta opcion no existe intentaló de nuevo");
                }
            } catch (NumberFormatException e) {
                System.out.println("Intentalo de nuevo");
            }
        }
    }

    /**
     * Esté método visualiza cualquiera de los 2 tipos de menú que existen (batido y comida).
     * @param menu menu a presentar
     * @param tipoMenu tipo de menu que es
     */
    public void verCualquierMenuAlimento(String menu, int tipoMenu) {
        if (tipoMenu == 1) {
            System.out.print("Estos son nuestros batidos predeterminados. \n"
                    + menu);
        } else {
            System.out.print("Estos son nuestros alimentos predeterminados. \n"
                    + menu);
        }
    }

    /**
     * Realiza un ticket para que el usuario pague su consulta.
     */
    public void realizaConsulta(){
        System.out.println("Su consulta ha sido agendada para el dia 12/12/2022 TOTAL: $240 realice su pago en caja.");
    }
}
