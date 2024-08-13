package livro100Exercicios.LacosDeRepeticao;
import java.util.Scanner;
public class Exer56 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        /*
        Crie um programa que exiba os primeiros N números primos, onde N é informado pelo
        usuário, utilizando um laço de repetição
         */

        System.out.println("Digite a quantidade de números primos desejados: ");
        int quantidade = scan.nextInt();

        System.out.println("Os primeiros " + quantidade + " números primos são: ");

        int numero = 2;
        int contador = 0;

        while (contador < quantidade){
            boolean isPrimo = true;

            for(int i = 2; i <= Math.sqrt(numero); i++){
                if(numero % i == 0){
                    isPrimo = false;
                    break;
                }
            }

            if(isPrimo){
                System.out.println(numero + " ");
                contador++;
            }
            numero++;
        }
        scan.close();
    }
}
