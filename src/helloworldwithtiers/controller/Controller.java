/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers.controller;

import helloworldwithtiers.model.Model;
import helloworldwithtiers.view.View;

/**
 * Esta es la clase controlador, se comunica con la capa modelo y la capa controlador
 * @author paula
 */
public class Controller {
    
    //le llega la flecha de run por lo tanto tiene un metodo run que no va a devolver nada, pero dentro del metodo llama al getGreeting y al showGreeting
    
    public void run( Model modelo, View vista){ // el controlador sirve para comunicarse con las interfaces
    
        //llama al metodo getGreeting del objeto modelo
        
        String saludo = modelo.getGreeting(); // con este metodo obtengo el saludo que tengo en la clase model implementation
        
        //llama al metodo showGreeting del objeton View para mostrar el saludo que recibe del metodo showGreeting de ModelImplementation
        
        vista.showGreeting(saludo);       
        
    }
    
    
}
