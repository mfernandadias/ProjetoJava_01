package aula19Arrays;

public class Exer02 {
    public static void main(String[] args){
        //inicializar um vetor de inteiros com valores lietrais
        int[] numeros = {10, 20, 30, 40, 50, 60};

        //acessar e imprimir os valores do vetor
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Elemento no índice " + i + " : " + numeros[i]);
        }

        // Inicializar um vetor de strings
        String[] nomes = {"Alice", "Bob", "Charlie", "David", "Eva"};

        // Acessar e imprimir os valores do vetor
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome no índice " + i + ": " + nomes[i]);
        }

        int[] valores = {10, 20, 30, 40, 50};
        int soma = 0;

        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }

        System.out.println("A soma dos elementos do vetor é: " + soma);

        int[] num = {10, 20, 30, 40, 50};
        int maior = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > maior) {
                maior = num[i];
            }
        }

        System.out.println("O maior elemento do vetor é: " + maior);
    }
}
