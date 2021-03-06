import java.util.ArrayList;

import graph.Dijkstra;
import graph.Floyd;
import graph.Label;
import graph.Prim;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[][] matrix =  {
		//	 0  1  2  3  4  5  6  7   8
			{0, 3, 7, 0, 0, 0, 0, 8, 0}, 
			{3, 0, 0, 0, 0, 7, 0, 0, 1}, 
			{7, 0, 0, 5, 0, 0, 0, 8, 6}, 
			{0, 0, 5, 0, 4, 0, 0, 0, 0}, 
			{0, 0, 0, 4, 0, 45, 4, 0, 0}, 
			{0, 7, 0, 0, 45, 0, 0, 0, 8}, 
			{0, 0, 0, 0, 4, 0, 0, 20, 0}, 
			{8, 0, 8, 0, 0, 0, 20, 0, 0}, 
			{0, 1, 6, 0, 0, 8, 0, 0, 0}, 
			};
		Floyd floyd = new Floyd(matrix);
		floyd.solve();
		Integer[][] path = floyd.getPath();
		Integer[][] result = floyd.getMatrix();
		
		for (Integer i = 0; i < path.length; i++) {
			for (Integer j = 0; j < path.length; j++) {
				//tree[i][j] = 0;
				System.out.print(result[i][j] + ",");
			}
			System.out.println();
		}
		System.out.println("------------------------RUTAS ------------------");
		for (Integer i = 0; i < path.length; i++) {
			for (Integer j = 0; j < path.length; j++) {
				//tree[i][j] = 0;
				System.out.print(path[i][j] + ",");
			}
			System.out.println();
		}
		/*Dijkstra dijkstra = new Dijkstra(matrix);
		dijkstra.solve(0);
		ArrayList<Label> results = dijkstra.getLabelList();
		for (Label label : results) {
			System.out.println("[" + label.getWeight() + ", "+ label.getParent() +"]" + "Index " + label.getIndex() );
		}*/
		/*Prim prim = new Prim(matrix);
		prim.solve();
		Integer[][] tree = prim.getTree();
		for (Integer i = 0; i < tree.length; i++) {
			for (Integer j = 0; j < tree.length; j++) {
				//tree[i][j] = 0;
				System.out.print(tree[i][j] + ",");
			}
			System.out.println();
		}*/
	}

}
