package org.fsk.algorithms.graphtheory.graphweighted;

public class Edge {

    int dest;
    int weight;

    public Edge(int dest, int weight) {
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "(" + dest + ", weight: " + weight + ")";
    }
}
