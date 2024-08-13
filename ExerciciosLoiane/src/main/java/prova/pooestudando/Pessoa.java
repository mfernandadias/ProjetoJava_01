package prova.pooestudando;


public class Pessoa {

    //atributos
    private String nome;
    private int idade;
    private String sexo;
    private double peso;

    //construtor
    public Pessoa(String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    //métodos getters


    public String nome() {
        return nome;
    }

    public int idade() {
        return idade;
    }

    public String sexo() {
        return sexo;
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

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //métodos para imprimir uam descrição completa da pessoa
    public void descricaoCompleta(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + "kg ");
    }


}
