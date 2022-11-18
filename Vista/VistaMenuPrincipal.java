package  Vista;

import java.util.Scanner;
import Controlador.Controlador;

public class VistaMenuPrincipal {

    Scanner entrada = new Scanner(System.in);
    Controlador controlador = new Controlador();

    public void vistaPrincipalMenu(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("   _____ _                         __  __            _  ");
        System.out.println("  / ____(_)                       |  \\/  |          | |");
        System.out.println(" | (___  _  __ _ _ __ ___   __ _  | \\  / | ___  __ _| |");
        System.out.println("  \\___ \\| |/ _` | '_ ` _ \\ / _` | | |\\/| |/ _ \\/ _` | |");
        System.out.println("  ____) | | (_| | | | | | | (_| | | |  | |  __/ (_| | |");
        System.out.println(" |_____/|_|\\__, |_| |_| |_|\\__,_| |_|  |_|\\___|\\__,_|_|");
        System.out.println("            __/ |                                      ");
        System.out.println("           |___/                                       ");

        System.out.println("Bienvenido a la revolución del ejercicio: \n" +
        "Selecciona el tipo de usuario que eres. \n" + "1.- Usuario regular \n" +
        "2.- Usuario PREMIUM ");
        while (true) {
            try {
                String opcionEntrada = entrada.nextLine();
                int opcion = Integer.parseInt(opcionEntrada);;
                if (opcion == 1 || opcion == 2) {
                    controlador.opcionInicial(opcion);
                    break;
                } else {
                    System.out.println("Lo sentimos, esa opción no existe");
                    System.out.println("Selecciona el tipo de usuario que eres. \n" + "1.- Usuario regular \n" +
                        "2.- Usuario PREMIUM ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lo sentimos tu entrada es invalida  intentalo de nuevo");
                System.out.println("Selecciona el tipo de usuario que eres. \n" + "1.- Usuario regular \n" +
                    "2.- Usuario PREMIUM");
            }
        }
    }                                               
}
