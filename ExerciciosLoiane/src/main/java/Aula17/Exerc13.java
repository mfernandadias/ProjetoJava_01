package Aula17;
import java.util.Scanner;
/*
Faga um programa que pega dois nimeros, base e expoente, calcule e
mostre 0 primeiro nimero elevado ao segundo numero. N&o utilize a
funcdo de poténcia da linguagem. ~~
 */

public class Exerc13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor para ser sua base ");
        int base = scan.nextInt();

        System.out.println("Digite um valor para ser seu expoente");
        int expoente = scan.nextInt();

        if (expoente < 0){
            System.out.println("O expoente deve ser um número não negativo. ");
            return;
        }
        // Calcula a potência
        long resultado = calcularPotencia(base, expoente);

        // Exibe o resultado
        System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);

        scan.close();
    }

    // Método para calcular a potência
    public static long calcularPotencia(int base, int expoente) {
        long resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;


    }
}
