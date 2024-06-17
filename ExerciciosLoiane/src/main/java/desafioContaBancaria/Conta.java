package desafioContaBancaria;

public class Conta implements Iconta {
    private static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }
    public void sacar(double valor){
        saldo -= valor;
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);

    }
    public int getAgencia(){
        return agencia;
    }
    public int getNumero(){
        return numero;
    }
}

/*
qual é a difeença entre modificadores public, default, protected e private ?
 */
