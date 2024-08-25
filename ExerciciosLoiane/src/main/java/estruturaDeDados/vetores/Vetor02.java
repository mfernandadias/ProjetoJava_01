package estruturaDeDados.vetores;

public class Vetor02 {
    private String[] elementos;

    public Vetor02(int capacidade){
        this.elementos = new String[capacidade];
    }

    public void adiciona(String elemento){
        for(int i = 0; i<this.elementos.length; i++){
            //
            if(this.elementos[i] == null){
                this.elementos[i] = elemento;
                //parar o código na primeira posição que el eencontrar null
                break;
            }
        }
    }
}
