package Aula17;
import java.util.Scanner;
/*
faça um porgroma que peça um número interio e determine
se ele é ou não um números primo. Um número primo é aquele que é
divicível somente por  ele mesmo e por 1
 */

//numero primo: divisível po 1 e por ele mesmo (somente)
//numero de divisores é 2

public class Exerc21 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int numDivisores = 0;


        System.out.println("Digite um valor: ");
        int numPrimo = scan.nextInt();

        for (int i = 1; i <= numPrimo; i++){
            if (numPrimo % 1 == 0){
                numDivisores++;
            }
        }
        if (numDivisores == 2){
            System.out.println("O número digitado é primo: ");
        } else {
            System.out.println("O número digitado não é primo. ");
        }

    }
}
