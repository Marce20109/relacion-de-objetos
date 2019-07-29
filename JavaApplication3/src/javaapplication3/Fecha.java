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
public class Fecha {
    int dia,mes,anho;
    public void setdia(int dia){
        this.dia=dia;
      }
    
    public void setmes(int mes){
        this.mes=mes;
      }
    public void setanho(int anho){
        this.anho=anho;
      }
     public int getdia(){
    return dia;
    }
    public int getmes(){
    return mes;   
}
    public int getanho(){
    return anho;
    }
   @Override
   public String toString(){
   return "la fecha de nacimiento de la persona es:"+dia+"/"+mes+"/"+anho;
   }
}



