/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import Modelo.MetodosNodos;
import Vista.InformacionCita;
import Vista.Ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author SOFIA ELIZONDO
 */
public class Controlador implements ActionListener{

Ventana ventana; 
InformacionCita informacionCita;
MetodosNodos metodos;
    public Controlador(Ventana ventana)
    {
        this.ventana=ventana;
        informacionCita=new InformacionCita(this);
        metodos= new MetodosNodos();
 
    }
    
    
    
    public void actionPerformed(ActionEvent e) {
  
        if(e.getActionCommand().equals("Ingresar"))
        {
            if(metodos.verificarCita())
            {
                metodos.agregarPrioridad(ventana.enviarInformacion(),ventana.enviarInformacionEdad(),ventana.enviarPrioridad());
            }
            else
            {
                metodos.crear(ventana.enviarInformacion(),ventana.enviarInformacionEdad());
                ventana.citaActual(metodos.imprimir());
            }
            ventana.nuevaCita(metodos.imprimirFechaCita());
            ventana.imprimirLista(metodos.imprimirLista());
            ventana.refresarVentana();
            System.out.println("Ingresar");
        }
        
        if(e.getActionCommand().equals("Siguiente"))
        {
            //metodos.eliminarPrimero();
            ventana.citaActual(metodos.eliminarPrimero());
            System.out.println("metodo");
            ventana.imprimirLista(metodos.imprimirLista());
            System.out.println("Siguiente");
        }
        
        if(e.getActionCommand().equals("MayorMenor"))
        {
            metodos.mayorMenor();
            ventana.imprimirLista(metodos.imprimirLista());
            System.out.println("MayorMenor");
        }
        
        if(e.getActionCommand().equals("MenorMayor"))
        {
            metodos.menorMayor();
            ventana.imprimirLista(metodos.imprimirLista());
            System.out.println("MenorMayor");
        }
        
        if(e.getActionCommand().equals("Informacion"))
        {
            informacionCita.setVisible(true);
            System.out.println("Informacion");
        }
        
        if(e.getActionCommand().equals("Buscar"))
        {
            if(metodos.verificarCedula(informacionCita.enviarInformacion()))
            {
                informacionCita.habilitarEdicion();
            }
            System.out.println("Buscar");
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            metodos.modificar(informacionCita.enviarInformacion(), informacionCita.enviarInformacionEdad());
            ventana.imprimirLista(metodos.imprimirLista());
            informacionCita.refresarVentana();
            informacionCita.desabilitarEdicion();
            System.out.println("Modificar");
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
            metodos.eliminar(informacionCita.enviarInformacion());
            ventana.imprimirLista(metodos.imprimirLista());
            informacionCita.refresarVentana();
            informacionCita.desabilitarEdicion();
            System.out.println("Eliminar");
        }
        if(e.getActionCommand().equals("Salir"))
        {
            System.out.println("Salir");
            System.exit(0);
        }
        
        
    }
    
}
