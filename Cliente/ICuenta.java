package Cliente;

import java.io.Serializable;

/**
 * Interfaz de una cuenta.
 */
public interface ICuenta extends Serializable {

    /**
     * Hace un pago en la cuenta.
     * @param monto a pagar.
     */
    void pagar(double monto);

    /**
     * regresa el saldo de la cuenta.
     * @return saldo cuenta.
     */
    double mostrarSaldo();

    /**
     * Valida los datos bancarios.
     * @param noCuenta numero de cuenta.
     * @param nip nip de seguridad.
     * @return true si las credenciales son correctas. false en cualquier otro caso.
     */
    boolean validarCuenta(long noCuenta, String nip);

    /**
     * Valida si existen fondos suficientes en la cuenta.
     * @param monto monto a pagar.
     * @return true si existen fondos suficientes , false en cualquier otro caso.
     */
    boolean validarFondos(double monto);
}
