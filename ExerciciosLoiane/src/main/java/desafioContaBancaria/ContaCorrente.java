package desafioContaBancaria;

public class ContaCorrente  extends Conta {
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Corrente === ");
        System.out.println(String.format("Agencia: %", super.agencia));
        System.out.println(String.format("Numero: %", super.numero));
        System.out.println(String.format("Saldo: %", super.saldo));
    }

}
