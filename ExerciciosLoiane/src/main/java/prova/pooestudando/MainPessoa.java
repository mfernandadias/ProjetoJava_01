package prova.pooestudando;

public class MainPessoa {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("João", 30, 70.5);

        //imprimir descrição completa
        pessoa.descricaoCompleta();

        //alterar alguns atributos
        pessoa.setNome("Maria");
        pessoa.setIdade(25);
        pessoa.setPeso(65.0);

        //imprmir descrição atualizada
        System.out.println();
        pessoa.descricaoCompleta();
    }
}
