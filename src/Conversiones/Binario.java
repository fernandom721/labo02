/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversiones;

import java.util.ArrayList;

/**
 *
 * @author Fernando Martínez
 */
public class Binario implements Convertidor{
    private int numero, valor;

    String base2="";

    @Override
    public float Convertir(float x) {
        

        numero = (int)x;
 
        while(numero>0) {
        base2=(numero%2)+base2;
        numero/=2;  
        }
        
        valor = Integer.parseInt(base2);
        return valor;
        }
    
}
