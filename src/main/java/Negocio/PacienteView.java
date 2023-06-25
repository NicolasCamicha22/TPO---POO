/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

/**
 *
 * @author nicol
 */
public class PacienteView {
    private String dni;
    private String nombre;
    private String domicilio;
    private String mail;
    private String sexo;
    private int edad;
    
    public PacienteView(String dni, String nombre, String domicilio, String mail, String sexo, int edad) {
            this.dni = dni;
            this.nombre = nombre;
            this.domicilio = domicilio;
            this.mail = mail;
            this.sexo = sexo;
            this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getMail() {
        return mail;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }
    
}
