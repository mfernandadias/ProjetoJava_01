package calculadora;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Escolha a opercao: ");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Divisão");

        int escolha = scan.nextInt();

        System.out.println("Digite o primeiro número: ");
        double a = scan.nextDouble();

        System.out.println("Digite o segundo número: ");
        double b = scan.nextDouble();

        switch(escolha){
            case 1:
                calculadora.setOperacao(new Adicao());
                break;
            case 2:
                calculadora.setOperacao(new subtracao());
                break;
            case 3:
                calculadora.setOperacao(new Multiplicacao());
                break;
            case 4:
                calculadora.setOperacao(new Divisao());
                break;
            default:
                System.out.println("Operacao Inválida");
                return;
            }
            double resultado = calculadora.calcular(a, b);
            System.out.println("O resultado é: " + resultado);
        }

    }

