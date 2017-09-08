/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosvarela_lab7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 *
 * @author carlo
 */
public class Habitante {
    private String nombre, profesion;
    private int ID, edad, estatura;

    public Habitante() {
    }

    public Habitante(String nombre, String profesion, int ID, int edad, int estatura) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.ID = ID;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEstatura() {
        return estatura;
    }
    
    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }
    
    public void EscribirHabitante(){
        FileOutputStream fo = null;
        BufferedOutputStream bo = null;
        
    }
    
}
