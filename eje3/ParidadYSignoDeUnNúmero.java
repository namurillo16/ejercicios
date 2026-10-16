/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paridad.y.signo.de.un.número;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class ParidadYSignoDeUnNúmero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        
         num=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a calcular"));
         
         
         if (num==0){
         JOptionPane.showMessageDialog(null, "EL numero digitado es cero");
         
         }
         if(num>=0){
         
             JOptionPane.showMessageDialog(null, "EL numero digitado es positivo");
         
         
         }else if(num<=0){
         
             JOptionPane.showMessageDialog(null, "EL numero digitado es negativo");
         }
             
         if ((num % 2)==0){
                JOptionPane.showMessageDialog(null, "EL numero digitado es par");
         
         }else {
         JOptionPane.showMessageDialog(null, "EL numero digitado es impar");
         
         }
         
         
        
        
        
    }
    
}
