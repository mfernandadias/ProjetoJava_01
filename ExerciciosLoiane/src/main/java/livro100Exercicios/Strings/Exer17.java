package livro100Exercicios.Strings;
import java.util.Scanner;

public class Exer17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scan.nextLine();

        for(int i = 0; i < palavra.length(); i++){
            char letra = palavra.charAt(i);
            System.out.println(letra);
        }
        scan.close();
    }
}
