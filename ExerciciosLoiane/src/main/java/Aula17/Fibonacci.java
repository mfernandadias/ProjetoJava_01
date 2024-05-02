package Aula17;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[]args){
        int n = 10;
        int a = 1;
        int b = 1;

        System.out.println(a + " , " + b);

        for (int i = 3; i <= n; i++){
            int next = a + b;
            System.out.println(i + "ª posição: " + next); //Imprime o próximo termo
            a = b;
            b = next;
        }

    }
}
