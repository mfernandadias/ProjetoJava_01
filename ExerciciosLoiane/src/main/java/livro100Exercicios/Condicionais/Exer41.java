package livro100Exercicios.Condicionais;
import java.util.Scanner;

public class Exer41 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        /*
        Faça um programa que solicite o nome de um dia da semana e exiba se é um dia útil (segunda-feira)
        ou um dia de fim de semana (sábado e domingo)
         */

        System.out.println("Digite o nome de um dia da semana: ");
        String dia = scan.nextLine().trim().toLowerCase();


        switch(dia){
            case "segunda-feira":
            case "terça-feira":
            case "quarta-feira":
            case "quinta-feira":
            case "sexta-feira":
                System.out.println(dia + "è um dia útil");
                break;
            case "sabádo":
            case "domingo":
                System.out.println(dia + "é um dia de fim de semana");
                break;
            default:
                System.out.println("Dia inválido");
        }
        scan.close();
    }
}
