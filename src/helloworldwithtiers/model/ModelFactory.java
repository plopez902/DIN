/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers.model;

/**
 *
 * @author paula
 */
public class ModelFactory {
    
    //Retornamos un nuevo objeto del modelImplementation
    
    public static Model getModel(){
    
        return new ModelImplementation();
    }
    
}
