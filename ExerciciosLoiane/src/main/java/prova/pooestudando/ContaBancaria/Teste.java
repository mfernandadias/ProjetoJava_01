package prova.pooestudando.ContaBancaria;



public class Teste {
    public static void main(String[] args){
        //criando contas
        ContaBancaria conta1 = new ContaBancaria("João Silva", "124578-5", 1000.0 );
        ContaPoupanca conta2 = new ContaPoupanca("Maria Oliveira", "98765-4", 1500.0, 15);
        ContaEspecial conta3 = new ContaEspecial("Carlos Pereira", "54321-0", 500.0, 1000.0);

        //sacando valores
        conta1.sacar(200.0);
        conta2.sacar(1600.0); //não deve permitir
        conta3.sacar(1200.0); //deve permitir usando o limite

        System.out.println("");

        //depositando valores
        conta1.depositar(200.0);
        conta2.depositar(500.0);
        conta3.depositar(100.0);

        System.out.println("");

        //calculando novo saldo com rendimento
        conta2.calcularNovoSaldo(5.0); //taxa de rendimento de 5%

        System.out.println("");

        //mostrando dados das contas
        conta1.mostrarDados();
        conta2.mostrarDados();
        conta3.mostrarDados();

        System.out.println("");
    }
}
