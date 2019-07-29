/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Usuario
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona obj1=new Persona();
       Fecha obj2=new Fecha();
       Direccion obj3=new Direccion();
    obj2.setdia(1);
    obj2.setmes(5);
    obj2.setanho(1991);
     

    
    obj3.setpais("El pais es:"+"colombia");
     
    obj3.setciudad("La ciudad es:"+"medellin");
       
    obj3.setbarrio("El barrio es:"+"barrio nuevo");
    
   obj1.Datos("Marcela", "Montoya", obj2, obj3);
   
     System.out.println(obj1);
      //  System.out.println(obj3);
   
   
        
    
    }
}
