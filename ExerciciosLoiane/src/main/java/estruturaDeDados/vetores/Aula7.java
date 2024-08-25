package estruturaDeDados.vetores;

public class Aula7 {
    public static void main(String[] args){
        Vetor02 vetor = new Vetor02(10);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");
        vetor.adiciona("F");

        System.out.println(vetor);

        vetor.adiciona(0, "A");


    }
}
