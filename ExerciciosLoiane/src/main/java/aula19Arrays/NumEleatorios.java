package aula19Arrays;
import java.util.Random;

public class NumEleatorios {
    public static void main(String[] args){
        //cria uma instância da classe Random
        Random random = new Random();


        // Declara e inicializa um vetor de inteiros com 10 elementos
        int[] numerosAleatorios = new int[10];

        // Preenche o vetor com números aleatórios
        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = random.nextInt(100); // Gera um número aleatório entre 0 e 99
        }

        // Imprime os números aleatórios do vetor
        System.out.println("Números aleatórios no vetor:");
        for (int i = 0; i < numerosAleatorios.length; i++) {
            System.out.println("Elemento no índice " + i + ": " + numerosAleatorios[i]);
        }

    }
}
