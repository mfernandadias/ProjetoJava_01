package aula19Arrays;
import java.util.Scanner;

public class Exerc19 {
    /*
    ler as duas notas bimestrais para um conjunto de 10 alunos.
    Armazenar as notas informadas em dois vetores "Nota1" e "Nota2" do tipo real.
    Escreva um porgrama que calculo a média aritmédica simples das notas informadas armazenadas o resultado em um valor
    "Result" de mesmo tipo e tamanho. Ao mostrar os resultaldos exibir a situação de cada aluno. Se a média calculado
    for superior ou igual a 7 o aluno estará "aporvado", caso contrário, a siatuação do aluno será "reprovada".
     */
    public static void main(String[] args){
        //declarando os vetores
        double[] notas1 = {7.0, 8.0, 7.0, 9.0, 10.0, 8.0, 7.0, 7.0, 8.0, 9.0};
        double[] notas2 ={6.0, 9.9, 6.5, 9.0, 10.0, 8.0, 7.0, 8.0, 8.0, 9.0};
        double[] media = new double[10];

        for(int i =0; i < 10; i++){
            media[i] = (notas1[i] + notas2[i]) / 2;
        }

        System.out.println("Notas 1: ");
        for (int i = 0; i < 10; i++){
            System.out.println("Aluno " + (i + 1) + ": "+ notas1[i]);
        }

        System.out.println("Notas 2: ");
        for(int i = 0; i < 10; i++){
            System.out.println("Aluno " + (i + 1) + ": " + notas2[i]);
        }

        System.out.println("Médias: ");
        for(int i = 0; i < 10; i++) {
            System.out.println(" Média do Aluno " + (i + 1) + " :  " + media[i]);
            if (media[i] >= 7){
                System.out.print(" - Aprovado ");
            } else {
                System.out.print(" - Reprovado ");
            }
        }
    }
}
