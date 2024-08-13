package prova.pooestudando.carro;

public class TesteCarro {
    public static void  main(String[] args){
        Carro carro = new Carro("Toyota", "Corolla", 2020, 80.0);

        //acelerando e freando o carro
        carro.acelerar();

        carro.estadoAtual();

    }
}
