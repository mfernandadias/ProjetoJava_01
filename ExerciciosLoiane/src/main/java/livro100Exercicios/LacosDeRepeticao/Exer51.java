package livro100Exercicios.LacosDeRepeticao;

public class Exer51 {
    public static void main(String[] args){
        /*Escreva um programa que imprima na tela a tabuada de todos os números de 1 a 10*/

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabusada do número " + i + ": ");
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = ");
            }
        }
    }
}
