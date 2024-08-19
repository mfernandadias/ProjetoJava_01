package livro100Exercicios.LacosDeRepeticao;
import java.util.Scanner;

public class Exer57 {
    /*
    crie um programa que exiba os primeiros N números primos,
    onde N é informado pelo usuário, utilizando um laço de repetição
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade que você deseja de números primos");
        int quantidade = scan.nextInt();

        System.out.println("A quantidade que você deseja de número é: " + quantidade);

        int numero = 2;
        int contador = 0;

        while (contador < quantidade){
            boolean isPrimo = true;

            for (int i = 2; i <= Math.sqrt(numero); i++){
                if (numero % i == 0){
                    isPrimo = false;
                    break;
                }
            }

            if(isPrimo){
                System.out.print(numero + " ");
                contador++;
            }
            numero++;
        }
        scan.close();
    }

}
