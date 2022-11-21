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
import Productos.Alimentos.Comida;
import Productos.Alimentos.Ingredientes.Carbos.Arroz;
import Productos.Alimentos.Ingredientes.Carbos.Lentejas;
import Productos.Alimentos.Ingredientes.Carbos.Pasta;
import Productos.Alimentos.Ingredientes.Proteinas.Atun;
import Productos.Alimentos.Ingredientes.Proteinas.Bistec;
import Productos.Alimentos.Ingredientes.Proteinas.Pollo;
import Productos.Alimentos.Ingredientes.Verduras.Brocoli;
import Productos.Alimentos.Ingredientes.Verduras.Calabaza;
import Productos.Alimentos.Ingredientes.Verduras.Chayote;
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

/**
 * Modelo de Sigma meal
 */
public class SigmaMeal {

    private Cliente actual;
    Scanner entrada = new Scanner(System.in);

    /**
     * Constructor por defecto de SigmaMeal
     * registra los clientes que tiene en su banco de datos
     */
    public SigmaMeal() {
        registrarClientes(crearCuentas());
    }

    /**
     * Registra los clientes.
     * @param cuentas arreglo de cuentas a itroducir
     */
    public void registrarClientes(Cuenta[] cuentas) {
        Hashtable<String, Cliente> clientes = new Hashtable<String, Cliente>();
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

    /**
     * Devuelve el cliente con el que se está trabajando
     * @return cliente con el que se trabaja.
     */
    public Cliente getClienteActual() {
        return this.actual;
    }

    /**
     * Asigna un cliente con el que se trabajará.
     * @param c cliente con el que se trabajará.
     */
    public void setClienteActual(Cliente c) {
        if (c == null)
            throw new NullPointerException();
        this.actual = c;
    }

    /**
     * Crea las cuentas que estarán dadas de alta en el sistema.
     * @return
     */
    private Cuenta[] crearCuentas() {
        Cuenta[] cuentas = new Cuenta[3];
        cuentas[0] = new Cuenta(319222571, "1234", 6754);
        cuentas[1] = new Cuenta(123456789, "1213", 2450);
        cuentas[2] = new Cuenta(987654321, "0987", 567);
        return cuentas;
    }

    /**
     * Lee los clientes de una estructura HashTable previamente serializada.
     */
    public Hashtable<String, Cliente> leerClientes() {
        Hashtable<String, Cliente> listaClientes = null;
        try {
            ObjectInputStream recuperarCLientes = new ObjectInputStream(
                    new FileInputStream("RegistroClientes/listaEmpleados.txt"));
            listaClientes = (Hashtable<String, Cliente>) recuperarCLientes.readObject();
            recuperarCLientes.close();
        } catch (Exception e) {
            System.out.println("Error al leer clientes " + e);
        }
        return listaClientes;
    }

    /*
     * Regresa un iterador de tipo Batido que será del menú de comidas
     */
    public static Iterator<Batido> iteradorComidasPredeterminadas() {
        LinkedList<Batido> temp = new LinkedList<>();
        temp.add(new AdapterBatido(new Carnivoro()));
        temp.add(new AdapterBatido(new Ligero()));
        temp.add(new AdapterBatido(new Tradicional()));
        return temp.iterator();
    }

    /**
     * Regres un iterador de tipo batido que será menu de batidos
     */
    public static Iterator<Batido> iteradorBatidosPredeterminados() {
        LinkedList<Batido> temp = new LinkedList<>();
        temp.add(new LaBarbara());
        temp.add(new LaCoqueta());
        temp.add(new LaPonchada());
        return temp.iterator();
    }

    /**
     * Arma un batido predeterminado
     * @param leche opc de leche
     * @return batido predeterminado
     */
    public Batido armaBatido(int leche) {
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

    /**
     * Selecciona Scoop de un batido predeterminado
     * @param batido batido que se está preparando
     * @return batido personalizado
     */
    public Batido seleccionaScoop(Batido batido) {
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
                    } else if (opScoop == 2) {
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

    /**
     * Selecciona fruta a un batido predeterminado
     * @param batido batido que se está preparando
     * @return batido personalizado
     */
    public Batido seleccionFruta(Batido batido) {
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
                    } else if (opScoop == 2) {
                        batidoEnPreparacion = new Mamey(batidoEnPreparacion);
                    } else {
                        batidoEnPreparacion = new Platano(batidoEnPreparacion);
                    }
                    return seleccionaCereal(batidoEnPreparacion);
                } else {
                    System.out.println("Opción inexistente, intentalo de nuevo por favor.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, intentalo de nuevo.");
            }
        }
    }

