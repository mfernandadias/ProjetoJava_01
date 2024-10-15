package livroJavaIniciantes;

public class Bubble {
    /*
    a classificação por bolhas encontrando seu nível em um tanque de água. A classificação por bolha funciona percorrendo várias vezes
    o array e trocando os elementos que estiverem fora do lugar quando preciso.
    Observe que a classificação se baseia em dois laços for. O laço interno verifica os elementos fora de ordem. Quando um par de elementos fora de
    ordem é encontrado, os dois elementos são trocados
     */
    public static void main(String[] args){
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};

        int  a, b, t;
        int size;

        size = 10; // número de elemtnos a serem classificados

        //exibe o array original
        System.out.println("Original array is: ");
        for(int i = 0; i < size; i++){
            System.out.println(" " + nums[i]);
        } System.out.println(" ");

        //esta é a classificação por bolha
        for(a =1; a < size; a++){
            for(b=size-1; b >= a; b--){
                if(nums[b-1] > nums[b]){
                    //troca de elementos
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }

            //exibe o array classificado
            System.out.println("Sorted array is: ");
            for(int i = 0; i < size; i++){
                System.out.println(" " + nums[i]);
                System.out.println();
            }
        }

    }
}
