/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;
import java.util.Scanner;
/**
 *
 * @author brusa
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ano em que nasceu");
        int nasc = entrada.nextInt();
        int i = 2020 - nasc;
        if (i>=18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
        System.out.println("Sua idade é "+ i);
    }
    
}
