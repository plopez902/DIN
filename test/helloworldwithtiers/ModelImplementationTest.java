/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers;

import helloworldwithtiers.model.ModelImplementation;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2dam
 */
public class ModelImplementationTest {
    
  //atributos
    private ModelImplementation modelImp;
  //metodos
  //  
    @Before
    public void setUp() {
   // el set up se ejecuta antes que cualquier otro test
     modelImp = new ModelImplementation();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getGreeting method, of class ModelImplementation.
     */
    @Test // indica que es un metodo de prueba, nos crea un metodo de test por cada uno de los metodos de la clase que queremos probar
    public void testGetGreeting() {
       
        
        
        //tenemos que llamar al metodo gettgreeting de la clase modelImplementation
        assertEquals("Fallo","Hola mundo" , modelImp.getGreeting());
       
    }
    
}
