package graphs;

public class Edges {
	private Integer weight;
	private Vertex source;
	private Vertex destination;
	private Boolean direction;
	public Edges() {}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
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
