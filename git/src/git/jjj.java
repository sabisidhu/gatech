package git;

interface Param{
 	static final int length=10;
 	int breath=10;
 }
 //We used i,j here and x,y in the Rectangle class
 //that implements Area to show that these names can be 
 //different and do not carry any equality sygnificance
 interface Area{
 	int area(int i,int j);
 }
 
 //This class implements both Param and Area interfaces
 class Rectangle implements Param,Area{
 	public int area(int x,int y){
 		return(x*y);
 	}
 }
 
 class Interface{
 	public static void main(String args[]){
 		Rectangle rect=new Rectangle();
 		//Instanciating Area interface and assigning 
 		//the rect instance of Rectangle class to it
 		Area area;
 		area=rect;
 		//Here we are accessing the method of Rectangle class
 		System.out.println("Area of Rectangle = "+ rect.area(10,20));
 		//Here we are showing that the constants are accessable
 		System.out.println("Constants: "+rect.length+" "+rect.breath);
 		//Here we are using the method of Area interface 
 		//So we had to assign the rect instance to the area instance
 		//of the interface
 		System.out.println("Area of Rectangle by interface = "+area.area(10,30));
 	}
 }


Other 1 submission(s) by this author

 
Report Bad Submission

    Use this form to tell us if this entry should be deleted (i.e contains no code, is a virus, etc.).
    This submission should be removed because: 

Your Vote


    What do you think of this code (in the Intermediate category)?
    (The code with your highest vote will win this month's coding contest!)
    Excellent  Good  Average  Below Average  Poor 

    (See voting log ...)

 
Other User Comments



 There are no comments on this submission.
 
	
Add Your Feedback

    Your feedback will be posted below and an email sent to the author. Please remember that the author was kind enough to share this with you, so any criticisms must be stated politely, or they will be deleted. (For feedback not related to this particular code, please click here instead.)
     

    Name: 	
    Email: 	lilbit_sabi@yahoo.com
    Comment: 	
