package livroJavaIniciantes;

public class ForEach {
    public static void main(String[] args){
        int nums[] = {1, 2, 4, 3, 6, 5, 5, 6, 7, 8, 9};
        int sum = 0;

        //usa o laço for de estilo for-each para exibir e somar os valores
        for(int x : nums){ //----->um laço for de estilo for-each
            System.out.println("Value is: " + x);
            sum += x;
            if(x == 5); //interrompe o loop quando 5 é obtido
        }
        System.out.println("Summation: " + sum);
    }
}
