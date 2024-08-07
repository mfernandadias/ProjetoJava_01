package livro100Exercicios.Condicionais;
import java.util.Scanner;

public class Exer45 {
    public static void main(String[] args){
        /*
        faça um programa que solicite dois números e exiba se o primeiro é divisível pelo segundo
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu primeiro valor");
        int num1 = scan.nextInt();

        System.out.println("Digite seu segundo valor");
        int num2 = scan.nextInt();

        if ( num2 == 0){
            System.out.println("Divisão por zero não é permitida.");
        } else if(num1 % num2 == 0 ){
            System.out.println(num1  + " é divisível por " +  num2);
        } else {
            System.out.println(num1  + " NÃo é divisível por " +  num2);
        }
    }
}
