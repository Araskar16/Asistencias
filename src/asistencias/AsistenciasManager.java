/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistencias;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author soporte
 */
public class AsistenciasManager {

private final String ruta_asistencia = "C:\\Users\\soporte\\Documents\\NetBeansProjects\\Asistencias\\archivos\\asistencia.txt";
private final String ruta_horario = "C:\\Users\\soporte\\Documents\\NetBeansProjects\\Asistencias\\archivos\\horario.txt";
private final String ruta_usuario = "C:\\Users\\soporte\\Documents\\NetBeansProjects\\Asistencias\\archivos\\usuario.txt";


private Scanner scanner_asistencia;
private Scanner scanner_horario;
private Scanner scanner_usuario;

public AsistenciasManager(){
    try{
            scanner_asistencia = new Scanner(new FileReader(ruta_asistencia));
            scanner_horario = new Scanner (new FileReader(ruta_horario));
            scanner_usuario = new Scanner (new FileReader(ruta_usuario));
                    
       
    } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());

    }
}}


