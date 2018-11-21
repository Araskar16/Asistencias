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
public class Asistencia {
   private String fecha_llegada;
   private String echa_salida;
   private String clave_usuario;

    public Asistencia(String fecha_llegada, String echa_salida, String clave_usuario) {
        this.fecha_llegada = fecha_llegada;
        this.echa_salida = echa_salida;
        this.clave_usuario = clave_usuario;
    }

    public String getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(String fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    public String getEcha_salida() {
        return echa_salida;
    }

    public void setEcha_salida(String echa_salida) {
        this.echa_salida = echa_salida;
    }

    public String getClave_usuario() {
        return clave_usuario;
    }

    public void setClave_usuario(String clave_usuario) {
        this.clave_usuario = clave_usuario;
    }
   
    
}
