package livro100Exercicios.LacosDeRepeticao;
import java.util.Scanner;

public class Exer49 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        /*
        Escreva um programa que exiba todos os números pares de 1 a 100
         */
       /* int i = 1;
        while( i <= 100){
            if(i % 2 == 0 ){
                System.out.println(i);
            } i++;
        } *

        */
        for(int i = 2; i <= 100; i += 2){
            System.out.println(i);
        }
    }
}
