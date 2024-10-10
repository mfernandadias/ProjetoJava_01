package livroEstruturaDadosJava.array;

import static java.util.Arrays.sort;

public class TestSelectSort {
    /*
    selecione o algoritmo de ordenar(Select sorting algorthm):
    classifica uma matriz localizando repetidamente o elemento mínimo de uma parte não classificada e colocando-a no ínicio

    Ordenar os seguintes dados de pequeno a grande
    60 80 95 50 70
     */

    public static void main(String[] args){
        int[] scores = {60, 80, 95, 50, 70};
        sort(scores);
        for(int score : scores ){
            System.out.println(score + ", ");
        }
    }

    public static void sort(int[] arrays){

        for(int i = 0; i < arrays.length - 1; i++) {
            int minIndex = i; //o índice do minimo selecionando
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[minIndex] > arrays[j]) {
                    minIndex = j;
                }
            }

            if (i != minIndex) //o mínimo de arrays[i] é trocada pelos arrays[minIndex]
            {
                int temp = arrays[i];
                arrays[i] = arrays[minIndex];
                arrays[minIndex] = temp;
            }

        }
    }
}
