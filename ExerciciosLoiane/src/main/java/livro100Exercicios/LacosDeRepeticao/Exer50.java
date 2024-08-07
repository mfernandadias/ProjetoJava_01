package livro100Exercicios.LacosDeRepeticao;

public class Exer50 {
    public static void main(String[] args) {
        /*
        Escreva um programa que exiba os números pares de 1 a 50 e os números ímpares de 51 a 100
        utilizando um laço de repetição
         */

        System.out.println("Os números pares");
        int i = 1;
        while (i <= 50) {
            if (i % 2 == 0) {
                System.out.println(i);
            } i++;
        }

        System.out.println("Números ímpares");
        int m = 51;
        while( m <= 100){
            if(m % 2 != 0 ){
                System.out.println(m);
            }m++;
        }
    }
}
/*
while(i <= 100){
  if(i <= 50 && i % 2 == 0){
  System.out.println(i);
  } else if( i >= 51 && i % 2 != 0){
  System.out.println(i);
  }
  i++;
 */
