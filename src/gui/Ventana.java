/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author UCA
 */
public class Ventana extends JFrame{
    private JTextField num1, num2, operacion, total;
    private JButton suma, resta, mult, div, bin, hex;
    
    public Ventana(){
        super("Calculadora");
        initComponent();
}

    private void initComponent() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        num1 = new JTextField ();
        num1.setBounds(100, 30, 50, 30);
        operacion = new JTextField ();
        operacion.setBounds(175, 30, 50, 30);
        operacion.setEditable(false);
        num2 = new JTextField ();
        num2.setBounds(250, 30, 50, 30);
        
        
        Container contenedor = getContentPane();
        contenedor.add(num1);
        contenedor.add(operacion);
        contenedor.add(num2);
        
        setSize(400,400);
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana().setVisible(true);
                }
        });
    }
    
    
}


