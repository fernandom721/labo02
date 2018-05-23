/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import Aritmetica.Operacion;
import Conversiones.Conversion;


/**
 *
 * @author Fernando Martínez
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String type){
        
        switch (type){
            case "Aritmetica":
                return new Operacion();
            case "Conversiones":
                return new Conversion();   
        }
        return null;
        
    }

    
}
