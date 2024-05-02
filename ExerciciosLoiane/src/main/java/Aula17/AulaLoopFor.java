package Aula17;
import java.util.Random;
import java.util.Scanner;

public class AulaLoopFor {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random generate = new Random();

        //loop infinito
        /* int i = 0;
        while(i < 6){
            int number = generate.nextInt(60);
            System.out.println(number);
            i++;
        } */

        //loop infinito do for (;;) { }


        for (int i = 0; i < 6; i++){
            int number = generate.nextInt(60);
            System.out.println(number);
        }

    }
}
