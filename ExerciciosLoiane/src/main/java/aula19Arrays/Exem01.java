package aula19Arrays;

public class Exem01 {
    public static void main(String[] args) {
        //declarar e inicializar um vetor de inteiros
        int[] numeros = new int[5]; //cria um vetor de inteiros com 5 elementos

        //atribuir valores ao vetor
        numeros[0] = 10;
        numeros[1] = 10;
        numeros[2] = 10;
        numeros[3] = 10;
        numeros[4] = 10;

        //acessar e imprimir os valores do vetor
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Elemento no índice " + i + numeros[i]);
        }
    }
}
