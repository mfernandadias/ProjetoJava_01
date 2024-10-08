package livroEstruturaDadosJava.array;

public class TestOneArrayInsert {
    /*
    inserir 75 na matriz unidimensional
     */
    public static int[] insert(int[] array, int value, int insertIndex){
        int[] tempArray = new int[array.length + 1];

        for(int i = 0; i < array.length; i++){
            if(i < insertIndex){
                tempArray[i] = array[i]; //copie os elementos restantes tIndex para tempArray
            }else{
                tempArray[i + 1] = array[i]; //copie os elementos restantes para tempArray
            }
        }

        tempArray[insertIndex] = value; //insera o valor em tempArray
        return tempArray;
    }
    public static void main(String[] args){
        int[] array = {90, 70, 50, 80, 60, 85};
        array = insert(array, 75, 2);

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + ", ");
        }
        
    }
}
