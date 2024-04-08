package org.fsk.algorithms.graphtheory.graphunweighted;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph1<T> {

    private Map<T, List<T>> adjList;

    public Graph1() {
        adjList = new HashMap<>();
    }

    public void addEdge(T source, T dest, boolean bidirectional) {

        adjList.putIfAbsent(source, new ArrayList<>());
        adjList.putIfAbsent(dest, new ArrayList<>());

        adjList.get(source).add(dest);

        if (bidirectional) {
            adjList.get(dest).add(source);
        }

    }

    public List<T> getNeighbors(T vertex) {
        return adjList.get(vertex);
    }

    public void printGraph() {
        for (T vertex : adjList.keySet()) {
            System.out.println("Vertex : " + vertex + " Neighbors : " + adjList.get(vertex));
        }
    }
}
