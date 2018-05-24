/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Aritmetica.Aritmetico;
import Conversiones.Convertidor;
import calculadora.AbstractFactory;
import calculadora.FactoryProducer;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author UCA
 */
public class Ventana extends JFrame{
    
    private JTextField num1 ,num2, operacion, valortotal ,total, convertir, convertido;
    private JButton suma, resta, mult, div, bin, hex;
    private float valor;
    AbstractFactory factory;
    
    public Ventana(){
        super("Calculadora");
        initComponent();
}

    private void initComponent() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        num1 = new JTextField ();
        num1.setBounds(25, 30, 50, 30);
        
        operacion = new JTextField ();
        operacion.setBounds(100, 30, 50, 30);
        operacion.setEditable(false);
        
        num2 = new JTextField ();
        num2.setBounds(175, 30, 50, 30);
        
        total = new JTextField(" = ");
        total.setBounds(250, 30, 50, 30);
        total.setEditable(false);
        
        valortotal = new JTextField();
        valortotal.setBounds(325, 30, 50, 30);
        valortotal.setEditable(false);
        
        suma = new JButton(" + ");
        suma.setBounds(20, 100, 50, 30);
        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacion.setText("+");
                factory = FactoryProducer.getFactory("Aritmetica");
                Aritmetico sumar = factory.getOperacion("Suma");
                valor= sumar.Aritmetico(Float.parseFloat(num1.getText()), Float.parseFloat(num2.getText()));
                valortotal.setText(String.valueOf(valor));
                }
        });
        
        resta = new JButton(" - ");
        resta.setBounds(20, 150, 50, 30);
        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacion.setText("-");
                factory = FactoryProducer.getFactory("Aritmetica");
                Aritmetico restar = factory.getOperacion("Resta");
                valor= restar.Aritmetico(Float.parseFloat(num1.getText()), Float.parseFloat(num2.getText()));
                valortotal.setText(String.valueOf(valor));
                }
        });
        
        mult = new JButton(" * ");
        mult.setBounds(20, 200, 50, 30);
        mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacion.setText("*");
                factory = FactoryProducer.getFactory("Aritmetica");
                Aritmetico multi = factory.getOperacion("Multiplicacion");
                valor= multi.Aritmetico(Float.parseFloat(num1.getText()), Float.parseFloat(num2.getText()));
                valortotal.setText(String.valueOf(valor));
                }
        });
        
        div = new JButton(" / ");
        div.setBounds(20, 250, 50, 30);
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacion.setText("/");
                factory = FactoryProducer.getFactory("Aritmetica");
                Aritmetico dividir = factory.getOperacion("Division");
                valor= dividir.Aritmetico(Float.parseFloat(num1.getText()), Float.parseFloat(num2.getText()));
                valortotal.setText(String.valueOf(valor));
                }
        });
        
        convertir = new JTextField("Convertir Reslutado");
        convertir.setBounds(150, 100, 150, 30);
        convertir.setEditable(false);
        
        hex = new JButton("Hexa");
        hex.setBounds(150, 200, 70, 30);
        hex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory = FactoryProducer.getFactory("Conversiones");
                Convertidor a_hexa = factory.getConvertidor("Hexa");
                valor = a_hexa.Convertir(Float.parseFloat(valortotal.getText()));
                convertido.setText(String.valueOf(valor));
                }
        });
        
        bin = new JButton("Bin");
        bin.setBounds(150, 150, 70, 30);
        bin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                factory = FactoryProducer.getFactory("Conversiones");
                Convertidor a_binario = factory.getConvertidor("Bin");
                valor = a_binario.Convertir(Float.parseFloat(valortotal.getText()));
                convertido.setText(String.valueOf(valor));
                }
        });
        
        convertido = new JTextField();
        convertido.setBounds(250, 175, 130, 30);
        convertido.setEditable(false);
        
        Container contenedor = getContentPane();
        contenedor.add(num1);
        contenedor.add(operacion);
        contenedor.add(num2);
        contenedor.add(total);
        contenedor.add(valortotal);
        contenedor.add(suma);
        contenedor.add(resta);
        contenedor.add(mult);
        contenedor.add(div);
        contenedor.add(convertir);
        contenedor.add(bin);
        contenedor.add(hex);
        contenedor.add(convertido);
        
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


