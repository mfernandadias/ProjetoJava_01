package condicionais;
import java.util.Scanner;
//verifique se um número é múltiplo de 3 e 5

public class Exerc06 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor");
        int num = scan.nextInt();

        if(num % 3 == 0 && num % 4 == 0){
            System.out.println("O valor digitado é múltiplico de 3 e 5");
        } else {
            System.out.println("O valor digitado não é múltiplico de 3 e 5");
        }

    }
}
