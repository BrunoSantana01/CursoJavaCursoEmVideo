/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author brusa
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do aluno");
        float nota = teclado.nextFloat();
        System.out.println("Digite o nome dos pais do aluno");
        String pai = teclado.next();
        
        
        System.out.format("Aluno %s -> Pai %s -> nota %.2f", nome, pai, nota);
        System.out.printf("A nota é %.2f\n", nota);
        System.out.format("A nota de %s é %.2f", nome, nota);

    }

}
