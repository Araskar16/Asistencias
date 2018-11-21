/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistencias;

/**
 *
 * @author soporte
 */
public class Usuario {
    
    private String clave;
    private String nombre;
    private String Usuario;
    private String contrasena;

    public Usuario(String calve, String nombre, String Usuario, String contrasena) {
        this.clave = clave;
        this.nombre = nombre;
        this.Usuario = Usuario;
        this.contrasena = contrasena;
        
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
}
