package estruturaDeDados.vetores;

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

    public int tamanho(){
        return this.tamanho;
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
