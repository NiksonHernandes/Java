/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetorepita;
import javax.swing.JOptionPane;
/**
 *
 * @author Acer
 */
public class ProjetoRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //JOptionPane.showMessageDialog(null, "Olá, mundin", "Boas Vindas", JOptionPane.ERROR_MESSAGE);
        //nt n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número! "));
        //JOptionPane.showMessageDialog(null, "Você digitou o valor: " + n);
        int n, s = 0, par = 0, impar = 0, acimaCem = 0, media = 0, x = 0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um Número: <br><em>(Valor 0 interrompe)</em></html>"));
            s = s + n;
            
            if(n % 2 == 0) 
                par ++;
            else
                impar++;
            
            if(n > 100)
                acimaCem++;
            
            x++;
        }while(n != 0);
        media = s / x;
        JOptionPane.showMessageDialog(null, 
                "<html>Resultado Final <br><hr>" + "<br>Total de Valores: " + x + 
                        "<br>Total de Pares: " + par + "<br>Total de Ímpares: " + impar + "<br>Acima de 100: "+ acimaCem + 
                        "<br>Média dos Valores: " + media +"</html>");
    }
    
}
