package Cliente;

import java.io.Serializable;

/**
 * Clase que representa a un Cliente dado de alta en SigmaMeal
 */
public class Cliente implements Serializable {

    private String nombreUsuario;
    private String password;
    private String nombre;
    private int edad;
    private int estatura;
    private double peso;
    private Cuenta cuentaAsociada; // Cuenta de puntos asociado.
    private int estrellas; // Por cada 10 pesos es una estrella.
    private boolean citaMedica;

    /**
     * Constructor de un Cliente
     * 
     * @param nombreUsuario  nombre de usuario del cliente.
     * @param password       contraseña del cliente.
     * @param nombre         nombre del cliente.
     * @param edad           edad del cliente.
     * @param estatura       estatura del cliente.
     * @param peso           peso del cliente.
     * @param cuentaAsociada cuenta de SigmaMeal asociada.
     * @param estrellas      Estrellas del usuario.
     */
    public Cliente(String nombreUsuario, String password, String nombre, int edad, int estatura, double peso,
            Cuenta cuentaAsociada, int estrellas) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.cuentaAsociada = cuentaAsociada;
        this.estrellas = estrellas;
    }

    @Override
    public String toString() {
        return nombreUsuario + " " + nombre + " " + edad + " " + estatura + " " + peso + " " + estrellas;
    }
}
