package livro100Exercicios.LacosDeRepeticao;
import java.util.Scanner;

public class Exer50a {
    public static void main(String[] args){
        /*
        crie um programaque solicite ao usuário um número e exiba a tabuada desse número utilizando
        um laço de repetição
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro para receber a tabuada: ");
        int valor = scan.nextInt();


        System.out.println("Segue a Tabuada de 1 a 10 do valor: " + valor);
        for(int i = 1; i <= 10; i++){
            int tabuada = valor * i;
            System.out.println(valor + " x " + i + " = " + tabuada);
        }

    }
}
