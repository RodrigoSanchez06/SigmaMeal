package Cliente;

import java.io.Serializable;

public interface ICuenta extends Serializable {
    void pagar(double monto);

    double mostrarSaldo();

    boolean validarCuenta(long noCuenta, String nip);

    boolean validarFondos(double monto);
}
