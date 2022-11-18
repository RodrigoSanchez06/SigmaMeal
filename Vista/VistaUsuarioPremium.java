package Vista;

import java.util.Scanner;

import Controlador.Controlador;

public class VistaUsuarioPremium {
    
    Scanner entrada = new Scanner(System.in);
    Controlador controlador;

    public void inicioSesion(){
        System.out.println("Para ingresar como Usuario premium, deberás iniciar Sesión \n"  +
            "Introduce tu nombre  de Usuario: ");
        String nombreUsuario = entrada.nextLine();

        System.out.println("Introduce tu contraseña: ");
        String password = entrada.nextLine();

        controlador.iniciarSesion(nombreUsuario, password);
    }

    public void menuPremium(){
        while (true) {
            System.out.println("Aquí tienes el menú de opciones, Selecciona la que más te guste: \n"
            + "1.- Ver menú de Batidos. \n"
            + "2.- Ver menú de Alimentos. \n" 
            + "3.- Arma tu propio Batido. \n"
            + "4.- Arma tu propia Comida. \n"
            + "5.- Compra un Batido. \n"
            + "6.- Compra tu Comida. \n"
            + "7.- Realiza una consulta. \n"
            + "8.- Consulta Estrellas.\n"
            + "9.- Consulta Saldo.");
            String entradaOpcionMenu = entrada.nextLine();
            try {
                int opcion = Integer.parseInt(entradaOpcionMenu);
            } catch (Exception e) {
                System.out.println("Entrada inválida, intentalo de nuevo por favor.");
            }
        }
    }

    public void verCualquierMenuAlimento(){
        
    }

    public void ArmaBatido(){
        System.out.println("A continución te presentaremos los ingredientes con los que puedes armar tu batido" +
            " podrás seleccionar los que más te gusten");
    }
}
