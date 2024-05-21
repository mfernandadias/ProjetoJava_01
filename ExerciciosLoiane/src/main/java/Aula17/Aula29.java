package Aula17;
import java.util.Scanner;

/*
29.0 Sr. Manoel Joaquim possui uma grande loja de artigos de R$ 1,99,
com cerca de 10 caixas. Para agilizar o célculo de quanto cada cliente
deve pagar ele desenvolveu um tabela que contém o numero de itens
que o cliente comprou e ao lado o valor da conta. Desta forma a
atendente do caixa precisa apenas contar quantos itens o cliente esta
levando e olhar na tabela de pregos. Vocé foi contratado para
desenvolver o programa que monta esta tabela de precos, que contera
0s precos de 1 até 50 produtos, conforme 0 exemplo abaixo:

© Lojas Quase Dois - Tabela de pregos
© 1-Rs 1.99

© 2 - R$ 3.98

© 50 = R$ 99.50
 */

public class Aula29 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Título da loja e tabela
        System.out.println("Lojas Quase Dois - Tabela de Preços");
        System.out.println("----------------------------------------"); // 20 hífens

        // Laço para cada produto (1 a 50)
        for (int produto = 1; produto <= 50; produto++) {
            // Formatação do número do produto e preço
            String numeroProduto = String.format("%2d", produto);
            double preco = produto * 1.99;
            String precoFormatado = String.format("%5.2f", preco); // 5 dígitos totais, 2 casas decimais

            // Exibir linha da tabela
            System.out.println(" " + numeroProduto + " - R$ " + precoFormatado);
        }
    }
}
