/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.Calendar;

/**
 *
 * @author SOFIA ELIZONDO
 */
public class Nodo {
    
    private String cedula;
    private String nombre;
    private int edad;
    private int cita;
    private String fecha;
    private Nodo siguiente; 

    public Nodo(String cedula, String nombre, int edad, int cita, String fecha,Nodo siguiete) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.cita = cita;
        this.fecha = fecha;
        this.siguiente = siguiete;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCita() {
        return cita;
    }

    public void setCita(int cita) {
        this.cita = cita;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiete) {
        this.siguiente = siguiete;
    }
    
    
    
}
