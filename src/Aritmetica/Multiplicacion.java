/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetica;

/**
 *
 * @author UCA
 */
public class Multiplicacion implements Aritmetico{
    private int num3;
    private int valor1, valor2;
    

    @Override
    public float Aritmetico(float x, float y) {
        //valor1 = x;
        //valor2 = y;
        num3 = (int)(x*y);
        System.out.println(num3);
        return num3;
        }
    
}
