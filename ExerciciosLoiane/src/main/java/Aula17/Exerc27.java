package Aula17;
import java.util.Scanner;
/*
faça um programa que calcule o número médio de alunos por turma, Para isso, peça a quantidade
de turmas e a quantidade de alunos para cada turma. as turmas não podem er mais de 40 alunos
 */

public class Exerc27 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        double media = 0.0;
        int totalAlunos =  0;

        System.out.println("Digite o números de turmas que há na escola");
        int quantidadesTurmas = scan.nextInt();

        for (int i = 1; i <= quantidadesTurmas; i++){
            while(true){
                System.out.println("Digite a quantidade  de alunos da turma: " + i + " por turma");
                quantidadesTurmas = scan.nextInt();

                if(totalAlunos <= 40){
                    break;
                } else{
                    System.out.println("A turma não pode ter mais de 40 alunos. Ter ");
                }
            }
            totalAlunos += quantidadesTurmas;
        }

        double mediaAlunosPorTurma = (double) totalAlunos / quantidadesTurmas;
        System.out.println("O número médio de alunos por turma é: " + mediaAlunosPorTurma);

        scan.close();

    }
}
