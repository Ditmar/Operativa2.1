package graphs;

import java.util.ArrayList;

public class Vertex {
	private String label;
	private ArrayList<Vertex> vertexList;
	private ArrayList<Edges> edgesList;
	public Vertex(String label) {
		vertexList = new ArrayList<>();
		edgesList = new ArrayList<>();
		this.label = label;
	}
	public void connect(Vertex destination, Integer weight) {
		vertexList.add(destination);
		Edges edge = new Edges();
		edge.setSource(this);
		edge.setDestination(destination);
		edge.setWeight(weight);
		edgesList.add(edge);
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public ArrayList<Vertex> getVertexList() {
		return vertexList;
	}
	public void setVertexList(ArrayList<Vertex> vertexList) {
		this.vertexList = vertexList;
	}
	public ArrayList<Edges> getEdgesList() {
		return edgesList;
	}
	public void setEdgesList(ArrayList<Edges> edgesList) {
		this.edgesList = edgesList;
	}
	
}
