package Controlador;

import Maquina.SigmaMeal;
import Vista.VistaMenuPrincipal;
import Vista.VistaUsuarioPremium;
import Vista.VistaUsuarioRegular;

public class Controlador {

    VistaMenuPrincipal vistaMenuPrincipal = new VistaMenuPrincipal(this); // Vista
    VistaUsuarioPremium vistaUsuarioPremium = new VistaUsuarioPremium(this); // Vista
    VistaUsuarioRegular vistaUsuarioRegular = new VistaUsuarioRegular(this); // Vista
    SigmaMeal sigmaMeal = new SigmaMeal(); // Modelo

    public void iniciarSesion(String nombreUsuario, String contraseña) {

    }

    public void opcionInicial(int opcionInicial) {
        if (opcionInicial == 1) {
            vistaUsuarioRegular.menuRegular();
        } else {
            vistaUsuarioPremium.inicioSesion();
        }
    }

    public void ejecutarOpcionDeMenuPremium(int opcion) {
        switch (opcion) {
            case 1:
                devolverMenuDeProducto(1);
                break;
            case 2:
                devolverMenuDeProducto(2);
                break;
            case 3:
                // Armar tu propió batido (aun pendiente no se como implementarlo)
                break;
            case 4:
                // Arma tu propia comida (aun pendiente no se como implementarlo)
                break;
            case 5:
                // Compra un batido de los predeterminados
                break;
            case 6:
                // Compra una comida de los predeterminados.
                break;
            case 7:
                // Realiza una consulta médica.
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
                // Compra un batido de los predeterminados
                break;
            case 4:
                // Compra una comida de los predeterminados.
                break;
            case 5:
                // Realiza una consulta médica.
                break;
            default:
                break;
        }
    }

    public void devolverMenuDeProducto(int tipoMenu) {

    }

    public void iniciaPrograma() {
        vistaMenuPrincipal.vistaPrincipalMenu();
    }
}
