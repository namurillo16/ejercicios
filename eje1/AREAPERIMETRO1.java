/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package area.perimetro;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class AREAPERIMETRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float area = 0,perimetro,altura,base;
        
                base=Float.parseFloat(JOptionPane.showInputDialog("Digite la base"));
                altura=Float.parseFloat(JOptionPane.showInputDialog("Digite la altura"));
                
                area=base*altura;
                
                perimetro=2*(base*altura);
                
                
                JOptionPane.showMessageDialog(null,"El area es :"+
                                                area+"\n"+
                                            "El perimetro es :"+ perimetro
                                            
                
                
                );
                
                
                

        
        
    }
    
}