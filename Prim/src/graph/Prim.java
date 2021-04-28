package graph;

import java.util.ArrayList;

public class Prim {
	private Integer [][] matrix;
	private ArrayList<Integer> newList;
	private ArrayList<Integer> oldList;
	private Integer[][] tree;
	public Prim(Integer[][] matrix) {
		this.matrix = matrix;
		this.newList= new ArrayList<>();
		this.oldList = new ArrayList<>();
		this.tree = new Integer[this.matrix.length][this.matrix.length];
		
	}
	public void solve() {
		//step 0
		for (Integer i = 0; i < this.matrix.length; i++) {
			this.oldList.add(i);
		}
		for (Integer i = 0; i < tree.length; i++) {
			for (Integer j = 0; j < tree.length; j++) {
				this.tree[i][j] = 0;
			}
		}
		//step 1
		Integer j = this.oldList.get(0);
		this.newList.add(j);
		this.oldList.remove(j);
		//paso general K
		while (!this.oldList.isEmpty()) {
			Integer VertexshortPath = searchShortPath();
			this.newList.add(VertexshortPath);
			this.oldList.remove(VertexshortPath);
		}
	}
	public Integer[][] getTree() {
		return this.tree;
	}
	private Integer searchShortPath() {
		Integer min = 9999;
		Integer result = -1;
		Integer INDEX = -1;
		for (Integer i = 0; i < this.newList.size(); i++) {
			for (Integer j = 0; j < this.oldList.size(); j++) {
				Integer value = this.matrix[this.newList.get(i)][this.oldList.get(j)];
				if (value != 0) {
					if (value < min) {
						min = value;
						result =  this.oldList.get(j);
						INDEX = this.newList.get(i);
					}
				}
			}
		}
		this.tree[INDEX][result] = min;
		this.tree[result][INDEX] = min;
		return result;
	}
}
