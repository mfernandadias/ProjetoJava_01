package estruturaDadosJavaLoiane.matrizes;

public class MatrizTridimensional {
     /*
    faça um programa que crie uma matriz 3x3x3 onde cada elemento da matriz seja igual a soma dos seus
    índices (exemplo: M[1, 2, 1] = 1+2+1 = 4)
    Obtenha a soma de todos elementos da matriz, e obtenha soma dos elementos cujos valores são pares e a soma dos
    elementos cujos valors são ímpares
    Exibir natela os valores da soma totla, soma dos pares e soma dos ímpares
     */
    public static void main(String[] args) {
        int[][][] matrizTridimensional = new int[3][3][3];

        for (int i = 0; i < matrizTridimensional.length; i++) {
            for (int j = 0; j < matrizTridimensional[i].length; j++) {
                for(int k=0; k<matrizTridimensional[i][j].length; k++){
                    System.out.println("i = " + i + " - j = " + " - k = " + " + k");
                    matrizTridimensional[i][j][k] = i + j + k;

                }
            }
        }

        int soma = 0;
        int somaPares = 0;
        int somaImpares = 0;
        for(int i = 0; i < matrizTridimensional.length; i++){
            for(int j = 0; j < matrizTridimensional.length; i++){
                for(int k = 0; k < matrizTridimensional.length; k++){
                    soma += matrizTridimensional[i][j][k];

                    if(matrizTridimensional[i][j][k] % 2 == 0){
                        somaPares += matrizTridimensional[i][j][k];
                    } else {
                        somaImpares += matrizTridimensional[i][j][k];
                    }
                }
            }
        }

        System.out.println("Soma total = " + soma);
        System.out.println("Soma pares = " + somaPares);
        System.out.println("Soma impares = " + somaImpares);

    }

}
