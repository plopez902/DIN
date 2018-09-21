/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers.view;

import javax.swing.JOptionPane;

/**
 * Clase para la implementacion swing del hola mundo
 * @author paula
 */
public class SwinViewImplementation implements View{
    /**
     * Muestra el saludo en una ventana de mensaje
     * @param greeting El saludo
     */
    public void showGreeting(String greeting){ // recibe el saludo
        
       String mensaje = greeting;
    //ventana de informacion
    //comentario de prueba
    JOptionPane.showMessageDialog(null, greeting, "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
    
       
         
  }
    
}
