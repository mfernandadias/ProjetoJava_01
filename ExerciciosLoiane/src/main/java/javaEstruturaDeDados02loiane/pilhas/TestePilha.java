package javaEstruturaDeDados02loiane.pilhas;

public class TestePilha {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>(5);

        // Empilhando elementos
        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);

        System.out.println("Elemento no topo: " + pilha.topo()); // Deveria ser 30

        // Desempilhando elementos
        System.out.println("Desempilhando: " + pilha.desempilhar()); // Deveria ser 30
        System.out.println("Desempilhando: " + pilha.desempilhar()); // Deveria ser 20

        System.out.println("Elemento no topo: " + pilha.topo()); // Deveria ser 10

        // Testando se a pilha está vazia
        System.out.println("Pilha está vazia? " + pilha.estaVazia()); // Deveria ser false

        // Desempilhando até esvaziar
        pilha.desempilhar(); // Desempilha 10
        System.out.println("Pilha está vazia? " + pilha.estaVazia()); // Deveria ser true

        // Tentando desempilhar de uma pilha vazia
        pilha.desempilhar(); // Deveria avisar que a pilha está vazia
    }
}
