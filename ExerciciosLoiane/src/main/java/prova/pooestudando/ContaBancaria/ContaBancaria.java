package prova.pooestudando.ContaBancaria;
import java.util.Scanner;

public class ContaBancaria {

        /*
        Conta Bancária - Elabore uma classe ContaBancaria com os seguintes atributos

        -nomeCliente
        -numConta
        -saldo

        e os seguintes métodos

        sacar (o saldo não pode ficar negativo)
        depositar
        crie também duas subclasse chamadas ContaPoupansa e ContaEspecial, com as seguintes características:

        ContaPoupança

        atributo diaRendimento
        método calcularNovoSaldo, recebe taxa de rendimento da poupaça e atuliza o saldo.
        ContaEspecial

        atributo limite
        sobreescreva o método sacar com a nova lógica necessária.
        Crie uma classe Teste que contenha a seguinte lógica:

        Criar contas
        Sacar um valor das contas
        Depositar
        Mostrar um novo salvo a partir de um rendimento
        Mostrar so dados Conta do Cliente
         */

        //atributos
        String nomeCliente;
        String numConta;
        double saldo;

        public ContaBancaria (String nomeCliente, String numConta, double saldo){
            this.nomeCliente = nomeCliente;
            this.numConta = numConta;
            this.saldo = saldo;
        }

        //métodos get


    public String nomeCliente() {
        return nomeCliente;
    }

    public String numConta() {
        return numConta;
    }

    public double saldo() {
        return saldo;
    }

    //métodos set
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    //método sacar
    public void sacar(double valor){
            if(saldo >= valor){
                saldo -= valor;
                System.out.println("Saque realizado com sucesso. Novo saldo " + saldo);
            } else {
                System.out.println("Saldo insuficiente para saque.");
              }
    }

    public  void depositar(double valor){
            saldo += valor;
            System.out.println("Depósito realizado com sucesso. Novo saldo: " + saldo);
    }
    public void mostrarDados(){
            System.out.println("Nome do Cliente: " + nomeCliente);
            System.out.println("Saldo:  + saldo");
    }
}
