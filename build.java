
package horario;
import java.util.Scanner;

public class Horario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int n1 = teclado. nextInt();
        System.out.print("Digite o segundo numero: ");
        int n2 = teclado.nextInt();
        
        int calcula = n1 + n2;
        
        System.out.print("O resultado é:" + calcula);
       
    }
    
}
