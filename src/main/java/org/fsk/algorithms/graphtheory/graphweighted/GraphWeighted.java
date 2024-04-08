package org.fsk.algorithms.graphtheory.graphweighted;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphWeighted {

    private Map<Integer, List<Edge>> adjList;

    public GraphWeighted() {
        adjList = new HashMap<>();
    }

    public void addEdge(int source, int dest,
                        int weight, boolean bidirectional) {

        adjList.putIfAbsent(source, new ArrayList<>());
        adjList.get(source).add(new Edge(dest, weight));

        if (bidirectional) {
            adjList.putIfAbsent(dest, new ArrayList<>());
            adjList.get(dest).add(new Edge(source, weight));
        }

    }

    public void printGraph() {
        for (int vertex : adjList.keySet()) {
            System.out.println("Vertex : " + vertex + " Neighbors and weights: " + adjList.get(vertex));
        }
    }
}
