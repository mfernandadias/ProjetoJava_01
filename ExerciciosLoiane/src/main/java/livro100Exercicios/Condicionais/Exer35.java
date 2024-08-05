package livro100Exercicios.Condicionais;
import java.util.Scanner;

public class Exer35 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        /*
        faça um programa que leia três números, e mostre eles na tela em ordem crescente
         */
        System.out.println("Digite seu primeiro valor");
        double valor1 = scan.nextDouble();

        System.out.println("Digite seu segundo valor");
        double valor2 = scan.nextDouble();

        System.out.println("Digite seu terceiro valor");
        double valor3 = scan.nextDouble();

        if(valor1 <= valor2 && valor1 <= valor3){
            System.out.println(valor1 + " ");
            if(valor2 <= valor3){
              System.out.println(valor2);
              System.out.println(valor3);
            } else {
                System.out.println(valor3);
                System.out.println(valor2);
            }
        } else if(valor2 <= valor1 && valor2 <= valor3){
            System.out.println(valor2);
            if(valor1 <= valor3){
                System.out.println(valor1);
                System.out.println(valor3);
            } else{
                System.out.println(valor3);
                System.out.println(valor1);
            }
        } else {
            System.out.println(valor3);
            if(valor1 <= valor2){
                System.out.println(valor1);
                System.out.println(valor2);
            } else {
                System.out.println(valor2);
                System.out.println(valor1);
            }
        }
        scan.close();
    }
}
