/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acumulación.y.promedio;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class AcumulaciónYPromedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int num = 0,suma = 0,i = 0,promedio;
        
     
      while (num>=0 ) {
            //num=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
            
         suma = (num+suma);
                i++;
                num=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
            }
      
      promedio=suma/i;
      JOptionPane.showMessageDialog(null,"La suma de los numeros es : " + suma);
        JOptionPane.showMessageDialog(null,"el promedio es: " + promedio);
        
        
        
        }
        
        
        
        
    }
    

