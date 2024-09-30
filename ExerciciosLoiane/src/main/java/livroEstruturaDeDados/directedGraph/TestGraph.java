package livroEstruturaDeDados.directedGraph;

public class TestGraph {
    public static void printGraph(Graph graph) {
        for (int i = 0; i < graph.getVertexs().length; i++) {
            System.out.println(graph.getVertexs()[i].getData() + " ");
        }
        System.out.println("\n");

        for (int i = 0; i < graph.getAdjacencyMatrix().length; i++) {
            System.out.println(graph.getVertexs()[i].getData() + " ");
            for (int j = 0; i < graph.getAdjacencyMatrix().length; j++) {
                System.out.println(graph.getAdjacencyMatrix()[i][j] + " ");
            }
            System.out.println();
        }
    }
        public static void main(String[] args){
            Graph graph = new Graph(5);

            graph.addVertex("A");
            graph.addVertex("B");
            graph.addVertex("C");
            graph.addVertex("D");
            graph.addVertex("E");

            graph.addEdge(0, 1);
            graph.addEdge(0, 2);
            graph.addEdge(0, 3);
            graph.addEdge(1, 2);
            graph.addEdge(1, 3);
            graph.addEdge(2, 3);
            graph.addEdge(3, 4);
            printGraph(graph);

            graph.depthFirsSearch();


        }

}
