package condicionais;
import java.util.Scanner;
//Classifique a nota de um aluno em letras (A, B, C, D, F)

public class Exerc03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor a nota do aluno");
        double nota = scan.nextDouble();

        if(nota >= 7){
            System.out.println("Parabéns... Você foi Aprovado");
        } else {
            System.out.println("Infelizmente sua nota foi menor de 7... Você foi REPROVADO");;
        }
    }
}
