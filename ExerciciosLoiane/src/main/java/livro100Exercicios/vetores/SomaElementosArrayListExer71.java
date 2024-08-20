package livro100Exercicios.vetores;
import java.util.Scanner;
import java.util.ArrayList;

public class SomaElementosArrayListExer71 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do seu Vetor: ");
        int quantidade = scan.nextInt();

        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Digite os elementos da Lista: ");
        for (int i = 0; i < quantidade; i++){
            lista.add(scan.nextInt());
        }

        int soma = 0;
        for (int numero : lista){
            soma += numero;
        }

        System.out.println("A soma dos elementos é: " + soma);

        scan.close();
    }
}
