package graphs;

import java.util.ArrayList;

public class Flow {
	private Graph graph;
	private Vertex source;
	private Vertex destination;
	private ArrayList<Label> label;
	private ArrayList<Integer> fi; 
	public Flow(Graph graph) {
		this.graph = graph;
		this.label = new ArrayList();
		this.fi = new ArrayList();
	}

	public void solve(Vertex source, Vertex destination) {
		// TODO Auto-generated method stub
		this.source = source;
		this.destination = destination;
		Vertex currentVertex = source;
		Label label = new Label(9999, null);
		label.setSource(source);
		source.setVisited(true);
		this.label.add(label);
		Boolean repeat = true;
		while (repeat) {
			Vertex pathVertex = maxEdge(currentVertex);
			//Esta parte del codido solo busca las rutas de irrupcion
			if (pathVertex != null) {
				Edges edge = currentVertex.getEdgeFrom(pathVertex);
				Label lab = new Label(edge.getWeight1(), currentVertex);
				lab.setSource(pathVertex);
				this.label.add(lab);
				currentVertex = pathVertex;
				currentVertex.setVisited(true);
			} else {
				Label lastlabel = this.label.get(this.label.size() - 1);
				currentVertex = lastlabel.getParent();
				this.label.remove(lastlabel);
				if (currentVertex ==  null) {
					//No se encontraron rutas posible para llegar al destino;
					repeat = false;
				}
			}
			//Encontrar la red remanente
			if (pathVertex != null && pathVertex.equals(this.destination)) {
				Label minlab = getMinumisLabel();
				this.fi.add(minlab.getWeigth());
				for (Integer i = this.label.size() -1; i > 0 ; i--) {
					Label itemlabel = this.label.get(i);
					Edges  edge = itemlabel.getParent().getEdgeFrom(itemlabel.getSource());
					edge.setWeight1(edge.getWeight1() - minlab.getWeigth());
					edge.setWeight2(edge.getWeight2() + minlab.getWeigth());
				}
				//Inicializamos todo para una nueva iteración
				this.label = new ArrayList();
				/*
				 * Setear que todos los vertices se pueden visitar
				 * */
				for (Vertex v: this.graph.getVertesList()) {
					v.setVisited(false);
				}
				Label nlabel = new Label(9999, null);
				nlabel.setSource(this.source);
				this.source.setVisited(true);
				this.label.add(nlabel);
				currentVertex = this.source;
			}
		}
		System.out.println("TERMINO EL WHILE");
		for (Integer f : this.fi) {
			System.out.println(f);
		}
	}
	private Label getMinumisLabel() {
		Integer minimus = 9999;
		Label lab = null;
		for (Label l: this.label) {
			if (l.getWeigth() < minimus) {
				minimus = l.getWeigth();
				lab = l;
			}
		}
		
		return lab;
	}
	private Vertex maxEdge(Vertex source) {
		Integer bigEdge = 0;
		Vertex findVertex = null;
		for(Edges edge : source.getEdgesList()) {
			if (bigEdge < edge.getWeight1() && edge.getDestination().getVisited() == false) {
				bigEdge = edge.getWeight1();
				findVertex = edge.getDestination();
			}
		}
		return findVertex;
	}
}
