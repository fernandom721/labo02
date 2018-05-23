/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetica;
import Conversiones.Convertidor;
import calculadora.AbstractFactory;

/**
 *
 * @author Fernando Martínez
 */
public class Operacion implements AbstractFactory{

    @Override
    public Aritmetico getOperacion(String type) {
        switch (type){
            case "Suma":
                return new Suma();
            case "Resta":
                return new Resta();
            case "Mult":
                return new Multiplicacion();
            case"Div":
                return new Division();
        }
        
        return null;
    }

    @Override
    public Convertidor getConvertidor(String type) {
        return null;
    }

}
