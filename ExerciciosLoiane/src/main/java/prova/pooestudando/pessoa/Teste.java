package prova.pooestudando.pessoa;

public class Teste {
   public static void main(String[] args){
       Pessoa pessoa = new Pessoa("Maria Fernanda", 23, 64.0);
       Pessoa pessoa1 = new Pessoa("Maria Eduarda", 22, 63);

       //imprmir a descrição
       pessoa.imprimirDescricaocompleto();
       pessoa1.imprimirDescricaocompleto();


       System.out.println("");
       //manupulando os atributos das instâncias
       pessoa1.setNome("Carlos");
       pessoa1.setIdade(25);
       pessoa1.setPeso(80);


       System.out.println("");
       //exibindo informações das pessoas
       pessoa1.imprimirDescricaocompleto();


   }
}
