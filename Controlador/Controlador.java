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

public class Controlador {

    Scanner entrada = new Scanner(System.in);
    VistaMenuPrincipal vistaMenuPrincipal = new VistaMenuPrincipal(this); // Vista
    VistaUsuarioPremium vistaUsuarioPremium = new VistaUsuarioPremium(this); // Vista
    VistaUsuarioRegular vistaUsuarioRegular = new VistaUsuarioRegular(this); // Vista
    SigmaMeal sigmaMeal = new SigmaMeal(); // Modelo

    public void opcionInicial(int opcionInicial) {
        if (opcionInicial == 1) {
            vistaUsuarioRegular.menuRegular();
        } else {
            vistaUsuarioPremium.inicioSesion();
        }
    }

    public boolean iniciarSesion(String nombreUsuario, String contraseña) {
        Hashtable<String, Cliente> clientes = sigmaMeal.leerClientes();
        Cliente recuperado = clientes.get(nombreUsuario);
        if (recuperado != null) {
            sigmaMeal.setClienteActual(recuperado);
            return contraseña.equals(recuperado.getContraseña());
        }
        return false;
    }

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

    public void iniciaPrograma() {
        vistaMenuPrincipal.vistaPrincipalMenu();
    }

    public int consultaEstrellas() {
        return sigmaMeal.getClienteActual().getEstrellas();
    }

    public double consultaSaldo() {

        return sigmaMeal.getClienteActual().getCuenta().mostrarSaldo();
    }

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

    public void realizaCompraBatidoRegular(int opcion){
        Iterator<Batido> itComida = sigmaMeal.iteradorBatidosPredeterminados();
        double costo = 0;
        for (int i = 0; i < opcion; i++) {
            Batido batidoPagar = itComida.next();
            costo = batidoPagar.cost();
        }
        vistaUsuarioRegular.pagar(costo);
    }

    public void realizaCompraComidaRegular(int opcion) {
        Iterator<Batido> itComida = sigmaMeal.iteradorComidasPredeterminadas();
        double costo = 0;
        for (int i = 0; i < opcion; i++) {
            Batido batidoPagar = itComida.next();
            costo = batidoPagar.cost();
        }
        vistaUsuarioRegular.pagar(costo);
    }

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

    public void agregaEstrellas(int n) {
        if (n <= 0)
            throw new IllegalArgumentException();
        this.sigmaMeal.getClienteActual().setEstrellas(this.sigmaMeal.getClienteActual().getEstrellas() + n);
    }

    public void regresaMenuPrincipal() {
        vistaMenuPrincipal.vistaPrincipalMenu();
    }

    public void regresaMenuDeOpcionesPremium(){
        vistaUsuarioPremium.menuPremium();
    }

    public void regresaMenuDeOpcionesRegular(){
        vistaUsuarioRegular.menuRegular();
    }

    public Batido armaBatido(int leche){
        Batido batido = sigmaMeal.armaBatido(leche);
        return batido;
        
    }

    public Batido armaComida(int carbo){ 
        Batido comida =  new AdapterBatido(sigmaMeal.armaComida(carbo));
        return comida;
    }

    public void asignaConsulta(boolean consulta){
        sigmaMeal.asignaConsulta(consulta);
    }
}
