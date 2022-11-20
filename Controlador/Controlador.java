package Controlador;

import java.util.Hashtable;
import java.util.Iterator;

import Cliente.Cliente;
import Cliente.ICuenta;
import Modelo.SigmaMeal;
import Productos.Alimentos.Comida;
import Productos.Batido.Batido;
import Vista.VistaMenuPrincipal;
import Vista.VistaUsuarioPremium;
import Vista.VistaUsuarioRegular;

public class Controlador{

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
        Hashtable<String,Cliente> clientes = sigmaMeal.leerClientes();
        Cliente recuperado = clientes.get(nombreUsuario);
        if(recuperado != null){
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

                // Armar tu propió batido (aun pendiente no se como implementarlo)
                break;
            case 4:
                // Arma tu propia comida (aun pendiente no se como implementarlo)
                break;
            case 5:
                vistaUsuarioPremium.compraBatidosPredeterminados();
                break;
            case 6:
                vistaUsuarioPremium.compraComidaPredeterminada();
                break;
            case 7:
                // Realiza una consulta médica.
                consultaMedica(false);
                break;
            case 8:
                // Consulta estrellas.
                break;
            case 9:
                // Consulta saldo.
                break;
            default:
                throw new IllegalStateException("Estado invalido en menu premium");
        }
    }

    public void ejecutarOpcionDeMenuRegular(int opcion) {
        switch (opcion) {
            case 1:
                devolverMenuDeProducto(1);
                break;
            case 2:
                devolverMenuDeProducto(2);
                break;
            case 3:
                
                break;
            case 4:

                break;
            case 5:
                // Realiza una consulta médica.

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
                menu += i + ".- " +  producto.getDescripcion() + " COSTO: $ " + producto.cost() + "\n";
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

    public boolean consultaMedica(boolean costo){
        return true;
    }

    public int consultaEstrellas(){
        return 1;
    }

    public double consultaSaldo(){
        return sigmaMeal.getClienteActual().getCuenta().mostrarSaldo();
    }

    public void realizaCompraBatidoPremium(int opcion){
        Iterator<Batido> itBatido = sigmaMeal.iteradorBatidosPredeterminados();
        double costo = 0;
        for (int i = 0; i < opcion; i++) {
            Batido batidoPagar = itBatido.next();
            costo = batidoPagar.cost();
            costo = costo - (costo * 0.15);
        }
        vistaUsuarioPremium.pagar(costo);
    }

    public void realizaCompraComidaPremium(int opcion){
        Iterator<Batido> itComida = sigmaMeal.iteradorComidasPredeterminadas();
        double costo = 0;
        for (int i = 0; i < opcion; i++) {
            Batido batidoPagar = itComida.next();
            costo = batidoPagar.cost();
            costo = costo - (costo * 0.15);
        }
        vistaUsuarioPremium.pagar(costo);
    }

    public boolean pagarPremium(double pago, long noCuenta, String nip){
        ICuenta cuentaActual = sigmaMeal.getClienteActual().getCuenta();
        if(!cuentaActual.validarCuenta(noCuenta, nip)){
            return false;
        }
        if(!cuentaActual.validarFondos(pago)){
            vistaUsuarioPremium.saldoInsuficiente();
            return false;
        }
        cuentaActual.pagar(pago);
        return true;
    }

    public void pagarRegular(){

    }

    public void regresaMenuPrincipal(){
        vistaMenuPrincipal.vistaPrincipalMenu();
    }
}
