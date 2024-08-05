package livro100Exercicios.Strings;
import java.util.Scanner;
/* escreva um programa que receba um nome completo e exiba o sobrenome (último nome)
primeiro
 */

public class Exer25 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome compelto");
        String nomeCompleto = scan.nextLine();

        String[] partes = nomeCompleto.split(" ");
        String sobrenome = partes[partes.length - 1];

        System.out.println("Nome com sobrenome primeiro: ");
        System.out.println(sobrenome);

        for(int i = 0; i < partes.length - 1; i++){
            System.out.println(" " + partes[i]);
        } System.out.println("");

        scan.close();
    }
}
