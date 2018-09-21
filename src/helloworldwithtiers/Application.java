/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithtiers;

import helloworldwithtiers.view.View;
import helloworldwithtiers.view.ViewFactory;
import helloworldwithtiers.model.Model;
import helloworldwithtiers.model.ModelFactory;
import helloworldwithtiers.controller.Controller;

/**
 * Esta es la clase aplicacion para el Hello World con capas
 *
 * @author paula
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // metodo start y el main llama al launch
        //tenemos que tener las dos factorias y controller
        // llamo a la factoria para crear el modelo
        Model modelo = ModelFactory.getModel();

        // llamo a la factoria para crear el modelo
        View vista = ViewFactory.getView();
        //creamos el controlador
        Controller controlador = new Controller();
        //al controlador le enviamos los parametros creados y le llamamos al run del controlador
        controlador.run(modelo, vista);

    }

}
