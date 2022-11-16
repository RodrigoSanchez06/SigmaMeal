package Cliente;

import java.io.Serializable;

/**
 * Cuenta de puntos interna de SigmaMeal.
 */
public class Cuenta implements Serializable {

    private long noCuenta;
    private String nip;
    private double saldo;

    /**
     * Constructor de una cuenta interna de SigmaMeal.
     * 
     * @param noCuenta numero de cuenta.
     * @param nip      nip o password de la cuenta.
     * @param saldo    saldo con el que se iniciará la cuenta.
     */
    public Cuenta(long noCuenta, String nip, double saldo) {
        this.noCuenta = noCuenta;
        this.nip = nip;
        this.saldo = saldo;
    }

    /**
     * Método que transfiere una cantidad de dinero a otra cuenta.
     * 
     * @param cantidadTransferir
     * @param cuenta
     * @return true en caso de que se pueda transferir, false en otro caso.
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

    /**
     * Deposita una cantidad indicada a la cuenta.
     * 
     * @param cantidadDepositar cantidad a depositar.
     */
    public void depositar(double cantidadDepositar) {
        if (cantidadDepositar <= 0)
            throw new IllegalArgumentException("No se pueden retirar cantidades negativas");
        saldo = saldo + cantidadDepositar;
    }

    /**
     * Retira una cantidad de dinero a la cuenta especificada.
     * 
     * @param cantidadRetirar cantidad a retirar.
     * @return true en caso de que se pueda retirar, false en otro caso.
     */
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

    /**
     * Muestra el saldo de la cuenta.
     * 
     * @return saldo de la cuenta
     */
    public double mostarSaldo() {
        return saldo;
    }
}
