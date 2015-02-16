package oops;

public class exibition {
	String exName;
	String location;
	String authorName;
	String authorAdd;
	public exibition(String exName, String location, String authorName,
			String authorAdd) {
		super();
		this.exName = exName;
		this.location = location;
		this.authorName = authorName;
		this.authorAdd = authorAdd;
	}
	@Override
	public String toString() {
		return "exibition [exName=" + exName + ", location=" + location
				+ ", authorName=" + authorName + ", authorAdd=" + authorAdd
				+ "]";
	}
	

}
