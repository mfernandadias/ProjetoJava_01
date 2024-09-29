package livroEstruturaDeDados.directedGraph;

public class Vertex {

    //atributos
    private String data;
    private boolean visited; //você visitou

    public Vertex(){
        super();
    }

    public Vertex(String data, boolean visited){
        this.data = data;
        this.visited = visited;
    }

    public String getData(){
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean getVisited() {
        return visited;
    }

    public boolean isVisited(){
        return visited;
    }

    public boolean setVisited(boolean visited) {
        return visited;
    }


}
