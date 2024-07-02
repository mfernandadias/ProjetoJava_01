package aula19;

public class ProdutoTestar {
    public static void main(String[] args){
        //construtor padrão
        Produto p1 = new Produto();
        p1.nome = "Caneta Preta";
        p1.marca = "Bic";
        p1.valor = 1.50f;

        //construtor de dois parâmetros
        Produto p2 = new Produto("Caneta Vermelha", "Faber");

        //construtor de três parâmetros
        Produto p3 = new Produto("Borracha", "Marcur", 1.89f);

        //obejto 01
        System.out.println("Nome: " + p1.nome + " Marca: " + p1.marca + " Valor: " + p1.valor);

    }
}