    /**
     * Selecciona Cereal a un batido predeterminado
     * @param batido batido que se está preparando
     * @return batido personalizado
     */
    public Batido seleccionaCereal(Batido batido) {
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
                    } else if (opScoop == 2) {
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

    /**
     * Arma un Comida predeterminado
     * @param carbo opc de carbohidrato
     * @return comida predeterminado
     */
    public Comida armaComida(int carbo) {
        switch (carbo) {
            case 1:
                Arroz arroz = new Arroz();
                return eligeProteina(arroz);
            case 2:
                Lentejas lentejas = new Lentejas();
                return eligeProteina(lentejas);
            case 3:
                Pasta pasta = new Pasta();
                return eligeProteina(pasta);
            default:
                throw new IllegalArgumentException("Elección de carbohidrato");
        }
    }

     /**
     * Selecciona proteína a una comida predeterminada
     * @param comida batido que se está preparando
     * @return comida personalizado
     */
    public Comida eligeProteina(Comida comida) {
        Comida comidaEnPreparacion = comida;
        while (true) {
            try {
                System.out.println("Ahora, selecciona la proteína de tu preferencia.\n"
                        + "1.- Atún.\n"
                        + "2.- Bistec.\n"
                        + "3.- Pollo.");
                String entradaProte = entrada.nextLine();
                int opProte = Integer.parseInt(entradaProte);
                if (opProte >= 1 && opProte <= 3) {
                    if (opProte == 1) {
                        comidaEnPreparacion = new Atun(comidaEnPreparacion);
                    } else if (opProte == 2) {
                        comidaEnPreparacion = new Bistec(comidaEnPreparacion);
                    } else {
                        comidaEnPreparacion = new Pollo(comidaEnPreparacion);
                    }
                    return seleccionaVerduras(comidaEnPreparacion);
                } else {
                    System.out.println("Opción inexistente, intentalo de nuevo por favor.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, intentalo de nuevo.");
            }
        }
    }

    /**
     * Selecciona verdura a una comida predeterminada
     * @param comida batido que se está preparando
     * @return comida personalizado
     */
    public Comida seleccionaVerduras(Comida comida) {
        Comida comidaEnPreparacion = comida;
        while (true) {
            try {
                System.out.println("Ahora, selecciona la verdura de tu preferencia.\n"
                        + "1.- Brocolí.\n"
                        + "2.- Calabaza.\n"
                        + "3.- Chayote.");
                String entradaVerdura = entrada.nextLine();
                int opVerdura = Integer.parseInt(entradaVerdura);
                if (opVerdura >= 1 && opVerdura <= 3) {
                    if (opVerdura == 1) {
                        comidaEnPreparacion = new Brocoli(comidaEnPreparacion);
                    } else if (opVerdura == 2) {
                        comidaEnPreparacion = new Calabaza(comidaEnPreparacion);
                    } else {
                        comidaEnPreparacion = new Chayote(comidaEnPreparacion);
                    }
                    return comidaEnPreparacion;
                } else {
                    System.out.println("Opción inexistente, intentalo de nuevo por favor.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, intentalo de nuevo.");
            }
        }
    }

    /**
     * Corrobora si el cliente actual tiene una consulta
     * @return existe consulta
     */
    public boolean ExisteConsulta(){
        return actual.getCitaMedica();
    }

    /**
     * Asigna una consulta al cliente actual.
     * @param consulta estado de la consulta.
     */
    public void asignaConsulta(boolean consulta){
        actual.setCitaMedica(consulta);
    }

}