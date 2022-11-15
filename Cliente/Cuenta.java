package Cliente;

import java.io.Serializable;

/**
 * Cuenta de puntos interna de SigmaMeal.
 */
public class Cuenta implements Serializable {

    private long noCuenta;
    private String nip;
    private double saldo;

    public Cuenta(long noCuenta, String nip, double saldo) {
        this.noCuenta = noCuenta;
        this.nip = nip;
        this.saldo = saldo;
    }

    /**
     * Método que transfiere o ()
     * 
     * @param cantidadTransferir
     * @param cuenta
     * @return
     */
    public boolean trasferir(double cantidadTransferir, Cuenta cuenta) {
        if (cantidadTransferir <= 0)
            throw new IllegalArgumentException("No se pueden transferir cantidades negativas");
        if (cantidadTransferir > this.saldo) {
            return false;
        } else {
            this.retirar(cantidadTransferir);
            cuenta.depositar(cantidadTransferir);
            return true;
        }
    }

    public void depositar(double cantidadDepositar) {
        if (cantidadDepositar <= 0)
            throw new IllegalArgumentException("No se pueden retirar cantidades negativas");
        saldo = saldo + cantidadDepositar;
    }

    public boolean retirar(double cantidadRetirar) {
        if (cantidadRetirar <= 0)
            throw new IllegalArgumentException("No se pueden retirar cantiades negativas");
        if (cantidadRetirar > saldo) {
            return false;
        } else {
            saldo = saldo - cantidadRetirar;
            return true;
        }
    }

    public double mostarSaldo() {
        return saldo;
    }
}
