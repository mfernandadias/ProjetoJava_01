package aula24.pacoteCarro;
import java.util.Scanner;

public class TesteCarro {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();

    }
}
