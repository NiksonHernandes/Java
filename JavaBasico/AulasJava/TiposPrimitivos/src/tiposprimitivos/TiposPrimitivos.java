
package tiposprimitivos;

import java.util.Scanner; //importação da classe de entrada de dados

public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        
        //System.out.print("Sua nota é " + nota);
        //System.out.println("Sua nota é " + nota);
        //System.out.printf("A nota de %s é %.2f \n", nome, nota);
        System.out.format("A nota de %s é %.2f \n", nome, nota);
 
       
    }
    
}
