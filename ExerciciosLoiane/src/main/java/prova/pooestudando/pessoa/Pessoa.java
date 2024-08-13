package prova.pooestudando.pessoa;

public class Pessoa {
    String nome;
    int idade;
    double peso;

    public Pessoa(String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public String nome() {
        return nome;
    }

    public int idade() {
        return idade;
    }

    public double peso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void imprimirDescricaocompleto(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
    }
}
