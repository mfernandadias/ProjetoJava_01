package Aula17;
import java.util.Scanner;
/*
numa eleição existem três candidatos. Faça um programa que peça o npumero total de eleitores.
Peça para cada eleitor votar e ao final mostrar o número de votos de cada candidato;
 */

public class Exerc26 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite  o número de eleitores");
        int totalEleitores = scan.nextInt();

        int votoscandidato1 = 0;
        int votoscandidato2 = 0;
        int votosCandidato3 = 0;

        for (int i = 1; i <= totalEleitores; i++){
            System.out.println("Eleitor " + i + "escolha seu candidato (1, 2, 3)");
            int voto = scan.nextInt();

            switch(voto){
                case 1:
                    votoscandidato1++;
                    break;
                case 2:
                    votoscandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                default:
                    System.out.println("Voto inálido! Tente novamente.");
                    i--; //decrementar i para permitir que o eleitor vote novamente
                    break;
            }
        }
        System.out.println("Reultado da eleição");
        System.out.println("Candidato 1: " + votoscandidato1 + " votos");
        System.out.println("Candidato 2: " + votoscandidato2 + " Votos ");
        System.out.println("Candidato 2: " + votosCandidato3 + " votos");

        scan.close();

    }
}
