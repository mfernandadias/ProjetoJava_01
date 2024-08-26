package estruturaDeDados.vetores;

public class Contato {
    private String nome;
    private String telefone;
    private String email;

    public Contato() {}

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String nome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public String telefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String email() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
