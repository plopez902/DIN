/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers.view;

import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * Clase para las referencias de los objetos de la interfaz grafica
 * Resposabilidad: mostrar un saludo en la etiqueta cuando se pulsa el boton
 * Aqui se pone todo lo del Action Listener. Lo que queremos que haga cuando pulsa en un boton etc
 * @author paula
 */

public class FXMLDocumentController  {
    
    @FXML
    private Label label;
    
    //para guardar el saludo
    private String greeting;

    //controlador
    /*
    FXMLDocumentController(String mensaje) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.saludo=mensaje;
    }
    */
    @FXML
    //manejador de evento. 
    private void handleButtonAction(ActionEvent event) {
        
        //le ponemos a la etiqueta el texxto del saludo
        label.setText(greeting);
    }
    
   public void setGreeting (String greeting){
       
       this.greeting = greeting;
       
       
   }
    
    
    
    
}
