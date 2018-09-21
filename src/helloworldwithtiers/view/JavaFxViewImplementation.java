/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers.view;

import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Clase para construir los objetos necesarios para una aplicacion Java FX Clase
 * para mostrar un saludo
 *
 * @author 2dam
 */
public class JavaFxViewImplementation extends javafx.application.Application implements View {

    //tiene que estar el metodo showgreeting
    private static String greeting; //static por que el launch esta utilizando un objeto que igual no es el que nosotros necesitamos, entonces ponemos static para que sea para todos

    @Override
    public void showGreeting(String greeting) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        //Hay que pasarle el greeting al controler y este lo muestra
        //guardamos el greeting en una variable para poder pasarle al controler
        this.greeting = greeting;

        //lanzamos la aplicacion con el launch
        launch();
    }

    //metodo de la clase aplicacion
    @Override
    //muestra la ventana
    public void start(Stage stage) throws Exception {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml")); //CREAMOS EL OBJETO LOAD POR QUE EL PARENT ROOT LOADER ES UN METODO NO ESTATICO
        Parent root = loader.load();//METODO NO ESTATICO //carga el archivo fxml donde esta definida la vista 
        FXMLDocumentController controller = loader.getController();
        controller.setGreeting(greeting);
        //Objeto escenario --> stage
        //Objeto escena --> scene

        //Creamos el objeto scene. En la escena mostramos la vista. Le pasamos a la escena el root 
        Scene scene = new Scene(root);

        //Muestras la escena que hemos cargado en root y la cargamos en el escenario
        stage.setScene(scene);

        //muestra el escenario, en este caso la ventana
        stage.show();
        
    }
    //seter
    public void setGreeting(String greeting){
    this.greeting = greeting;
    }
    
}
