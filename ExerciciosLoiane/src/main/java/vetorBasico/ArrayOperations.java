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
}
