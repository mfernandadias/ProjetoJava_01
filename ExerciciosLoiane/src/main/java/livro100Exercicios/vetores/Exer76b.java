package livro100Exercicios.vetores;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Exer76b {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        /*
        escreva um programa que leia um vetor de números
        inteiros e exiba os elementos na ordem inversa
         */
        System.out.println("Digite o tamanho do vetor");
        int tamanho = scan.nextInt();

        ArrayList<Integer> vetor = new ArrayList<Integer>();

        //solicitamos ao usuário que digite os elementos do vetor usando um loop for:
        System.out.println("Digite os elementos do vetor: ");
        for(int i = 0; i < tamanho; i++){
            vetor.add(scan.nextInt());
        }

        //utilizando o método reverse da classe Colections para o vetor
        Collections.reverse(vetor);

        System.out.println("Elementos do vetor em ordem inversa: ");
        //por fim, percorremos o vetor invertido e exibimos seus elementos na ordem inversa
        for(int elemento : vetor){
            System.out.println(elemento + " ");
        }
        scan.close();


    }
}
