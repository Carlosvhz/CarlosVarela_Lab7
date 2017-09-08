/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosvarela_lab7;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import sun.awt.FwDispatcher;

/**
 *
 * @author carlo
 */
public class AdministradorHabitante {
    
    private ArrayList<Habitante> habitantes = new ArrayList();
    
    public AdministradorHabitante() {
    }

    public AdministradorHabitante(ArrayList habitante) {
        this.habitantes = habitante;
    }

    public ArrayList<Habitante> getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(ArrayList<Habitante> habitantes) {
        this.habitantes = habitantes;
    }

    
    
    public void escribirHabitantes(){
        File archivo;
        FileOutputStream fo = null;
        ObjectOutputStream bo = null;
        try {
            archivo = new File("./Contenido/Habitantes.txt");
            if (archivo.exists()) {
                FileWriter fw = new FileWriter(archivo);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("");
                bw.flush();
                    try {
                        bw.close();
                        fw.close();
                    } catch (Exception e) {
                    }
            }
            fo = new FileOutputStream(archivo);
            bo = new ObjectOutputStream(fo);
            for (Habitante habitante : habitantes) {
                bo.writeObject(habitante);
            }
            bo.flush();
        } catch (Exception e) {
        }
        try {
            fo.close();
            bo.close();
        } catch (Exception e) {
        }
    }
    
    public ArrayList cargarHabitantes(){
        ArrayList<Habitante> habitantes = new ArrayList();
        File archivo;
        FileInputStream fo = null;
        ObjectInputStream bo = null;
        try {
            archivo = new File("./Contenido/Habitantes.txt");
            if (archivo.exists()) {
                fo = new FileInputStream(archivo);
                bo = new ObjectInputStream(fo);
                while(true){
                    habitantes.add((Habitante)bo.readObject()); 
                }
            }
        } catch (Exception e) {
        }
        try {
            fo.close();
            bo.close();
        } catch (Exception e) {
        }
        return habitantes;
    }
}
