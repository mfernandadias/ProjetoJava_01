package estruturaDeDados.vetores;

import java.util.HashMap;

public class Aula10 {



    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args){
        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato("Contato 1", "1234-1234", "Conta@gamil.com");
        Contato c2 = new Contato("Contato 2", "1234-1234", "Conta@gamil.com");
        Contato c3 = new Contato("Contato 3", "1234-1234", "Conta@gamil.com");

        Contato c4 = new Contato("Contato 4", "1234-1234", "Conta@gamil.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamanho = " + vetor.tamanho());

        int pos = vetor.busca(c1);
        if(pos > -1){
            System.out.println("Elemento existe no vetor");
        } else{
            System.out.println("Elemento eciste no vetor");
        }

        System.out.println(vetor);








    }
}
