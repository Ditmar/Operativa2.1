import graphs.Vertex;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Matriz Adyacencia
		//                     0  1  2  3  4  5
		Integer[][] matrix = {{0, 4, 0, 0, 0, 6},
							  {0, 0, 1, 0, 7, 0}, 
							  {0, 1, 0, 2, 3, 0},
							  {0, 0, 2, 0, 5, 9},
							  {0, 7, 3, 5, 0, 8},
							  {0, 0, 0, 9, 8, 0}};
		//Matrix Incidencia
		//                      e1 e2 e3 e4 e5 e6 e7 e8 e9
 		Integer[][] matrix2 = {{4, 0, 0, 0, 0, 0, 0, 0, 6},
							   {4, 1, 7, 0, 0, 0, 0, 0, 0},
							   {0, 1, 0, 2, 0, 0, 0, 3, 0},
							   {0, 0, 0, 2, 9, 5, 0, 0, 0},
							   {0, 0, 7, 0, 0, 5, 8, 3, 0},
							   {0, 0, 0, 0, 9, 0, 8, 0, 6}};
		
 		Vertex v1 = new Vertex("V1");
 		Vertex v2 = new Vertex("V2");
 		Vertex v3 = new Vertex("V3");
 		Vertex v4 = new Vertex("V4");
 		Vertex v5 = new Vertex("V5");
 		Vertex v6 = new Vertex("V6");
 		v1.connect(v3, 2);
 		v1.connect(v5, 3);
 		v1.connect(v4, 10);
 		v1.connect(v2, 1);
 		v2.connect(v3, 4);
 		v2.connect(v4, 6);
 		v3.connect(v1, 2);
 		v3.connect(v2, 4);
 		v3.connect(v4, 1);
 		v4.connect(v2, 6);
 		v4.connect(v3, 1);
 		v4.connect(v5, 2);
 		v5.connect(v1, 3);
 		v5.connect(v4, 2);
 		
 		
 		
	}
}
