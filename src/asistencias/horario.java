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
public class horario {
  private String hora_entrada;
  private String hora_salida;
  private String calve_usuario;

    public horario(String hora_entrada, String hora_salida, String calve_usuario) {
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
        this.calve_usuario = calve_usuario;
    }

    public String getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(String hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public String getCalve_usuario() {
        return calve_usuario;
    }

    public void setCalve_usuario(String calve_usuario) {
        this.calve_usuario = calve_usuario;
    }
  
}
