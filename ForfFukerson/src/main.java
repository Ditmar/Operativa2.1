import java.util.ArrayList;

import graphs.Edges;
import graphs.Flow;
import graphs.Graph;
import graphs.Vertex;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vertex v1 = new Vertex("V1");
 		Vertex v2 = new Vertex("V2");
 		Vertex v3 = new Vertex("V3");
 		Vertex v4 = new Vertex("V4");
 		Vertex v5 = new Vertex("V5");
 		v1.connect(v2, 10);
 		v1.connect(v3,  7);
 		v2.connect(v1, 5);
 		v2.connect(v5, 5);
 		v2.connect(v4, 3);
 		v3.connect(v5, 2);
 		v3.connect(v2, 8);
 		v4.connect(v5, 6);
 		v4.connect(v3, 6);
 		ArrayList<Vertex> listvertex = new ArrayList();
 		listvertex.add(v1);
 		listvertex.add(v2);
 		listvertex.add(v3);
 		listvertex.add(v4);
 		listvertex.add(v5);
 		Graph graph = new Graph();
 		graph.setVertesList(listvertex);
 		ArrayList<Edges> listedges = new ArrayList();
 		listvertex.forEach((item ) -> {
 			item.getEdgesList().forEach((Edges edges) -> {
 				listedges.add(edges);
 			});
 		});
 		graph.setEdgesList(listedges);
 		Flow flow = new Flow(graph);
 		flow.solve(v1, v5);
	}

}
