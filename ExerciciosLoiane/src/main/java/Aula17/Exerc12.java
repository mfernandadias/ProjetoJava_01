package Aula17;
import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número da tabuada");
        int num = scan.nextInt();

        if (num < 1 || num > 10 ){
            System.out.println("Digite um valor dentro do intervalo de 1 a 10 ");
            return;
        } else  {
            System.out.println("Tabuada do " + num + " : ");

            //Loop para gerar a tabuada
            for (int i = 1; i <= 10; i++){
                System.out.println(num + " x " + i + " = " + (num * i));
            }
            scan.close();
        }
    }
}
