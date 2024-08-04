package aula24.Banco;


public class ContaTeste {
    public static void main(String[] args){
        //criação de uma conta corrente
        ContaCorrente conta = new ContaCorrente("João", 1234, 500.0, true, 1000.0);

        //depósito
        conta.depositar(200.0);
        System.out.println("Saldo após depósito: " + conta.consultarSaldo());

        //saque dentro do saldo
        if(conta.sacar(100.0)){
            System.out.println("saldo realizado com sucesso");
        } else {
            System.out.println("Saldo após saque: " + conta.consultarSaldo());
        }
        System.out.println("Saldo após sqque: " + conta.consultarSaldo());

        // Saque usando cheque especial
        if (conta.sacar(700.0)) {
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saque não permitido.");
        }
        System.out.println("Saldo após saque: " + conta.consultarSaldo());

        // Verificação de uso de cheque especial
        if (conta.usandoChequeEspecial()) {
            System.out.println("Cliente está usando cheque especial.");
        } else {
            System.out.println("Cliente não está usando cheque especial.");
        }
    }

}
