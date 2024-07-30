package condicionais;

import java.util.Scanner;

public class Exerc07 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num1 = 9;
        int num2 = 1;
        int num3 = 9;

        if(num1 > num2 && num1 > num3){
            System.out.println("O maior é: " + num1);
        } else if(num2 > num1 && num2 > num3){
            System.out.println("O maior valor é: " + num2);
        } else {
            System.out.println("O maior valor é: " + num3);
        }
    }
}
