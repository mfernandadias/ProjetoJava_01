package condicionais;
import java.util.Scanner;
//verifique se um número é par ou impar

public class Exerc04 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor");
        double num = scan.nextDouble();

        if(num % 2 == 0){
            System.out.println("O valor digitado é par");
        } else {
            System.out.println("O valor digitado é impar");
        }

    }
}
