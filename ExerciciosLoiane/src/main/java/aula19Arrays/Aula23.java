package aula19Arrays;
/*Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
que verifique se "todos" os elementos do vetor A s&o pares. Se pelo
menos um elemento do vetor n&o for par o processo de repeticdo para
percorrer os elementos do vetor deve ser encerrado, como sugestéo:
utilize uma variével do tipo flag para atingir este propdsito.*/

public class Aula23 {
    public static void main(String[] args){
        int[] A = {1, 2, 3, 4, 5, 6, 7, 9, 20};

        //criar  vetor A com 10 elementos inteiros
        boolean todosPares = true;

        //cycle through the elements of the vector
        for(int i = 0; i < A.length; i++){
            //verificar se o elemetno é impar
            if(A[i] % 2 != 0){
                todosPares = false; //encontrou um elemento ímpar
                break; //encerra o loop
            }
        }

        //exibir o resultado
        if(todosPares){
            System.out.println("Todos os elementos do vetor são pares.");
        } else {
            System.out.println("Pelo menos um elemento do vetor não é par");
        }
    }
}
