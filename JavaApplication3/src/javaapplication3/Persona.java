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
public class Persona {
  private String nombre,apellido;
  
   Fecha F_nacimiento;
   Direccion dir;
   
public void Datos(String nombre,String apellido,Fecha F_nacimiento,Direccion dir){
this.nombre=nombre;
this.apellido=apellido;
this.F_nacimiento=F_nacimiento;
this.dir=dir;

}
@Override
   public String toString(){
   return "El nombre  es:"+nombre+"\n"+apellido+"\n"+F_nacimiento+"\n"+dir;
   }

}
