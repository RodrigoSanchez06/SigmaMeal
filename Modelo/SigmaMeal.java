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
import Productos.Alimentos.AdapterBatido;
import Productos.Alimentos.Comida;
import Productos.Alimentos.Predeterminadas.Carnivoro;
import Productos.Alimentos.Predeterminadas.Ligero;
import Productos.Alimentos.Predeterminadas.Tradicional;
import Productos.Batido.Batido;
import Productos.Batido.Predeterminados.LaBarbara;
import Productos.Batido.Predeterminados.LaCoqueta;
import Productos.Batido.Predeterminados.LaPonchada;

public class SigmaMeal {

    private Cliente actual;

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

    public Cliente getClienteActual(){
        return this.actual;
    }

    public void setClienteActual(Cliente c){
        if(c == null)
            throw new NullPointerException();
        this.actual = c;
    }

    private Cuenta[] crearCuentas() {
        Cuenta[] cuentas = new Cuenta[3];
        cuentas[0] = new Cuenta(319222571, "1234", 6754);
        cuentas[1] = new Cuenta(123456789, "1213", 2450);
        cuentas[2] = new Cuenta(987654321, "0987", 567);
        return cuentas;
    }

    public Hashtable<String,Cliente> leerClientes() {
        Hashtable<String,Cliente> listaClientes=null;
        try {
            ObjectInputStream recuperarCLientes = new ObjectInputStream(
                    new FileInputStream("RegistroClientes/listaEmpleados.txt"));
            listaClientes = (Hashtable<String,Cliente>) recuperarCLientes.readObject();
            recuperarCLientes.close();
        } catch (Exception e) {
            System.out.println("Error al leer clientes " + e);
        }
        return listaClientes;
    }

    public static Iterator<Batido> iteradorComidasPredeterminadas(){
        LinkedList<Batido> temp = new LinkedList<>();
        temp.add(new AdapterBatido(new Carnivoro()));
        temp.add(new AdapterBatido(new Ligero()));
        temp.add(new AdapterBatido(new Tradicional()));
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