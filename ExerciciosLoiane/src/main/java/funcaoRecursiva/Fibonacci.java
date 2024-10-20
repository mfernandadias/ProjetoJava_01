package funcaoRecursiva;

public class Fibonacci {

    //método recursico estático para calcular o N-ésimo termo da sequência
    public static int fibonacci(int n){
        //caso base: os dois primeiros números da sequência são 0 e 1
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        //chamada recursiva
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args){
        int n = 10; //exemplo: encontrar o 10ª termo
        System.out.println("O " + n + "ª termo da sequência de Fibonacci é: " + fibonacci(n));
    }
}
