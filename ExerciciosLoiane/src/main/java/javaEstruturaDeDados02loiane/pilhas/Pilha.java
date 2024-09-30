package javaEstruturaDeDados02loiane.pilhas;

public class Pilha<T> {
    private int tamanho;
    private T[] elementos;
    private int topo;

    @SuppressWarnings("unchecked")
    public Pilha(int tamanho){
        this.tamanho = tamanho;
        this.elementos = (T[]) new Object[tamanho];
        this.topo = -1;

    }
}
