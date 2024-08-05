package livro100Exercicios.Strings;
import java.util.Arrays;
import java.util.Scanner;

public class VerificarAngrama {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String palavra1 = scan.nextLine();

        System.out.println("Digite a segunda palavra");
        String palavra2 = scan.nextLine();

        //removemos os espaços em branco e convertemos para letras minúsuclas
        palavra1 = palavra1.replaceAll("\\s+", "").toLowerCase();
        palavra2 = palavra2.replaceAll("\\s+", "").toLowerCase();

        //verifique se as duas palavras tem o mesmo tamanho
        if(palavra1.length() != palavra2.length()){
            System.out.println("A segunda palavra não é um anagrama da primeira");
        } else {
            //convertemos as palavras para arrays da caracteres
            char[] arr1 = palavra1.toCharArray();
            char[] arr2 = palavra2.toCharArray();
            //ordenamos os arrays de caracteres
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            //verificamos se os arrays ordenados são iguais
            if(Arrays.equals(arr1, arr2)){
                System.out.println("A segunda é um anagroma da primeira");
            }else {
                System.out.println("A segunda palavra não é um anagroma da primeira");
            }
        }
        scan.close();

    }
}
