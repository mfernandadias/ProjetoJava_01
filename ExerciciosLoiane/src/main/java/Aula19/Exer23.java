package Aula19;
import java.util.Scanner;
/*
criar um vetor A com 10 elementos inteiros. desenvolver um programa que verifique se "todos" os elemntos do vetor A são pares.
Se pelo menos um elemento do vetor não for par o processo de repetição para percerrer os elementos do vetor deve ser encerrado, como
sugestão: utilize uma variável do tipo flag para atingir este próposito
 */

public class Exer23 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] A = new int[10];

        //criação e inicialização do vetor A com 10 elementos inteiros
        System.out.print("Digite 10 valores para preencher o vetor A ");
        for (int i = 0; i < A.length; i++){
            A[i] = scan.nextInt();
        }

        //variável flag para verificar se todos os elentos são pares
        boolean todosPares = true;

        //percorre o vetor para verificar se todos os selementos são pares
        for (int i = 0; i < A.length; i++){
            if (A[i] % 2 != 0){
                todosPares = false; //eencontre um elemento ímpar
                break; // encerra o loop
            }
        }

        //imprime o resultado da verificação
        if(todosPares){
            System.out.println("Todos os elementos do vetor A são pares");
        } else {
            System.out.println("Nem todos os elementos do vetor A são pares");
        }


    }
}
