/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;
import javax.swing.JOptionPane;

/**
 *
 * @author brusa
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0;
              do{
                  n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                          "Informe um numero: (valor 0 interrompe)"));
                  s+=n;
              }while (n!=0);
              JOptionPane.ShowMessageDialog(null, "<html>Resultado final<hr>"+
                      "<br>Somatório vale " + s + "</html>")
        
    }
    
}
