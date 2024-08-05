package livro100Exercicios.Strings;
import java.util.Scanner;

public class Exer22 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome completo");
        String nomeCompleto = scan.nextLine();

        //dividir o nome completo em partes separadas pelo espaço em branco
        String[] partesNome = nomeCompleto.split(" ");

        //obter o primeiro nome
        String primeiroNome = partesNome[0];

        System.out.println("Primeiro nome: " + primeiroNome);

        scan.close();
    }
}
