/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetico;

/**
 *
 * @author UCA
 */
public class Division implements Aritmetico{
    private int num1, num2;
    @Override
    public void Aritmetico() {
        System.out.println(num1 / num2);
    }
    
}
