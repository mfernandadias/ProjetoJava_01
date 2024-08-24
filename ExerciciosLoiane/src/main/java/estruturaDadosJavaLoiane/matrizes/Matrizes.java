package estruturaDadosJavaLoiane.matrizes;

public class Matrizes {
    public static void main(String[] args){

        double[][] notasAluno = new double[30][4];

        notasAluno[0][0] = 10;
        notasAluno[0][1] = 7;
        notasAluno[0][2] = 10;
        notasAluno[0][3] = 10;

        notasAluno[1][0] = 10;
        notasAluno[1][1] = 7;
        notasAluno[1][2] = 10;
        notasAluno[1][3] = 10;

        notasAluno[2][0] = 10;
        notasAluno[2][1] = 7;
        notasAluno[2][2] = 10;
        notasAluno[2][3] = 10;

        for(int i = 0; i < notasAluno.length; i++){
            //System.out.println(notasAlun[i] + " ");
            for (int j = 0; j < notasAluno[i].length; j++){
                System.out.println(notasAluno[i][j] + " - ");
            }
            System.out.println();
        }
        //mudança de valor da matriz
        notasAluno[1][3] = 8;

        System.out.println();

        for(int i = 0; i < notasAluno.length; i++){
            //System.out.println(notasAlun[i] + " ");
            for (int j = 0; j < notasAluno[i].length; j++){
                System.out.println(notasAluno[i][j] + " - ");
            }
            System.out.println();
        }
        System.out.println("Calculando a média de cada aluno");
        double soma;
        for(int i = 0; i < notasAluno.length; i++){

            soma = 0;
            for(int j = 0; j < notasAluno.length; j++){
                soma += notasAluno[i][j];
            }
            System.out.println("Média do aluno "+ i + "é =" + (soma / 4));
        }
        double[] notas = {7, 8, 9, 10};

        int[][] notasAluno2 = {{7, 8, 9, 10}, {8, 6, 7, 10}};

        System.out.println("Output da matriz notasAlunos2");

        for(int i = 0; i < notasAluno.length; i++){
            //System.out.println(notasAlun[i] + " ");
            for (int j = 0; j < notasAluno[i].length; j++){
                System.out.println(notasAluno[i][j] + " - ");
            }
            System.out.println();
        }
    }
}
