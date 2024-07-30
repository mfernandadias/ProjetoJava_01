package condicionais;
import java.util.Scanner;

//verifique se um número é positivo, negativo ou zero


public class exerc01 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor");
        int num = scan.nextInt();

        if(num > 0){
            System.out.println("O valor digita é positivo");
        } else if (num < 0){
            System.out.println("O valor digitado é negativo");
        } else {
            System.out.println("O valor digitado é igual a Zero");
        }

    }
}
