/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabla.de.multiplicar;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class TablaDeMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        int i=1,num,res = 0,pares =0;
        num=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
        
        for (i=1 ; i<=10; i++){
            res=num*i;
                    JOptionPane.showMessageDialog(null,num + "x "+ i +"="+res);
                    
         if (res % 2==0){
            
            pares++;
        }
        
        }
          JOptionPane.showMessageDialog(null,"la cantidad de pares es: " +pares);
        
        
        

        
    }
    
}
