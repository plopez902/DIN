/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers;


import helloworldwithtiers.view.ViewFactory;
import helloworldwithtiers.view.View;
import helloworldwithtiers.model.Model;
import helloworldwithtiers.model.ModelFactory;
import helloworldwithtiers.controller.Controller;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase de prueba del controlador
 * @author paula
 */
public class ControllerIT {
    
    public ControllerIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    //me creo un objeto de la clase system out
    private final PrintStream systemOut =System.out;
    private ByteArrayOutputStream testOut;
    
    
    @Before
    public void setUp() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of run method, of class Controller.
     */
    @Test
    public void testRun() {
        //obtengo un modelo
      Model model = ModelFactory.getModel();
       //nos da el saludo
      String greeting = model.getGreeting(); 
      //obtengo la vista
      View view = ViewFactory.getView();
      //objeto controlador
      Controller controller = new Controller();
      //al controlador le paso la vista y el modelo
       controller.run(model, view);
       //voy a ver si en l terminal esta escrito lo que quiero, es decir cogemos lo que esta en la terminal y lo convertimos en cadena
         assertEquals("Shown greeting is not correct!!!",
                    greeting+"\n",testOut.toString());
       
    }
    
}
