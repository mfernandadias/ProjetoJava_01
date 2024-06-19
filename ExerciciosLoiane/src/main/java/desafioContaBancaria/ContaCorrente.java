package desafioContaBancaria;


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }



/*
Desafio de projeto
* use todo seu conhecimento para estender o domínio, incluindo novas classes, atributor e/ou métodos;
 */
