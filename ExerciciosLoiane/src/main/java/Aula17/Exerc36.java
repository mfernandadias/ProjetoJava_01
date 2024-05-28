package Aula17;
import java.util.Scanner;
/*
desenvolva um programa que faça a tabiada de um número qualquer inteiro que será digitado pelo usuário,
mas a tabuada não deve necessiriamente iniciar em 1 e terminar em 10, o valor inicial e final devem ser
informados também pelo usuário, conforme exemplo abaixo:
* obs: você deve verificar se o usuário não digitou o final menor que o incial.
 */
public class Exerc36 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        int numeroTabuada;
        int inicioIntervalo;
        int fimIntervalo;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número para a tabuada: ");
        numeroTabuada = entrada.nextInt();

        System.out.print("Digite o valor inicial do intervalo: ");
        inicioIntervalo = entrada.nextInt();

        System.out.print("Digite o valor final do intervalo: ");
        fimIntervalo = entrada.nextInt();

        if (inicioIntervalo > fimIntervalo) {
            System.out.println("Intervalo inválido. O valor final deve ser maior que o inicial.");
            return;
        }

        System.out.println("\nTabuada de: " + numeroTabuada);
        System.out.println("Intervalo de " + inicioIntervalo + " a " + fimIntervalo + ":");

        for (int i = inicioIntervalo; i <= fimIntervalo; i++) {
            int resultado = numeroTabuada * i;
            System.out.println(numeroTabuada + " x " + i + " = " + resultado);
        }

        scan.close();
    }
}


