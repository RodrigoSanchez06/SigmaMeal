package Controlador;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;

import Cliente.Cliente;
import Cliente.ICuenta;
import Modelo.SigmaMeal;
import Productos.Alimentos.AdapterBatido;
import Productos.Alimentos.Comida;
import Productos.Batido.Batido;
import Vista.VistaMenuPrincipal;
import Vista.VistaUsuarioPremium;
import Vista.VistaUsuarioRegular;

/*
 * Controlador de SigmaMeal
 */
public class Controlador {

    Scanner entrada = new Scanner(System.in);
    VistaMenuPrincipal vistaMenuPrincipal = new VistaMenuPrincipal(this); // Vista
    VistaUsuarioPremium vistaUsuarioPremium = new VistaUsuarioPremium(this); // Vista
    VistaUsuarioRegular vistaUsuarioRegular = new VistaUsuarioRegular(this); // Vista
    SigmaMeal sigmaMeal = new SigmaMeal(); // Modelo

    /**
     * Valida la opcion inicial del cliente y cambia la vista
     * @param opcionInicial opcion que inicial del cliente
     */
    public void opcionInicial(int opcionInicial) {
        if (opcionInicial == 1) {
            vistaUsuarioRegular.menuRegular();
        } else {
            vistaUsuarioPremium.inicioSesion();
        }
    }

    /**
     * Valida con el modelo el inicio de sesión del usuario
     * @param nombreUsuario 
     * @param contraseña
     * @return verdadero si coinciden las credenciales , false en cualquier otro caso.
     */
    public boolean iniciarSesion(String nombreUsuario, String contraseña) {
        Hashtable<String, Cliente> clientes = sigmaMeal.leerClientes();
        Cliente recuperado = clientes.get(nombreUsuario);
        if (recuperado != null) {
            sigmaMeal.setClienteActual(recuperado);
            return contraseña.equals(recuperado.getContraseña());
        }
        return false;
    }

    /**
     * Efectua la opción que selecciona el usuario en el menú premium
     * @param opcion opcion de menú premium
     */
    public void ejecutarOpcionDeMenuPremium(int opcion) {
        switch (opcion) {
            case 1:
                vistaUsuarioPremium.verCualquierMenuAlimento(devolverMenuDeProducto(1), 1);
                break;
            case 2:
                vistaUsuarioPremium.verCualquierMenuAlimento(devolverMenuDeProducto(2), 2);
                break;
            case 3:
                vistaUsuarioPremium.armaTuBatido();
                break;
            case 4:
                vistaUsuarioPremium.armaComida();
                break;
            case 5:
                vistaUsuarioPremium.compraBatidosPredeterminados();
                break;
            case 6:
                vistaUsuarioPremium.compraComidaPredeterminada();
                break;
            case 7:
                vistaUsuarioPremium.realizaConsulta(sigmaMeal.ExisteConsulta());
                break;
            case 8:
                vistaUsuarioPremium.consultaEstrellas();
                break;
            case 9:
                vistaUsuarioPremium.consultaSaldo();
                break;
            case 10:
                regresaMenuPrincipal();
                break;
            default:
                throw new IllegalStateException("Estado invalido en menu premium");
        }
    }

    /**
     * Efectua la opción que selecciona el usuario en el menú regular
     * @param opcion opcion de menú regular
     */
    public void ejecutarOpcionDeMenuRegular(int opcion) {
        switch (opcion) {
            case 1:
                vistaUsuarioRegular.verCualquierMenuAlimento(devolverMenuDeProducto(1), 1);
                break;
            case 2:
                vistaUsuarioRegular.verCualquierMenuAlimento(devolverMenuDeProducto(2), 2);
                break;
            case 3:
                vistaUsuarioRegular.compraBatidosPredeterminados();
                break;
            case 4:
                vistaUsuarioRegular.compraComidaPredeterminada();
                break;
            case 5:
                vistaUsuarioRegular.realizaConsulta();
                break;
            case 6:
                regresaMenuPrincipal();
                break;
            default:
                break;
        }
    }

    /**
     * Dependiendo del tipo de menú, devolverá un mení
     * @param tipoMenu tipo de menú
     * @return descripción del menú
     */
    public String devolverMenuDeProducto(int tipoMenu) {
        String menu = "";
        int i = 1;
        if (tipoMenu == 1) {
            Iterator<Batido> menuBatido = sigmaMeal.iteradorBatidosPredeterminados();
            while (menuBatido.hasNext()) {
                Batido producto = menuBatido.next();
                menu += i + ".- " + producto.getDescripcion() + " COSTO: $ " + producto.cost() + "\n";
                i++;
            }
        } else {
            Iterator<Batido> menuComida = sigmaMeal.iteradorComidasPredeterminadas();
            while (menuComida.hasNext()) {
                Batido producto = menuComida.next();
                menu += i + ".- " + producto.getDescripcion() + " COSTO: $ " + producto.cost() + "\n";
                i++;
            }
        }
        return menu;
    }

    /**
     * Inicia el programa con la vista principal.
     */
    public void iniciaPrograma() {
        vistaMenuPrincipal.vistaPrincipalMenu();
    }

