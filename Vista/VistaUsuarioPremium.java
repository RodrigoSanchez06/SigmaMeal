package Vista;

import java.util.Scanner;

import Controlador.Controlador;

public class VistaUsuarioPremium {

    Scanner entrada = new Scanner(System.in);
    Controlador controlador;

    public VistaUsuarioPremium(Controlador controlador) {
        this.controlador = controlador;
    }

    public void inicioSesion() {
        int intentos = 1;
        while (intentos < 4) {
            System.out.println("Para ingresar como Usuario premium, deberás iniciar Sesión \n" +
                "Introduce tu nombre  de Usuario: ");
            String nombreUsuario = entrada.nextLine();
            System.out.println("Introduce tu contraseña: ");
            String password = entrada.nextLine();
            if (controlador.iniciarSesion(nombreUsuario, password)) {
                System.out.println("Bienvenido. a Sigma Meal PREMIUM");
                menuPremium();
                break;
            } else {
                System.out.println("Error, Nombre de ususario o contraseña incorrecta\nIntentos: " + intentos + " de 3");
                intentos++;
            }      
        }
        if (intentos == 4) {
            System.out.println("Lo sentimos haz excedido el número de intentos");
            controlador.regresaMenuPrincipal();
        } 
    }

    public void menuPremium() {
        while (true) {
            System.out
                    .println("Aquí tienes el menú de opciones para usuarios PREMIUM, Selecciona la que más te guste: \n"
                            + "1.- Ver menú de Batidos. \n"
                            + "2.- Ver menú de Alimentos. \n"
                            + "3.- Arma tu propio Batido. \n"
                            + "4.- Arma tu propia Comida. \n"
                            + "5.- Compra un Batido. \n"
                            + "6.- Compra tu Comida. \n"
                            + "7.- Realiza una consulta. \n"
                            + "8.- Consulta Estrellas.\n"
                            + "9.- Consulta Saldo.\n"
                            + "10.- Salir al menú principal.");
            String entradaOpcionMenu = entrada.nextLine();
            try {
                int opcion = Integer.parseInt(entradaOpcionMenu);
                controlador.ejecutarOpcionDeMenuPremium(opcion);
            } catch (Exception e) {
                System.out.println("Entrada inválida, intentalo de nuevo por favor.");
            }
        }
    }

    public void verCualquierMenuAlimento(String menu, int tipoMenu) {
        if (tipoMenu == 1) {
            System.out.print("Estos son nuestros batidos predeterminados. \n"
                + menu);
        } else {
            System.out.println("Estos son nuestros alimentos predeterminados. \n"
                + menu);
        }
    }

    public void armaBatido() {
        System.out.println("A continución te presentaremos los ingredientes con los que puedes armar tu batido" +
                " podrás seleccionar los ingredientes que más te gusten");
    }

    public void armaComida(){
        System.out.println("A continución te presentaremos los ingredientes con los que puedes armar tu comida" +
                " podrás seleccionar los ingredientes que más te gusten");
    }

    public void realizaConsulta(boolean citaDisponible){
        if (citaDisponible) {
            System.out.println("Tu cita ha sido agendada con éxito.\n"
            +   "Esta cita será sin costo, usted cuenta con un plan Premium");
        } else {
            System.out.println("Ya cuentas con una cita médica");
        }
    }

    public void consultaEstrellas(){
        System.out.println("Actualmente cuentas con: " + controlador.consultaEstrellas() + " estrellas.");
    }

    public void consultaSaldo(){
        System.out.println("Tu saldo es: $" + controlador.consultaSaldo());
    }

    public void compraBatidosPredeterminados(){
        while (true) {
            try {
                System.out.println("Elige el batido predeterminado de tu preferencia: ");
                controlador.ejecutarOpcionDeMenuPremium(1);
                System.out.println("4.- Regresar al menu  de opciones.");
                String entradaPredeterminado = entrada.nextLine();
                int opcion = Integer.parseInt(entradaPredeterminado);
                if (opcion == 1 || opcion == 2 || opcion == 3) {
                    controlador.realizaCompraBatidoPremium(opcion);
                    break;   
                } else if(opcion == 4){
                    controlador.regresaMenuDeOpcionesPremium();
                } else {
                    System.out.println("Esta opcion no existe intentaló de nuevo");
                }
            } catch (NumberFormatException e) {
                System.out.println("Intentalo de nuevo");
            }   
        }
    }

    public void compraComidaPredeterminada(){
        while (true) {
            try {
                System.out.println("Elige la comida predeterminada de tu preferencia: ");
                controlador.ejecutarOpcionDeMenuPremium(2);
                String entradaPredeterminado = entrada.nextLine();
                int opcion = Integer.parseInt(entradaPredeterminado);
                if (opcion == 1 || opcion == 2 || opcion == 3) {
                    controlador.realizaCompraComidaPremium(opcion);
                    break;   
                } else {
                    System.out.println("Esta opcion no existe intentaló de nuevo");
                }
            } catch (NumberFormatException e) {
                System.out.println("Intentalo de nuevo");
            }   
        }
    }

    public void pagar(double costo){
        System.out.println("El monto a pagar es: " + costo);
        System.out.println("Procederemos a validar tus datos bancarios para finalizar la compra.");
        String entradaNoCuenta;
        String entradaNip;
        int intentos  = 1;
        while (intentos < 4 ) {
                System.out.println("Introduce tu numero de cuenta: ");
                entradaNoCuenta = entrada.nextLine();
            try {
                System.out.println("Introduce tu nip: ");
                entradaNip = entrada.nextLine();

                long noCuenta = Long.parseLong(entradaNoCuenta);
                if (controlador.pagarPremium(costo, noCuenta, entradaNip)) {
                    System.out.println("Muchas gracias por su compra, El monto ha sido cargado a su cuenta SigmaMeal.");
                    break;
                } else {
                    System.out.println("Numero de cuenta o nip  INCORRECTO, intentalo  de nuevo\nintentos: " + intentos 
                            + " de 3");
                    intentos++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error en el Número de cuenta o en el nip, intentalo  de nuevo\nintentos: " + intentos 
                            + " de 3");
                intentos++;
            }   
        }
        if(intentos == 4) System.out.println("Lo sentimos Haz excedido el número de intentos");
    }

    public void armaTuBatido(){
        while (true) {
            try {
                System.out.println("Primero, selecciona la leche de tu preferencia.\n"
                + "1.- Leche Deslactosada.\n"
                + "2.- Leche Entera.\n"
                + "3.- Leche Protéica.");
                String entradaLeche = entrada.nextLine();
                int opLeche = Integer.parseInt(entradaLeche);
                if (opLeche >= 1 && opLeche <= 3) {
                    controlador.armaBatido(opLeche);
                    break;
                } else {
                    System.out.println("Opción inexistente, intentalo de nuevo por favor.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, intentalo de nuevo.");
            }   
        }
    }
}
