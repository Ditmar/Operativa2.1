package graphs;

public class Edges {
	private Integer weight1;
	private Integer weight2;
	private Vertex source;
	private Vertex destination;
	private Boolean direction;
	public Edges() {}
	public Integer getWeight1() {
		return weight1;
	}
	public Integer getWeight2() {
		return weight2;
	}
	public void setWeight2(Integer weight2) {
		this.weight2 = weight2;
	}
	public void setWeight1(Integer weight) {
		this.weight1 = weight;
	}
	public Vertex getSource() {
		return source;
	}
	public void setSource(Vertex source) {
		this.source = source;
	}
	public Vertex getDestination() {
		return destination;
	}
	public void setDestination(Vertex destination) {
		this.destination = destination;
	}
	public Boolean getDirection() {
		return direction;
	}
	public void setDirection(Boolean direction) {
		this.direction = direction;
	}
	
}
