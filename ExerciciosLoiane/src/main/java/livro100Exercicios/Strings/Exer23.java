package livro100Exercicios.Strings;
import java.util.Scanner;

public class Exer23 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma frase");
        String frase1 = scan.nextLine();

        int contadorEspacos = 0;

        //percorre cada caractere da frase
        for(int i = 0; i < frase1.length(); i++){
            //verifique se o caractere atual é um espaço em branco
            if(frase1.charAt(i) == ' '){
                contadorEspacos++;
            }
        }
        System.out.println("Quantidade de espeços em branco: " + contadorEspacos);

        scan.close();
    }
}
