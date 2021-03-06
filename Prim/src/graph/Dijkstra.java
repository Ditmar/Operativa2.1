package graph;

import java.util.ArrayList;

public class Dijkstra {
	private Integer[][] matrix;
	private ArrayList<Label> labelList;
	public Dijkstra(Integer[][] matrix) {
		//Init values of dijkstra
		this.matrix = matrix;
		labelList = new ArrayList<Label>();
		for (int i = 0; i < this.matrix.length; i++) {
			Label label = new Label(-1,-1, i, false);
			this.labelList.add(label);
		}
	}
	public Integer[][] getMatrix() {
		return matrix;
	}
	public void setMatrix(Integer[][] matrix) {
		this.matrix = matrix;
	}
	public ArrayList<Label> getLabelList() {
		return labelList;
	}
	public void setLabelList(ArrayList<Label> labelList) {
		this.labelList = labelList;
	}
	public void solve(Integer source) {
		//Set source label into labelList
		Label sourceLabel = this.labelList.get(0);
		sourceLabel.setParent(-1);
		sourceLabel.setState(true);
		sourceLabel.setWeight(0);
		/*for (Label label : this.labelList) {
			System.out.println("[" + label.getWeight() + ", "+ label.getParent() +"]" + "Index " + label.getIndex() );
		}*/
		while (!allLabelisPermanet()) {
			for (Integer j = 0; j < this.matrix.length; j++) {
				Integer weigth = this.matrix[sourceLabel.getIndex()][j];
				if (weigth > 0) {
					Label auxLabel = this.labelList.get(j);
					if (auxLabel.getState() == false) {
						if (auxLabel.getWeight() == -1) {
							auxLabel.setWeight(sourceLabel.getWeight() + weigth);
							auxLabel.setParent(sourceLabel.getIndex());
						} else if (sourceLabel.getWeight() + weigth < auxLabel.getWeight()) {
							auxLabel.setWeight(sourceLabel.getWeight() + weigth);
							auxLabel.setParent(sourceLabel.getIndex());
						}
					}
				}
			}
			//Busqueda de la etique mas peque?a
			Integer min = 99999;
			Integer index = -1;
			for (Integer i = 0; i < this.labelList.size(); i++) {
				if (this.labelList.get(i).getState() == false) {
					if (this.labelList.get(i).getWeight() != -1 && this.labelList.get(i).getWeight() < min) {
						min = this.labelList.get(i).getWeight();
						index = i;
					}
				}
			}
			sourceLabel = this.labelList.get(index);
			sourceLabel.setState(true);
		}
		
	}
	private Boolean allLabelisPermanet() {
		for (Label label : this.labelList) {
			if (label.getState() == false) {
				return false;
			}
		}
		return true;
	}
	
}
