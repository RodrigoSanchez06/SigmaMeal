package Modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import Cliente.Cliente;
import Cliente.Cuenta;
import Productos.Alimentos.AdapterBatido;
import Productos.Alimentos.Predeterminadas.Carnivoro;
import Productos.Alimentos.Predeterminadas.Ligero;
import Productos.Alimentos.Predeterminadas.Tradicional;
import Productos.Batido.Batido;
import Productos.Batido.Ingredientes.Cereales.Amaranto;
import Productos.Batido.Ingredientes.Cereales.Avena;
import Productos.Batido.Ingredientes.Cereales.Granola;
import Productos.Batido.Ingredientes.Frutas.FresaNatural;
import Productos.Batido.Ingredientes.Frutas.Mamey;
import Productos.Batido.Ingredientes.Frutas.Platano;
import Productos.Batido.Ingredientes.Leches.LecheDeslactosada;
import Productos.Batido.Ingredientes.Leches.LecheEntera;
import Productos.Batido.Ingredientes.Leches.LecheProteica;
import Productos.Batido.Ingredientes.Scoops.Chocolate;
import Productos.Batido.Ingredientes.Scoops.Fresa;
import Productos.Batido.Ingredientes.Scoops.Vainilla;
import Productos.Batido.Predeterminados.LaBarbara;
import Productos.Batido.Predeterminados.LaCoqueta;
import Productos.Batido.Predeterminados.LaPonchada;

public class SigmaMeal {

    private Cliente actual;
    Scanner entrada = new Scanner(System.in);

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

    public Batido armaBatido(int leche){
        switch (leche) {
            case 1:
                LecheDeslactosada deslactosada = new LecheDeslactosada();
                return seleccionaScoop(deslactosada);
            case 2:
                LecheEntera entera = new LecheEntera();
                return seleccionaScoop(entera);
            case 3:
                LecheProteica proteica = new LecheProteica();
                return seleccionaScoop(proteica);
            default:
                throw new IllegalArgumentException("Eleccion de leche inválida");
        }
    }

    public Batido seleccionaScoop(Batido batido){
        Batido batidoEnPreparacion = batido;
        while (true) {
            try {
                System.out.println("Ahora, selecciona el Scoop de tu preferencia.\n"
                + "1.- Chocolate.\n"
                + "2.- Fresa.\n"
                + "3.- Vainilla.");
                String entradaScoop = entrada.nextLine();
                int opScoop = Integer.parseInt(entradaScoop);
                if (opScoop >= 1 && opScoop <= 3) {
                    if (opScoop == 1) {
                        batidoEnPreparacion = new Chocolate(batidoEnPreparacion);
                    } else if (opScoop == 2){
                        batidoEnPreparacion = new Fresa(batidoEnPreparacion);
                    } else {
                        batidoEnPreparacion = new Vainilla(batidoEnPreparacion);
                    }
                    return seleccionFruta(batidoEnPreparacion);
                } else {
                    System.out.println("Opción inexistente, intentalo de nuevo por favor.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, intentalo de nuevo.");
            }   
        }
    }

    public Batido seleccionFruta(Batido batido){
        Batido batidoEnPreparacion = batido;
        while (true) {
            try {
                System.out.println("Ahora, selecciona la fruta de tu preferencia.\n"
                + "1.- Fresa Natural.\n"
                + "2.- Mamey.\n"
                + "3.- Plátano.");
                String entradaScoop = entrada.nextLine();
                int opScoop = Integer.parseInt(entradaScoop);
                if (opScoop >= 1 && opScoop <= 3) {
                    if (opScoop == 1) {
                        batidoEnPreparacion = new FresaNatural(batidoEnPreparacion);
                    } else if (opScoop == 2){
                        batidoEnPreparacion = new Mamey(batidoEnPreparacion);
                    } else {
                        batidoEnPreparacion = new Platano(batidoEnPreparacion);
                    }
                    return seleccionFruta(batidoEnPreparacion);
                } else {
                    System.out.println("Opción inexistente, intentalo de nuevo por favor.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, intentalo de nuevo.");
            }   
        }
    }

    public Batido seleccionaCereal(Batido batido){
        Batido batidoEnPreparacion = batido;
        while (true) {
            try {
                System.out.println("Ahora, selecciona el cereal de tu preferencia.\n"
                + "1.- Amaranto.\n"
                + "2.- Avena.\n"
                + "3.- Granola.");
                String entradaScoop = entrada.nextLine();
                int opScoop = Integer.parseInt(entradaScoop);
                if (opScoop >= 1 && opScoop <= 3) {
                    if (opScoop == 1) {
                        batidoEnPreparacion = new Amaranto(batidoEnPreparacion);
                    } else if (opScoop == 2){
                        batidoEnPreparacion = new Avena(batidoEnPreparacion);
                    } else {
                        batidoEnPreparacion = new Granola(batidoEnPreparacion);
                    }
                    return batidoEnPreparacion;
                } else {
                    System.out.println("Opción inexistente, intentalo de nuevo por favor.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, intentalo de nuevo.");
            }   
        }
    }

    
}