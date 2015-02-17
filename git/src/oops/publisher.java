package oops;

public class publisher {
	
	String name;
	String CopyRight;
	public publisher(String name, String copyRight) {
		super();
		this.name = name;
		CopyRight = copyRight;
	}
	@Override
	public String toString() {
		return "publisher [name=" + name + ", CopyRight=" + CopyRight + "]";
	}
	

}
