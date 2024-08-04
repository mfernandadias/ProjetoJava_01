package aula24;
/*
usando o resultado do modelo "Livro" como base, crie uma classee "LivroDeBiBlioteca" que representa
os dadso básicos de um livro de  uma biblioteca, que pode ser emprestado a leitores
 */

public class LivroDeBiblioteca {
    private String titulo;
    private String autor;
    private boolean disponivelParaAlugar;
    private Double valor;

    public LivroDeBiblioteca(String titulo, String autor, boolean dispovelParaAlugar, Double valor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivelParaAlugar = disponivelParaAlugar;
        this.valor = valor;
    }

    public Double valor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public boolean disponivelParaAlugar() {
        return disponivelParaAlugar;
    }

    public void setDisponivelParaAlugar(boolean disponivelParaAlugar) {
        this.disponivelParaAlugar = disponivelParaAlugar;
    }

    public String autor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String titulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
