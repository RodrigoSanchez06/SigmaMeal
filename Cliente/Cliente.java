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
    private ICuenta cuentaAsociada; // Cuenta de puntos asociado.
    private int estrellas; // Por cada 10 pesos es una estrella.
    private boolean citaMedica = false;

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
            ICuenta cuentaAsociada, int estrellas) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.cuentaAsociada = cuentaAsociada;
        this.estrellas = estrellas;
    }

    /**
     * @return regresa la contraseña del cliente
     */
    public String getContraseña(){
        return this.password;
    }

    /**
     * @return cuenta asociada del cliente
     */
    public ICuenta getCuenta(){
        return this.cuentaAsociada;
    }

    /**
     * @return estrellas del cliente
     */
    public int getEstrellas(){
        return this.estrellas;
    }

    /**
     * Asigna estrellas a las estrellas del cliente
     * @param n estrellas
     */
    public void setEstrellas(int n){
        if(n <= 0)
            throw new IllegalArgumentException();
        this.estrellas = n;
    }

    /**
     * Representación textual de un cliente.
     */
    @Override
    public String toString() {
        return nombreUsuario + " " + nombre + " " + edad + " " + estatura + " " + peso + " " + estrellas;
    }

    /**
     * asigna una cita médica
     * @param hayCita existe cita
     */
    public void setCitaMedica(boolean hayCita){
        this.citaMedica = hayCita;
    }

    /**
     * @return disponibilidad de cita médica
     */
    public boolean getCitaMedica(){
        return this.citaMedica;
    }
}
