/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author hanzo
 */
public class ControladorLogin {
    /*
     * 1. Módulo de Autenticación y Seguridad
     * Permite el acceso seguro al sistema mediante usuarios registrados. Incluye formulario de login y registro con validaciones.
     * 
     * Validaciones:
     * · - El email y nombre no deben repetirse.
     * · - Las contraseñas deben coincidir.
     */

    // Datos del usuario
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String genero;
    private String email;
    private String contrasena;

    public ControladorLogin(String nombre, String apellido, String dni, String telefono, String genero, String email,
            String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.genero = genero;
        this.email = email;
        this.contrasena = contrasena;
    }
    
    //Getters
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getDni() { return dni; }
    public String getTelefono() { return telefono; }
    public String getGenero() { return genero; }
    public String getEmail() { return email; }
    public String getContrasena() { return contrasena; }
    
    //Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
}
