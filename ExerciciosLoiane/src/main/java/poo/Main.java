package poo;

public class Main {
    public static void main(String[] args){
        //criação de um objeto da classe calculadora
        Calculadora calc = new Calculadora();

        //chamando o método somar e armazenando o resultado
        int resultado = calc.somar(5, 3);
        System.out.println("REsultado da soma: " + resultado);

        //chamando o método imprimirMensagem
        calc.imprimirMensagem("OLá, Mundo");
    }

}
