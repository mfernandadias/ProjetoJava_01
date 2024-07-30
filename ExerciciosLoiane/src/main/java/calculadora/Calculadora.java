package calculadora;

public class Calculadora {
    private Operacao operacao;

    public void setOperacao(Operacao operacao){
        this.operacao = operacao;
    }

    public double calcular(double a, double b){
        return operacao.calcular(a, b);
    }

    public void setOperacao(subtracao subtracao) {
    }
}
