package estruturaDeDados.vetores;

public class Aula02 {

    public static void main(String[] args){

        Vetor02 vetor = new Vetor02(5);

        try {
            vetor.adiciona("Elemento 1");
            vetor.adiciona("Elemento 2");
            vetor.adiciona("Elemento 3");
        } catch(Exception e){

            e.printStackTrace();
        }
        /*// Imprime uma mensagem na tela
        System.out.println("Vetor criado com tamanho 5");

        // Se o objeto Vetor02 tiver um método para imprimir seu conteúdo, por exemplo, toString()
        System.out.println(vetor);
    }*/
        }

}
