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

    public boolean estaVazia(){
        return topo == -1;
    }

    public boolean estaCheia(){
        return topo == tamanho - 1;
    }
    public void empilhar(T elemento) {
        if (estaCheia()) {
            System.out.println("A pilha está cheia!");
        } else {
            elementos[++topo] = elemento;
        }
    }

    public T desempilhar() {
        if (estaVazia()) {
            System.out.println("A pilha está vazia!");
            return null;
        } else {
            return elementos[topo--];
        }
    }

    public T topo() {
        if (estaVazia()) {
            System.out.println("A pilha está vazia!");
            return null;
        } else {
            return elementos[topo];
        }
    }

    public int tamanho() {
        return topo + 1;
    }

}
