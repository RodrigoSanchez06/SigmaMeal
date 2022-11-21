package Cliente;

/**
 * Proxy de una cuenta de SigmaMeal
 */
public class ProxyCuenta implements ICuenta{
    private ICuenta cuentaReal;

    /**
     * Cuenta de proxy que asigna una cuenta
     * @param c cuenta a asignar.
     */
    public ProxyCuenta(Cuenta c){
        if(c == null)
            throw new IllegalArgumentException();
        this.cuentaReal = c;
    }

    /**
     * Hace un pago en la cuenta.
     * @param monto a pagar.
     */
    public void pagar(double monto){
        this.cuentaReal.pagar(monto);
    }

     /**
     * Valida los datos bancarios.
     * @param noCuenta numero de cuenta.
     * @param nip nip de seguridad.
     * @return true si las credenciales son correctas. false en cualquier otro caso.
     */
    public boolean validarCuenta(long noCuenta, String nip){
        return this.cuentaReal.validarCuenta(noCuenta, nip);
    }

    /**
     * Valida si existen fondos suficientes en la cuenta.
     * @param monto monto a pagar.
     * @return true si existen fondos suficientes , false en cualquier otro caso.
     */
    public boolean validarFondos(double fondos){
        return this.cuentaReal.validarFondos(fondos);
    }

    /**
     * devuelve el saldo de la cuenta.
     * 
     * @return saldo de la cuenta
     */
    public double mostrarSaldo(){
        return this.cuentaReal.mostrarSaldo();
    }
}
