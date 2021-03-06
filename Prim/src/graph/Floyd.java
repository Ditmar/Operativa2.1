package graph;

public class Floyd {
	private Integer[][] matrix;
	private Integer [][] path;
	public Floyd (Integer[][] matrix) {
		this.matrix = matrix;
		this.path = new Integer[this.matrix.length][this.matrix.length];
		// init valores de path;
		for (Integer i = 0; i < this.matrix.length; i++) {
			for (Integer j = 0; j < this.matrix.length; j++) {
				this.path[j][i] = i;
			}
		}
		for (Integer i = 0; i < this.matrix.length; i++) {
			for (Integer j = 0; j < this.matrix.length; j++) {
				if (this.matrix[i][j] == 0) {
					this.matrix[i][j] = 9999;	
				}
			}
		}
	}
	public Integer[][] getPath() {
		return this.path;
	}
	public Integer[][] getMatrix() {
		return this.matrix;
	}
	public void solve () {
		for (Integer k = 0; k < this.matrix.length; k++ ) {
			for (Integer i = 0; i < this.matrix.length; i++) {
				for (Integer j = 0; j < this.matrix.length; j++) {
					Integer total = this.matrix[i][k] + this.matrix[k][j];
					if (total < this.matrix[i][j]) {
						this.matrix[i][j] = total;
						this.path[i][j] = k;
					}
				}
			}
		}
	}
}
