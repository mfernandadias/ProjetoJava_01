package aula19Arrays;
import java.util.Scanner;

public class Exerc20 {
    /*
    implementar um programa que obtenha a cotação do dólar (U$) em relação ao real e a
    seguir armazene o vetor A com 20 elementos as seguintes conversões:
    A[i] = cotação do dolar * i, para todos i variando de 1 até 20;
     */
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        //digite a cotação atual do dola
        System.out.println("Digite a cotação do dólar: ");
        double cotacaoDolar = scan.nextDouble();

        // crie um vetor com 20 elementos
        double[] vetor = new double[20];

        //preencher o vetor com as conversões
        for(int i = 0; i < 20; i++){
            vetor[i] = cotacaoDolar * ( i + 1);
        }

        //exibe os valores do vetor A
        System.out.println("Valores convertidos: ");
        for(int i = 0; i < 10; i++){
            System.out.println( "Vetor A " + (i + 1) + " : " + vetor[i]);
        }
        scan.close();

   }
}
