package livro100Exercicios.Condicionais;
import java.util.Scanner;
/*
Faça um programa qu eleia as notas de duas provas e informe se o aluno foi aprovado (nota maior ou igual
de 6) ou reprovado (nota menor de 6) em cada uma das provas
 */

public class Exer31 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua primeira nota");
        double nota1 = scan.nextDouble();

        System.out.println("Digitee sua segunda nota");
        double nota2 = scan.nextDouble();

       if(nota1 >= 6.0){
           System.out.println("Aluno aprovado na primeira prova");
       } else {
           System.out.println("Aluno reprovado na segunda prova");
       }

       if(nota2 >= 6.0){
           System.out.println("Aluno aprovado na primeira prova");
       } else {
           System.out.println("Aluno reprovado na segunda prova");
       }


    }
}
