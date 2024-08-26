package estruturaDeDados.vetores;

import estruturaDeDados.vetor.Vetor02;

public class Aula09 {
    public static void main(String[] args){
        Vetor02 vetor = new Vetor02(10);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");

        System.out.println(vetor);

        vetor.remove(1);

        System.out.println(vetor);

        System.out.println("Remover o elemento E");

        int pos = vetor.busca("E");
        if(pos > -1){
            vetor.remove(pos);
        } else {
            System.out.println("Elemento não eciste no vetor");
        }
        System.out.println(vetor);
    }
}
