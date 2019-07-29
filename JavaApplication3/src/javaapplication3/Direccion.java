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
public class Direccion {
    String pais,ciudad,barrio; 
   
public void setpais(String pais){
        this.pais=pais;
      }
    
    public void setciudad(String ciudad){
        this.ciudad=ciudad;
      }
    public void setbarrio(String barrio){
        this.barrio=barrio;
      }
    public void setnumero(int numero){
        this.barrio=barrio;
    }
     public String getpais(){
    return pais;
    }
    public String getciudad(){
    return ciudad;   
}
    public String getbarrio(){
    return barrio;
   
    }
    
    

@Override
   public String toString(){
   return "la direccion es:"+pais+"/"+ciudad+"/"+barrio;
   
   
   }
   

    
}