    /**
     * Consulta las estrellas del cliente con el modelo.
     * @return cantidad de estrellas.
     */
    public int consultaEstrellas() {
        return sigmaMeal.getClienteActual().getEstrellas();
    }

    /**
     * Consulta el saldo del cliente con el modelo.
     * @return saldo del cliente.
     */
    public double consultaSaldo() {

        return sigmaMeal.getClienteActual().getCuenta().mostrarSaldo();
    }

    /**
     * Encuentra el batido y aplica descuentos premium
     * @param opcion opcion de batido.
     */
    public void realizaCompraBatidoPremium(int opcion) {
        Iterator<Batido> itBatido = sigmaMeal.iteradorBatidosPredeterminados();
        double costo = 0;
        for (int i = 0; i < opcion; i++) {
            Batido batidoPagar = itBatido.next();
            costo = batidoPagar.cost();
            costo = costo - (costo * 0.15);
        }
        vistaUsuarioPremium.pagar(costo);
    }

     /**
     * Encuentra la comida y aplica descuentos premium
     * @param opcion opcion de comida.
     */
    public void realizaCompraComidaPremium(int opcion) {
        Iterator<Batido> itComida = sigmaMeal.iteradorComidasPredeterminadas();
        double costo = 0;
        for (int i = 0; i < opcion; i++) {
            Batido batidoPagar = itComida.next();
            costo = batidoPagar.cost();
            costo = costo * 0.85;
        }
        vistaUsuarioPremium.pagar(costo);
    }

    /**
     * Encuentra el batido que desea el cliente regular
     * @param opcion opcion de batido.
     */
    public void realizaCompraBatidoRegular(int opcion){
        Iterator<Batido> itComida = sigmaMeal.iteradorBatidosPredeterminados();
        double costo = 0;
        for (int i = 0; i < opcion; i++) {
            Batido batidoPagar = itComida.next();
            costo = batidoPagar.cost();
        }
        vistaUsuarioRegular.pagar(costo);
    }

    /**
     * Encuentra la comida que desea el cliente regular
     * @param opcion opcion de comida.
     */
    public void realizaCompraComidaRegular(int opcion) {
        Iterator<Batido> itComida = sigmaMeal.iteradorComidasPredeterminadas();
        double costo = 0;
        for (int i = 0; i < opcion; i++) {
            Batido batidoPagar = itComida.next();
            costo = batidoPagar.cost();
        }
        vistaUsuarioRegular.pagar(costo);
    }

    /**
     * Valida con el modelo el número de cuenta y el nip del cliente y procede a hacer el pago.
     * @param pago costo.
     * @param noCuenta numero de cuenta del cliente.
     * @param nip nip del cliente.
     * @return si fue posible realizar el pago.
     */
    public boolean pagarPremium(double pago, long noCuenta, String nip) {
        ICuenta cuentaActual = sigmaMeal.getClienteActual().getCuenta();
        if (!cuentaActual.validarCuenta(noCuenta, nip)) {
            return false;
        }
        if (!cuentaActual.validarFondos(pago)) {
            vistaUsuarioPremium.saldoInsuficiente();
            return false;
        }
        cuentaActual.pagar(pago);
        this.agregaEstrellas((int) Math.floor(pago / 10));
        vistaUsuarioPremium.consultaSaldo();
        vistaUsuarioPremium.consultaEstrellas();
        return true;
    }

    /**
     * Añade las estrellas tras una compra.
     * @param n numero de estrellas.
     */
    public void agregaEstrellas(int n) {
        if (n <= 0)
            throw new IllegalArgumentException();
        this.sigmaMeal.getClienteActual().setEstrellas(this.sigmaMeal.getClienteActual().getEstrellas() + n);
    }

    /**
     * Regresa a la vista del menú principal.
     */
    public void regresaMenuPrincipal() {
        vistaMenuPrincipal.vistaPrincipalMenu();
    }

    /**
     * Regresa al menú de opciones premium.
     */
    public void regresaMenuDeOpcionesPremium(){
        vistaUsuarioPremium.menuPremium();
    }

    /**
     * Regresa al menú de opciones regular.
     */
    public void regresaMenuDeOpcionesRegular(){
        vistaUsuarioRegular.menuRegular();
    }

    /**
     * Arma un batido personalizado.
     * @param leche chiclocentro del batido.
     * @return batido personalzado.
     */
    public Batido armaBatido(int leche){
        Batido batido = sigmaMeal.armaBatido(leche);
        return batido;
        
    }

    /**
     * Arma una comida personalizada.
     * @param carbo chiclocentro de la comida.
     * @return comida personalizada.
     */
    public Batido armaComida(int carbo){ 
        Batido comida =  new AdapterBatido(sigmaMeal.armaComida(carbo));
        return comida;
    }

    /**
     * Asigna una consulta medica  al usuario
     * @param consulta consulta médica.
     */
    public void asignaConsulta(boolean consulta){
        sigmaMeal.asignaConsulta(consulta);
    }
}
