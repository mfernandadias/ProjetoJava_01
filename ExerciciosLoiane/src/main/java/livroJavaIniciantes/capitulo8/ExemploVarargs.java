package livroJavaIniciantes.capitulo8;

public class ExemploVarargs {

    // Método que usa varargs
    public static void somar(int... numeros) {
        int soma = 0;
        // Percorre o array "numeros" e soma os valores
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("A soma é: " + soma);
    }

    public static void main(String[] args) {
        // Chamando o método com diferentes quantidades de argumentos
        somar(1, 2, 3);        // Saída: A soma é: 6
        somar(10, 20);         // Saída: A soma é: 30
        somar(5);              // Saída: A soma é: 5
        somar();               // Saída: A soma é: 0
    }
}
