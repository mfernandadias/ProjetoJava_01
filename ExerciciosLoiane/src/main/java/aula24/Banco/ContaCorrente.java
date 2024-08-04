package aula24.Banco;
/*
Cria uma classe para representar uma conta corrente que possui um número, um saldo, um status que informa
se ela é especial ou não, um limite. Desenvolva métodos para realizar saque(verificando se o cliente
pode realizar saques), depositar dinheiro, consultar saldo everificar se o cliente está usando cheque espeical
ou não. Desenvolva um programa para testa essa classe.
 */

public class ContaCorrente{
    private String nome;
    private int id;
    private boolean contaEspecial;
    private double limite;
    private double saldo;

    public ContaCorrente(String nome, int id, double saldo, boolean contaEspecial, double limite){
        this.nome = nome;
        this.id = id;
        this.contaEspecial = contaEspecial;
        this.limite = limite;
        this.saldo = saldo;
    }

    //método para realizar saque
    public boolean sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        } else if(contaEspecial && valor <= saldo + limite){
            saldo -= valor;
            return true;
        } else{
            return false;
        }
    }

    //método para depositar dinheiro
    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
        }
    }

    //método para consultar saldo
    public double consultarSaldo(){
        return saldo;
    }
    //método para verificar se está usando cheque especial
    public boolean usandoChequeEspecial(){
        return saldo < 0;
    }

    //getter e setter (opcional)
    public String getnome(){
        return nome;
    }

    public double saldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double limite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean contaEspecial() {
        return contaEspecial;
    }

    public void setContaEspecial(boolean contaEspecial) {
        this.contaEspecial = contaEspecial;
    }

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String nome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}