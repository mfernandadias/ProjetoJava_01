package prova.pooestudando.ContaBancaria;

public class ContaPoupanca extends ContaBancaria{
    private int diaRendimento;

    public ContaPoupanca(String nomeCliente, String numConta, double saldo, int diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(double taxaRendimento){
        saldo += saldo * taxaRendimento / 100;
        System.out.println("NOvo saldo após rendimento: " + saldo);
    }
}
