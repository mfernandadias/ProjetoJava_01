package prova.pooestudando.carro;

public class Carro {
    /*
    Exercício 2**: Desenvolva uma classe Carro com atributos como marca, modelo, e ano.
    Inclua métodos para acelerar, frear e mostrar o estado atual do carro.
    quero em java
     */

    String marca;
    String modelo;
    int ano;
    double velocidade;

    public Carro(String marca, String modelo, int ano, double velocidade ){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String marca() {
        return marca;
    }

    public String modelo() {
        return modelo;
    }

    public int ano() {
        return ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    //métodos para acelerar o carro
    public void acelerar(){
        velocidade += 40;
        System.out.println("O carro acelerou. Velocidade atual: " + velocidade + " km/h");
    }

    public void freiar(){
        if(velocidade >= 20){
            velocidade -= 20;
        } else {
            velocidade = 0;
        }
        System.out.println("O carro freou. Velocidade atual: " + velocidade + " km/h");
    }

    //método para mostrar o estado atual do carro
    public void estadoAtual(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }
}
