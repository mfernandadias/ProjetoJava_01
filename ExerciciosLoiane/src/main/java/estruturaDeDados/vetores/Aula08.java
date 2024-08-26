package estruturaDeDados.vetores;

import estruturaDeDados.vetor.Vetor02;

public class Aula08 {
    public static void main(String[] args){
        Vetor02 vetor = new Vetor02(10);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");

        System.out.println(vetor);
    }
}
