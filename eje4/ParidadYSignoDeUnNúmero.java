/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.básica;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class CalculadoraBásica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String op;
        float num,num1,resp=0;
        
        JOptionPane.showMessageDialog(null,"Bienvenido!! ");
        
        op=JOptionPane.showInputDialog("""
                                       Digite una opcion: 
                                       Suma
                                       Resta
                                       Multiplicacion
                                       Division""");
        
        num=Float.parseFloat(JOptionPane.showInputDialog("Digite el primer numero "));
        num1=Float.parseFloat(JOptionPane.showInputDialog("Digite el segundo numero "));
        /*
        if (op.equalsIgnoreCase("suma")){
            resp=num+num1;
        }else if(op.equalsIgnoreCase("resta")){
                 resp=num-num1;
        }else if(op.equalsIgnoreCase("multiplicacion")){
                 resp=num*num1;
        }else if(op.equalsIgnoreCase("Division")){
                 resp=num/num1;
        }
            
        */
        switch (op.toLowerCase()){
        
            case "suma" -> resp=num+num1;
                
            case "resta" -> resp=num-num1;
                
            case "multiplicacion" -> resp=num*num1;
                
            case "division" -> resp=num/num1;
        
        }
                                                            
        JOptionPane.showMessageDialog(null,"la respuesta es :"+ resp);
        
        
        
    }
    
}

