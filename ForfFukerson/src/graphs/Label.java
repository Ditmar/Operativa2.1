package graphs;

public class Label {
	private Integer weigth;
	private Vertex parent;
	private Vertex source;
	public Label(Integer weigth, Vertex parent) {
		this.weigth = weigth; 
		this.parent  = parent;
	}
	public Integer getWeigth() {
		return weigth;
	}
	public void setWeigth(Integer weigth) {
		this.weigth = weigth;
	}
	public Vertex getParent() {
		return parent;
	}
	public void setParent(Vertex parent) {
		this.parent = parent;
	}
	public Vertex getSource() {
		return source;
	}
	public void setSource(Vertex source) {
		this.source = source;
	}
	
}
