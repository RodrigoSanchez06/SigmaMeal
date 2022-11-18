package Cliente;

public class ProxyCuenta implements ICuenta{
    private ICuenta cuentaReal;

    public ProxyCuenta(Cuenta c){
        if(c == null)
            throw new IllegalArgumentException();
        this.cuentaReal = c;
    }

    public void pagar(double monto){
        this.cuentaReal.pagar(monto);
    }

    public boolean validarCuenta(long noCuenta, String nip){
        return this.cuentaReal.validarCuenta(noCuenta, nip);
    }

    public boolean validarFondos(double fondos){
        return this.cuentaReal.validarFondos(fondos);
    }

    public double mostrarSaldo(){
        return this.cuentaReal.mostrarSaldo();
    }
}
