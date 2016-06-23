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
public class MetodosNodos {

    
    Nodo cita;
    String fechaCita="";
    int dia=1;
    int numCita=1;
    int total=0;
    
    //Verifica si existe o no una lista ya creada
    public boolean verificarCita()
    {
        boolean existe=true;

            if(cita==null)
            {
                existe=false;
            } 
        return existe;
    }
    
    public void crear (String[] informacion, int edad)
    {
            cita=new Nodo(informacion[0],informacion[1],edad,numCita,fechaCita(),null);
            fechaCita=cita.getFecha();
            numCita++;
    }
    
    public void agregarPrioridad (String[] informacion, int edad, String prioridad)
    {
        if(prioridad.equals("A"))
        {
            agregarAlInicio(informacion,edad);
        }
        else
        {
            agregarAlFinal(informacion,edad);
        }  
    }
    
    public void agregarAlFinal(String[] informacion, int edad)
    {
            Nodo temporal=devolverUltimoNodo();
            Nodo nuevoNodo=new Nodo(informacion[0],informacion[1],edad,numCita,fechaCita(),null);
            temporal.setSiguiente(nuevoNodo);
            fechaCita=nuevoNodo.getFecha();
            numCita++;
    }
    
     public void agregarAlInicio(String[] informacion, int edad)
    {
        System.out.print("AlInicio");
        Nodo temporal=new Nodo(informacion[0],informacion[1],edad,numCita,fechaCitaPrioridad(),null);
        temporal.setSiguiente(cita);
        cita=temporal;
        fechaCita=temporal.getFecha();
        numCita++;
    }
    
    
    public String imprimirFechaCita()
    {
        String nuevaCita="";
         nuevaCita=fechaCita;   
        return nuevaCita;
    }
    
    public String imprimirLista()
    {
        String texto="";
        Nodo temporal=cita;
        while(temporal.getSiguiente()!=null)
        {
            texto+="Cita: "+temporal.getCita()+" "+temporal.getFecha()+"\n";
            temporal=temporal.getSiguiente();
        }
        texto+="Cita: "+temporal.getCita()+" "+temporal.getFecha()+"\n";
       
        return texto; 
    }
    
    public String imprimir()
    {
        System.out.println("imprimirsig");
        String texto="";
        Nodo temporal=cita;
        texto=temporal.getCita()+" "+temporal.getFecha();
       System.out.println("NUea Cita Actual"+texto);
        return texto;
    }

    public void eliminarPrimero()
    {
        System.out.print("EliminarPrimero");
            Nodo temporal=cita.getSiguiente();
            cita=temporal; 
    }
    
  
    public Nodo devolverUltimoNodo()
    {
        Nodo temporal=cita;
        total=0;
        while(temporal.getSiguiente()!=null)
        {
            temporal=temporal.getSiguiente();
            total++;
        }
        total++;
        System.out.println(temporal.getCita());
        return temporal;   
    }
    
    public String fechaCita()
    {
        Calendar cal=Calendar.getInstance(); 
        String fecha=((cal.get(cal.DATE))+dia)+"/"+cal.get(cal.MONTH)+"/"+cal.get(cal.YEAR);
        System.out.println(fecha);
        dia++;
        return fecha;
    }
    
    public String fechaCitaPrioridad()
    {
        Calendar cal=Calendar.getInstance(); 
        String fecha=((cal.get(cal.DATE))+1)+"/"+cal.get(cal.MONTH)+"/"+cal.get(cal.YEAR);
        System.out.println(fecha);
        return fecha;
    }
    
    
    public void eliminar(String[] arreglo)
    {
        Nodo temporal=cita;
        if(arreglo[0].equals(temporal.getCedula()))
        {
            eliminarPrimero();
        }
        else
        {
             metodoEliminar(arreglo);
        }
    }
    
    public void metodoEliminar(String[] arreglo)
    {
        Nodo temporal=cita;
        Nodo anterior=cita;
        while(!temporal.getCedula().equals(arreglo[0]))
            {
                anterior=temporal;
                temporal=temporal.getSiguiente();
            }
            temporal=temporal.getSiguiente();
            anterior.setSiguiente(temporal);
    }
    
