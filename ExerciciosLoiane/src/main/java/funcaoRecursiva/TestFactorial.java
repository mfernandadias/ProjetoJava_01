package funcaoRecursiva;

public class TestFactorial {

    public static void main(String[] args){
        int n = 5;
        long fac = factorial(n);
        System.out.println("The factorial of 5 is: " + fac);
    }

    public static long factorial(int n){
        if(n == 1){
            return 1;
        }else{
            return factorial(n -1) * n; //incoque-se recursivamente até o final do retorno
        }
    }
}
