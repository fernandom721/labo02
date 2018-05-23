/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversiones;

import Aritmetica.Aritmetico;
import calculadora.AbstractFactory;

/**
 *
 * @author Fernando Martínez
 */
public class Conversion implements AbstractFactory{

    @Override
    public Aritmetico getOperacion(String type) {
        return null;
        }

    @Override
    public Convertidor getConvertidor(String type) {
        
        switch (type){
            case "Bin":
                return new Binario();
            case "Hex":
                return new Hexagesimal();
        }
        
        return null;
        }
    
}
