package Graph.AddEdge;

import java.util.ArrayList;
import java.util.HashMap;


public class Graph {

    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public HashMap<String, ArrayList<String>> getAdjList() {
        return adjList;
    }

    public void printGraph() {
        System.out.println(adjList);
    }

    public boolean addVertex(String vertex) {
        if (adjList.get(vertex) == null) {
            adjList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }

	public boolean addEdge(String v1, String v2) {
        if (adjList.containsKey(v1) && adjList.containsKey(v2)) {
            adjList.get(v1).add(v2);
            adjList.get(v2).add(v1);
            return true;
        }
        else return false;
    }

}