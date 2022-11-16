import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

import Cliente.Cliente;
import Cliente.Cuenta;

public class SigmaMeal {

    public SigmaMeal() {
        registrarClientes(crearCuentas());
    }

    public void registrarClientes(Cuenta[] cuentas) {

        //listaCliente[0] = new Cliente("Gonzalo777", "gonzalito123", "Gonzalo", 34, 170, 76.5, cuentas[0], 28);
        //listaCliente[1] = new Cliente("Mar123", "mar0217", "Maria", 19, 176, 70.1, cuentas[1], 100);
        //listaCliente[2] = new Cliente("TimiPro", "tim123", "Timi", 18, 180, 98.3, cuentas[2], 200);

        Hashtable<String,Cliente> clientes = new Hashtable<String,Cliente>();
        clientes.put("Gonzalo777", new Cliente("Gonzalo777", "gonzalito123", "Gonzalo", 34, 170, 76.5, cuentas[0], 28));
        clientes.put("Mar123", new Cliente("Mar123", "mar0217", "Maria", 19, 176, 70.1, cuentas[1], 100));
        clientes.put("TimiPro", new Cliente("TimiPro", "tim123", "Timi", 18, 180, 98.3, cuentas[2], 200));

        try {
            ObjectOutputStream escribeFichero = new ObjectOutputStream(new FileOutputStream(
                    "RegistroClientes/listaEmpleados.txt"));
            escribeFichero.writeObject(clientes);
            escribeFichero.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private Cuenta[] crearCuentas() {
        Cuenta[] cuentas = new Cuenta[3];
        cuentas[0] = new Cuenta(319222571, "1234", 6754);
        cuentas[1] = new Cuenta(123456789, "1213", 2450);
        cuentas[2] = new Cuenta(987654321, "0987", 567);
        return cuentas;
    }

    public void leerClientes() {
        try {
            ObjectInputStream recuperarCLientes = new ObjectInputStream(
                    new FileInputStream("RegistroClientes/listaEmpleados.txt"));
            Cliente[] listaClientes = (Cliente[]) recuperarCLientes.readObject();
            recuperarCLientes.close();
            for (int i = 0; i < listaClientes.length; i++) {
                System.out.println(listaClientes[i].toString());
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
