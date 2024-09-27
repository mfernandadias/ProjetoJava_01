package funcaoRecursiva;

public class FatorialNaoRecursivo {

        public static int  fatorial ( int num){
            if (num == 0) {
                return 1;
            }
            return num * fatorial(num - 1);
        }

    public static void main(String[] args) {
        int result = fatorial(5);
        System.out.println("Fatorial de 5: " + result);
    }

}
