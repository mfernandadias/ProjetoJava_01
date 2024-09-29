package livroEstruturaDeDados.directedGraph;

import java.util.Stack;

import static com.sun.beans.introspect.ClassInfo.clear;

public class Graph {
    private int maxVertexSize; //tamanho bidimensional da matriz
    private int size; //tamanho do vértice
    private Vertex[] vertexs;
    private int[][] adjacencyMatrix;

    private Stack<Integer> stack; //salva vértice atuais

    public Graph(int maxVertexSize){
        this.maxVertexSize = maxVertexSize;
        vertexs = new Vertex[maxVertexSize];

        adjacencyMatrix = new int[maxVertexSize][maxVertexSize];

        stack = new Stack<>();
    }

    public void addVertex(String data){
        Vertex vertex = new Vertex(data, false);
        vertexs[size] = vertex;
        size++;
    }

    //adiciona arestas adjacentes
    public void addEdge(int froms, int to){
        //A -> B e B -> A são diferentes
        adjacencyMatrix[froms][to] = 1;
    }

    public int[][] getAdjacencyMatrix(){
        return adjacencyMatrix;
    }

    public Vertex[] getVertexs(){
        return vertexs;
    }

    public void depthFirsSearch(){
        //comece a pesquisar a partir do primeiro vértice
        Vertex firstVertex = vertexs[0];
        firstVertex.setVisited(true);
        System.out.println(firstVertex.getData());
        stack.push(0);

        while(!stack.isEmpty()){
            int row = stack.peek();
            //obter posições de vértice edjacentes que não foram visitadas
            int col = findAdjacencyUnVisitedVertex(row);
            if(col == -1){
                stack.pop();
            }else{
                vertexs[col].setVisited(true);
                System.out.println("->"+vertexs[col].getData());
                stack.push(col);
            }
        }

        clear();
    }

    //obter posições de vértice adjacentes que não foram visitantes
    public int findAdjacencyUnVisitedVertex(int row) {
        for (int col = 0; col < size; col++) {
            if (adjacencyMatrix[row][col] == 1 && !vertexs[col].isVisited()) {
                return col;
            }
        }
        return -1;
    }
        public void clear(){
            for(int i = 0; i < size; i++){
                vertexs[i].setVisited(false);
            }
        }

}