    public void modificar(String arreglo[], int edad)
    {
        Nodo temporal=cita;
        while(!temporal.getCedula().equals(arreglo[0]))
        {
            temporal=temporal.getSiguiente();
        }
        temporal.setNombre(arreglo[1]);
        temporal.setEdad(edad);
        temporal.setFecha(arreglo[2]);
    }
    
    public void menorMayor()
    {
            devolverUltimoNodo();
            Nodo temporal=cita;
            Nodo siguiente=cita.getSiguiente();
            Nodo temp=new Nodo("","",0,0,"",null);
            for(int contador=0;contador<total;contador++)
            {
                System.out.println("Llega");
                for(int conta=0;conta<total;conta++)
                {
                    if(siguiente!=null)
                    {
                        System.out.println("Llega mas");
                        if(temporal.getEdad()>siguiente.getEdad())
                        {
                            System.out.println("Actual "+temporal.getEdad());
                            System.out.println("Siguiente "+siguiente.getEdad());
                            temp.setCedula(temporal.getCedula());
                            temp.setNombre(temporal.getNombre());
                            temp.setEdad(temporal.getEdad());
                            temp.setCita(temporal.getCita());
                            temp.setFecha(temporal.getFecha());
                            temporal.setCedula(siguiente.getCedula());
                            temporal.setNombre(siguiente.getNombre());
                            temporal.setEdad(siguiente.getEdad());
                            temporal.setCita(siguiente.getCita());
                            temporal.setFecha(siguiente.getFecha());
                            siguiente.setCedula(temp.getCedula());
                            siguiente.setNombre(temp.getNombre());
                            siguiente.setEdad(temp.getEdad());
                            siguiente.setCita(temp.getCita());
                            siguiente.setFecha(temp.getFecha());
                            System.out.println("CambioAhoraDespues "+temporal.getEdad());
                            System.out.println("CambioAhoraPrimero "+siguiente.getEdad());
                        }
                        else
                        {
                            
                        }
                        temporal=temporal.getSiguiente();
                        siguiente=temporal.getSiguiente();
                    }
                }
                temporal=cita;  
                siguiente=temporal.getSiguiente();
                temp=new Nodo("","",0,0,"",null);
            
            }
    }
    
    
    public void mayorMenor()
    {
            devolverUltimoNodo();
            Nodo temporal=cita;
            Nodo siguiente=cita.getSiguiente();
            Nodo temp=new Nodo("","",0,0,"",null);
            for(int contador=0;contador<total;contador++)
            {
                System.out.println("Llega");
                for(int conta=0;conta<total;conta++)
                {
                    if(siguiente!=null)
                    {
                        System.out.println("Llega mas");
                        if(temporal.getEdad()<siguiente.getEdad())
                        {
                            System.out.println("Actual "+temporal.getEdad());
                            System.out.println("Siguiente "+siguiente.getEdad());
                            temp.setCedula(temporal.getCedula());
                            temp.setNombre(temporal.getNombre());
                            temp.setEdad(temporal.getEdad());
                            temp.setCita(temporal.getCita());
                            temp.setFecha(temporal.getFecha());
                            temporal.setCedula(siguiente.getCedula());
                            temporal.setNombre(siguiente.getNombre());
                            temporal.setEdad(siguiente.getEdad());
                            temporal.setCita(siguiente.getCita());
                            temporal.setFecha(siguiente.getFecha());
                            siguiente.setCedula(temp.getCedula());
                            siguiente.setNombre(temp.getNombre());
                            siguiente.setEdad(temp.getEdad());
                            siguiente.setCita(temp.getCita());
                            siguiente.setFecha(temp.getFecha());
                            System.out.println("CambioAhoraDespues "+temporal.getEdad());
                            System.out.println("CambioAhoraPrimero "+siguiente.getEdad());
                        }
                        else
                        {
                            
                        }
                        temporal=temporal.getSiguiente();
                        siguiente=temporal.getSiguiente();
                    }
                }
                temporal=cita;  
                siguiente=temporal.getSiguiente();
                temp=new Nodo("","",0,0,"",null);
            
            }
    }
}
