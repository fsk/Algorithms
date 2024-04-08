package org.fsk.algorithms.graphtheory.graphwithclass;

import java.util.ArrayList;
import java.util.List;

class Edge {
    Node target;
    int weight;

    public Edge(Node target, int weight) {
        this.target = target;
        this.weight = weight;
    }
}

class Node {
    int value;
    List<Edge> edges;

    public Node(int value) {
        this.value = value;
        this.edges = new ArrayList<>();
    }

    public void addEdge(Node target, int weight) {
        edges.add(new Edge(target, weight));
    }

}

class Graph {

    List<Node> nodes;

    public Graph() {
        nodes = new ArrayList<>();
    }

    public Node addNode(int value) {

        Node node = new Node(value);
        nodes.add(node);
        return node;
    }

    public void printGraph() {
        for (Node node : nodes) {
            System.out.println("Node : " + node.value + " neighbors : " );
            for (Edge edge : node.edges) {
                System.out.println("(" + edge.target.value + " , weight: " + edge.weight + ")");
            }
        }
        System.out.println();
    }
}

public class Main1 {


    public static void main(String[] args) {

        Graph graph = new Graph();

        //Vertexleri ekledik
        Node node0 = graph.addNode(0);
        Node node1 = graph.addNode(1);
        Node node2 = graph.addNode(2);
        Node node3 = graph.addNode(3);
        Node node4 = graph.addNode(4);

        //Kenarlari ekledik.
        node0.addEdge(node1, 5);
        node0.addEdge(node4, 9);
        node1.addEdge(node2, 3);
        node1.addEdge(node3, 4);
        node1.addEdge(node4, 2);
        node2.addEdge(node3, 1);
        node3.addEdge(node4, 7);

        graph.printGraph();


    }



}
