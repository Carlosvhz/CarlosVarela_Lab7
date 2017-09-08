/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosvarela_lab7;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author carlo
 */
public class Lugar extends Thread{
    
    private String nombre, clima, tipo_zona;
    private int extension_territorial, año;
    private ArrayList<Habitante> habitantes = new ArrayList();

    
    public Lugar(String nombre, String clima, String tipo_zona, int extension_territorial, int año) {
        this.nombre = nombre;
        this.clima = clima;
        this.tipo_zona = tipo_zona;
        this.extension_territorial = extension_territorial;
        this.año = año;
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
    
    public void escribirHabitantes(){
        habitantes = new ArrayList();
        Habitante habitante;
        File archivo;
        FileInputStream fo = null;
        ObjectInputStream oi = null;
        try {
            archivo = new File("./Contenido/Habitantes.txt");
            fo = new FileInputStream(archivo);
            oi = new ObjectInputStream(fo);
            while (true) {
                habitante = (Habitante)oi.readObject();
                if ( habitante.getLugar().equals(nombre)) {
                    habitantes.add(habitante);
                }
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void run() {
        Segundo segundo = new Segundo();
        //DefaultTableModel modelo = (DefaultTableModel)segundo.tabla.getModel();
        DefaultTableModel modelo = new DefaultTableModel();
        segundo.pack();
        segundo.setLocationRelativeTo(null);
        segundo.setVisible(true);
        try {
            while(true){
                modelo.setNumRows(0);
                for (Habitante h : habitantes) {
                    Object row[]= {h.getNombre(), h.getEdad(), h.getID()};
                    modelo.addRow(row);
                }
                segundo.tabla.setModel(modelo);
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                }
            }
        } catch (Exception e) {
        }
    }
    
}
