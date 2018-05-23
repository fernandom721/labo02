/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import Aritmetica.Aritmetico;
import Conversiones.Convertidor;

/**
 *
 * @author UCA
 */
public interface AbstractFactory {
        Aritmetico getOperacion(String type);
        Convertidor getConvertidor(String type);
}
