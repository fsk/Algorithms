package org.fsk.algorithms.graphtheory.graphunweighted;

public class Main1 {

    public static void main(String[] args) {

        Graph1<String> graph1 = new Graph1<>();

        graph1.addEdge("A", "B", true);
        graph1.addEdge("A", "E", true);
        graph1.addEdge("B", "C", true);
        graph1.addEdge("B", "E", true);
        graph1.addEdge("C", "D", true);
        graph1.addEdge("D", "E", true);
        //graph1.addEdge("E", "B", true);

        graph1.printGraph();



    }



}
