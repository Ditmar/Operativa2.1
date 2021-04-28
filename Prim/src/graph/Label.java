package graph;

public class Label {
	private Integer weight;
	private Integer parent;
	private Boolean state;
	private Integer index;
	public Label (Integer weight, Integer parent, Integer index ,Boolean state) {
		this.weight = weight;
		this.parent = parent;
		this.state = state;
		this.index = index;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Integer getParent() {
		return parent;
	}
	public void setParent(Integer parent) {
		this.parent = parent;
	}
	public Boolean getState() {
		return state;
	}
	public void setState(Boolean state) {
		this.state = state;
	}
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	
	
}
