package aula19;

public class AlunoTeste {
    public static void main(String[] args){
        //instanciando o obejto
        Aluno aluno1 = new Aluno();

        //declarando valores aos atributos
        aluno1.nome = "Alana Silva";
        aluno1.idade = 21;
        aluno1.curso = "Ciência da computação";

        //chamando os métodos:
        aluno1.assistirAula();
        aluno1.fazerProva();
        aluno1.calcularNota();
    }
}
