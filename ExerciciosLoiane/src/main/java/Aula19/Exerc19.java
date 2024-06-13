package Aula19;
/*
ler as duas notas bimestrais para cada conjunto de 10 alunos.
Armazenar as notas informadas em dois vetores "Nota 1" e "Nota2" do tipo real. Escreva um programa que calcule a média aritmédia simples das notas informadas
armazenando o resultado em um vetor "Result" de mesmo tipo e tamanho. Ao mostrar os resultados exibir a siatuação de cada aluno.
Se a média calculada foi superior ou igual a 7 aluno estará "aprovado", caso contrário, a situação do aluno será "reprovado".
 */

public class Exerc19 {
    public static void main(String[] args) {
        int[] nota1 = {10, 8, 4, 6, 4, 4, 7, 8, 3, 10};
        int[] nota2 = {9, 1, 3, 8, 9, 6, 10, 4, 7, 9};

        // Calculate and store average in a single loop
        float[] vetorResultado = new float[nota1.length];
        for (int i = 0; i < nota1.length; i++) {
            vetorResultado[i] = (nota1[i] + nota2[i]) / 2.0f; // Use 2.0f for explicit float conversion
        }

        // Print average with clear formatting
        System.out.println("Segue a média dos alunos:");
        for (int i = 0; i < vetorResultado.length; i++) {
            System.out.printf("Aluno %d: %.2f\n", i + 1, vetorResultado[i]); // Use printf for better formatting
        }

        // Check and print pass/fail status for each student
        for (int i = 0; i < vetorResultado.length; i++) {
            float media = vetorResultado[i];
            String status = media >= 7.0f ? "APROVADO" : "REPROVADO";
            System.out.printf("Aluno %d: %.2f (%s)\n", i + 1, media, status);
        }

    }
}
