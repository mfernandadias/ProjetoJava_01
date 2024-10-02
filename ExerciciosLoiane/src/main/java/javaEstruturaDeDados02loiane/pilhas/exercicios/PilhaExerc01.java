package javaEstruturaDeDados02loiane.pilhas.exercicios;
import java.util.Scanner;

public class PilhaExerc01<T> {
    private int[] elementos;
    private int topo;

    public PilhaExerc01(int capacidade){
        elementos = new int[capacidade];
        topo = -1;
    }

    public boolean estaVazia(){
        return topo  == -1;
    }

    public boolean estaCheia(){
        return topo == elementos.length - 1;
    }

    public void empilhar(int elemento){
        if(estaCheia()){
            System.out.println("Pilha cheia! Não é possível empilhar o elemento: " + elemento);
        }else{
            elementos[++topo] = elemento;
        }
    }
    public int desempilhar() {
        if (estaVazia()) {
            System.out.println("Pilha vazia! Não é possiveel desempilhar.");
            return -1;
        } else {
            return elementos[topo--];
        }
    }
}
