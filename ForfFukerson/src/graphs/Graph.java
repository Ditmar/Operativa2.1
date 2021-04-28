package graphs;

import java.util.ArrayList;

public class Graph {
	private ArrayList<Vertex> vertesList;
	private ArrayList<Edges> edgesList;
	public Graph() {
		vertesList = new ArrayList();
		edgesList = new ArrayList();
	}
	public ArrayList<Vertex> getVertesList() {
		return vertesList;
	}
	public void setVertesList(ArrayList<Vertex> vertesList) {
		this.vertesList = vertesList;
	}
	public ArrayList<Edges> getEdgesList() {
		return edgesList;
	}
	public void setEdgesList(ArrayList<Edges> edgesList) {
		this.edgesList = edgesList;
	}
	
	
}
