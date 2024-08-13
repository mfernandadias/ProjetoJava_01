package prova.pooestudando.ContaBancaria;

public class ContaEspecial extends ContaBancaria {

    private double limite;
    public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        //super.sacar(valor);
        if(saldo + limite >= valor){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente e limite excedido para saque");
        }
    }
}
