package javaDadosEstruturasCaelumLivro.armazenamneto;

import java.util.Arrays;

public class Vetor {
    //declarando e inicializando um aray de aluno com pacacidade 100;
    private Aluno[] alunos = new Aluno[100];
    private int tamanho = 0;

    public void adiciona(Aluno aluno){
        //verifica se ainda há espaço no array
        if(tamanho <alunos.length){
            alunos[tamanho] = aluno;
            tamanho++;
        } else{
            //caso o array esteja cheio, poderia lançar uma exceção ou aumentar a capacidade
            throw new ArrayIndexOutOfBoundsException("Vetor cheio");
        }
    }

    public void adiciona(int posicao, Aluno aluno){
        //verifica se a posição é valida e se ainda há espaço no array
        if(posicao >= 0 && posicao <= tamanho && tamanho < alunos.length){
            //desloca os elementos para a direita para abrir espaço
            for(int i = tamanho; i > posicao; i--){
                alunos[i] = alunos[i - 1];
            }
            //alunos[posicao] = alunos;
            tamanho++;
        } else {
            throw new ArrayIndexOutOfBoundsException("Posição invalida ou vetor cheio");
        }
    }

    public Aluno pega(int posicao){
        //verifica se a posição é válida
        if(posicao >= 0 && posicao < tamanho){
            return alunos[posicao];
        } else {
            throw new ArrayIndexOutOfBoundsException("Posição inválida");
        }
    }

    public void remove(int posicao){
        //verifique se a posição é válida
        if(posicao >= 0 && posicao < tamanho){
            //desloca os elementos para a esquerda para preencher o espaço
            for(int i = posicao; i < tamanho - 1; i++){
                alunos[i] = alunos[i + 1];
            }
            //remove a referência ao último elemento
            alunos[tamanho - 1] = null;
            tamanho--;
        }else {
            throw new ArrayIndexOutOfBoundsException("Posição inválida");
        }
    }
    public boolean contem(Aluno aluno) {
        for (int i = 0; i < tamanho; i++) {
            if (alunos[i].equals(aluno)) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return tamanho;
    }

    public String toString() {
        // Retorna uma representação do array até o índice tamanho
        return Arrays.toString(Arrays.copyOfRange(alunos, 0, tamanho));
    }

}

