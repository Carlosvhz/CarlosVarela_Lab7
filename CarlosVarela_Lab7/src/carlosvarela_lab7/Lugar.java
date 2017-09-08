/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosvarela_lab7;

import java.util.ArrayList;
import javax.swing.*;
/**
 *
 * @author carlo
 */
public class Lugar extends Thread{
    
    private String nombre, clima, tipo_zona;
    private int extension_territorial, año;
    private ArrayList<Habitante> habitantes = new ArrayList();
    private JFrame ventana;
    
    public Lugar(String nombre, String clima, String tipo_zona, int extension_territorial, int año, JFrame ventana) {
        this.nombre = nombre;
        this.clima = clima;
        this.tipo_zona = tipo_zona;
        this.extension_territorial = extension_territorial;
        this.año = año;
        this.ventana = ventana;
    }

    public Lugar() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getTipo_zona() {
        return tipo_zona;
    }

    public void setTipo_zona(String tipo_zona) {
        this.tipo_zona = tipo_zona;
    }

    public int getExtension_territorial() {
        return extension_territorial;
    }

    public void setExtension_territorial(int extension_territorial) {
        this.extension_territorial = extension_territorial;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public ArrayList<Habitante> getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(ArrayList<Habitante> habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public void run() {
        try {
            ventana.pack();
            ventana.setVisible(true);
            Thread.sleep(6000);
        } catch (Exception e) {
        }
    }
    
}
