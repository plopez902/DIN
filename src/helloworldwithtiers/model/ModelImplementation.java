/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers.model;

/**
 * Tenemos los metodos de la interfaz modelo
 * @author paula
 */
public class ModelImplementation implements Model{
    
     public String getGreeting(){
     
         //Creo el saludo o los datos
         String saludo ="Hola mundo bbb";
     //devuelve el saludo
     return saludo;
     }
    
}
