package Vista;

import java.util.Scanner;

import Controlador.Controlador;

public class VistaUsuarioRegular {

    Controlador controlador;
    Scanner entrada = new Scanner(System.in);

    public VistaUsuarioRegular(Controlador controlador) {
        this.controlador = controlador;
    }

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
}
