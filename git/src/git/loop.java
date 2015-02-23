package git;

public class loop {
	
	public static void main(String args[]){
		
		int j=9;
	out:	if(true){
			//for(int j=1;j<=10;j++){
				if(j==5){
					continue out;
				}
				System.out.println(j);
			//}
		}
	}

}
