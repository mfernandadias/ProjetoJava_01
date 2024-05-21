package Aula17;
import java.util.Scanner;
/*

 */

public class Aula30 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Panificadora de Pão");

        System.out.println("Insira o valor do pão");
        double precoPao = scan.nextDouble();

        for (int paes = 1; paes <= 50; paes++ ){
            //calcular o preco total
            double precoTotal = paes * precoPao;

            //formatar o número de pães e o preço total
            String numeroPaes = String.format("%2d", paes);
            String precoTotalFormatada = String.format("%6.2f", precoTotal);

            //exibir linha da tabela
            System.out.println("ª " + numeroPaes + " -R$ " + precoTotalFormatada);
        }


    }
}
