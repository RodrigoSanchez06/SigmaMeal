package Cliente;

import java.io.Serializable;

public class Cliente implements Serializable {

    private String nombreUsuario;
    private String password;
    private String nombre;
    private int edad;
    private int estatura;
    private double peso;
    private Cuenta cuentaAsociada;
    private int estrellas; // Por cada 10 pesos es una estrella.

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

    public String toString() {
        return nombreUsuario + " " + nombre + " " + edad + " " + estatura + " " + peso + " " + estrellas;
    }

}
