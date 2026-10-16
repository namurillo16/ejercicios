/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversion.temperatura;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class ConversionTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        double gracel,grafa;
        
        gracel=Double.parseDouble(JOptionPane.showInputDialog("Digite la temperatura en grados Celsius"));
        
        grafa=(gracel*9/5) + 32;
        
        JOptionPane.showMessageDialog(null,gracel+" Celsius "+ "equivalen a "+ grafa+" Fahrenheit");

        
    }
    
}
