/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversiones;

/**
 *
 * @author Fernando Martínez
 */
public class Hexagesimal implements Convertidor{
    private int num;
    float valor;
    int rem;
    String str2="";
    
    @Override
    public float Convertir(float x) {
        num =(int)x;
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
 
     while(num>0)
     {
       rem=num%16; 
       str2=hex[rem]+str2; 
       num=num/16;
     }
        valor = Float.parseFloat(str2);
        return valor;
         }
    
}
