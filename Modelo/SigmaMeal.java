package Modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import Cliente.Cliente;
import Cliente.Cuenta;
import Productos.Alimentos.Comida;
import Productos.Alimentos.Predeterminadas.Carnivoro;
import Productos.Alimentos.Predeterminadas.Ligero;
import Productos.Alimentos.Predeterminadas.Tradicional;
import Productos.Batido.Batido;
import Productos.Batido.Predeterminados.LaBarbara;
import Productos.Batido.Predeterminados.LaCoqueta;
import Productos.Batido.Predeterminados.LaPonchada;

public class SigmaMeal {

    public SigmaMeal() {
        registrarClientes(crearCuentas());
    }

    public void registrarClientes(Cuenta[] cuentas) {
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
            System.out.println("Error al leer clientes " + e);
        }
    }

    public static Iterator<Comida> iteradorComidasPredeterminadas(){
        LinkedList<Comida> temp = new LinkedList<>();
        temp.add(new Carnivoro());
        temp.add(new Ligero());
        temp.add(new Tradicional());
        return temp.iterator();
    }

    public static Iterator<Batido> iteradorBatidosPredeterminados(){
        LinkedList<Batido> temp = new LinkedList<>();
        temp.add(new LaBarbara());
        temp.add(new LaCoqueta());
        temp.add(new LaPonchada());
        return temp.iterator();
    }
}