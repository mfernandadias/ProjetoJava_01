package aula24;

public class LivroLivraria {
    private String titulo;
    private String autor;
    private String id;
    private Double valor;

    public LivroLivraria(String titulo, String autor, String id, Double valor){
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
        setValor(valor); //usando o setter para validação
    }
    private void setValor(Double valor) {
    }

    public String titulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String autor() {
        return autor;
    }

    public Double valor() {
        return valor;
    }

    public String id() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
