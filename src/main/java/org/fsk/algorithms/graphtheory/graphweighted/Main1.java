package org.fsk.algorithms.graphtheory.graphweighted;

public class Main1 {

    public static void main(String[] args) {

        GraphWeighted graphWeighted = new GraphWeighted();

        graphWeighted.addEdge(0, 1, 5, true);
        graphWeighted.addEdge(0, 4, 9, true);
        graphWeighted.addEdge(1, 2, 3, true);
        graphWeighted.addEdge(1, 3, 4, true);
        graphWeighted.addEdge(2, 4, 2, true);
        graphWeighted.addEdge(3, 4, 1, true);

        graphWeighted.printGraph();


    }

}
