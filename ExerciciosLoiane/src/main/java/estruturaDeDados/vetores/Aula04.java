package estruturaDeDados.vetores;

public class Aula04 {
    public static void main(String[] args){
        Vetor02 vetor = new Vetor02(10);

        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 02");
        vetor.adiciona("Elemento 3");

        System.out.println(vetor.tamanho());

        System.out.println(vetor.toString());
    }
}
