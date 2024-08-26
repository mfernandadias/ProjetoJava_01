package estruturaDeDados.vetor;

import java.util.Arrays;

public class Vetor02 {
    private String[] elementos;
    private int tamanho;

    public Vetor02(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    //algoritmo que realiza o processo, entretanto não é eficiente
    /*public void adiciona(String elemento){
        for(int i = 0; i<this.elementos.length; i++){
            //
            if(this.elementos[i] == null){
                this.elementos[i] = elemento;
                //parar o código na primeira posição que el eencontrar null
                break;
            }
        }
    } */

     //SEGUNDA OPÇÃO: adicionar vetor
    /*public void adiciona(String elementos) throws Exception{
       if(this.elementos < this.elementos.length){
           this.tamanho++;
       } else{
           throw new Exception("Vetor já está cheio, não é possível adicionar elementos");
       }
    }*/

    public boolean adiciona(String elemento){
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    //aula 07 - Adicionar elementos em qualquer posição do veto
    //0 1 2 3 4 5 6 = tamanho é 5
    //B C E F G + +
    public boolean adiciona(int posicao, String elemento){
        //verificar se a posição é valida ou não
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posicao Inválida");
        }

        this.aumentaCapacidade();

        //mover todos os elementos
        for(int i = this.tamanho-1; i>= posicao; i--){
            this.elementos[i] = this.elementos[i];
        }

        this.elementos[posicao]  = elemento;
        this.tamanho++;
        return false;
    }

    //adicionar a capacidade do vetor
    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            String[] elementosNovos = new String[this.elementos.length*2];
            for(int i = 0; i <this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public String busca(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posicao Inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(String elemento){
        for(int i = 0; i < this.tamanho; i++){
            if(elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }
    public int tamanho(){
        return this.tamanho;
    }

    // B G D F E H -> posicao a ser removido é 1 (G)
    // 0 1 2 3 4 5 -> tamanho é 5
    //vetor[1] = vetor [2]
    //vetor[2] = [3]
    //vetor[3] = [4]
    public void remove(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("POSicao inválida");
        }
        for(int i = posicao; i<this.tamanho-1; i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }



    @Override
    public String toString(){

        StringBuilder s = new StringBuilder();
        s.append("[");

       for(int i = 0; i < this.tamanho-1; i++){
          s.append(this.elementos[i]);
          s.append(", ");
       }
       if(this.tamanho>0){
           s.append(this.elementos[this.tamanho-1]);
       }
       s.append("]");

       return s.toString();
    }
}
