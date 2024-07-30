package calculadora;

public class Divisao implements Operacao{
    @Override
    public double calcular(double a, double b) {
        if(b != 0){
            return a /b;
        } else {
            throw new ArithmeticException("Divisão por zero não é permitido.");
        }
    }
}
