package poo;

public class Calculadora {
    //Método que soma dois números interios
    public int somar(int a, int b){
        return a + b;
    }

    /*
    a sobrecarga de métodos ermite criar vários métodods com o mesmo nome, mas com diferentes
    listas de parâmetros. Isso aumenta a flexibilidade do código
     */
    public double somar(double a, double b){
        return a + b;
    }

    public int somar(int a, int b, int c){
        return a + b + c;
    }

    //método que imprime uma mensagem
    public void imprimirMensagem(String mensagem){
        System.out.println(mensagem);
    }
}
