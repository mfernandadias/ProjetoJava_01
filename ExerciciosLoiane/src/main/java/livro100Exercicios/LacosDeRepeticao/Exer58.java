package livro100Exercicios.LacosDeRepeticao;
import java.util.Scanner;
public class Exer58 {
    /*
    crie um programa que exiba os primeiros N primeiros quadrados perfeitos, onde N é informado pelo
    usuário, utilizando um laço de repetição
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de quadrados perfeitos que você quer receber");
        int quantidade = scan.nextInt();

        System.out.println("Os primeiros " + quantidade + " quadrados perfeitos são: " );

        int numero = 1;
        int contador = 0;

        while(contador < quantidade){
            int raiz = (int) Math.sqrt(numero);

            if(raiz * raiz == numero){
                System.out.println( numero + " ");
                contador++;
            }
            numero++;
        }
        scan.close();
    }
}
