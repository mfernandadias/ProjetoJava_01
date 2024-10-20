package livroJavaIniciantes.capitulo7;

import livroJavaIniciantes.TwoD;

public class TwoDShape {
    private double width;
    private double heigth;
    private String name;

    //contrutor padrão
    TwoDShape(){
        width = heigth = 0.0;
        name = "none";
    }

    //construtor parametrizado
    TwoDShape(double w, double h, String n){
        width = w;
        heigth = h;
        name = n;
    }

    //constrói objeto com largura e altura iguais
    TwoDShape(double x, String n){
        width = heigth = x;
        name = n;
    }

    //constroi um objeto a partrir de outro
    TwoDShape (TwoDShape ob){
        width = ob.width;
        heigth = ob.heigth;
        name = ob.name;
    }

    //método acessa
}