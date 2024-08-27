package vetorBasico;
import java.util.ArrayList;

public class ArrayOperations {
    //https://www.notion.so/Vetores-b-sicos-7cf1838a3afb4e52a5ecf26ae21c09a6
    //método para soma de elementos
    public int sum(int[] array){
        int sum = 0;
        for(int num : array){
            sum += num;
        }
        return sum;
    }

    //encontrar o maior elemento
    public int findMax(int[] array){
        int max = array[0];
        for(int num : array){
            if(num > max){
                max = num;
            }
        }
        return max;
    }

    //enontrar o menor elemento
    public int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    /*método para inverter um array
     public static void inverterArray(int[] array){
        int inicio = 0;
        int fim = array.length - 1;

        troca os elementos do inicio com os do fim
        while(inicio < fim){
            int temp = array[inicio];
            array[inicio] = array[fim];
            array[fim]= temp;

            //move os índices para o centro do array
            inicio++;
            fim--;
        }
    } */

    //inversão de array
    public int[] revertArray(int[] array){
        int[] reversed = new int[array.length];
        for(int i = 0; i < array.length; i++){
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    //busca lineara
    public int linearSearch(int[] array, int key){
        for(int i = 0; i < array.length; i++){
            if(array[i] == key){
                return i;
            }
        }
        return -1; //retorna -1 se o elemento não for encontrado
    }

    //orpedação (Bubble Sort)
    public int[] bubleSort(int[] array){
        int n = array.length;
        for(int i = 0; i < n -1; i++){
            for(int j = 0; j < n - 1 - i; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    //cálculo da média
    public double calculateAverage(int[] array){
        int sum = sum(array);
        return(double) sum / array.length;
    }

    //8. duplicação de Elementos
    public int[] duplicateElements(int[] array){
        int[] duplicated = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            duplicated[2 * i] = array[i];
            duplicated[2 * i + 1] = array[i];
        }
        return duplicated;
    }

    // 9. Contagem de Elementos Específicos
    public int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int num : array) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    // 10. Matriz Transposta (para arrays 2D)
    public int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
}
