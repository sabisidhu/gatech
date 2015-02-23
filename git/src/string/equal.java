package string;
import javax.swing.*;


public class equal {
	public static void main(String args[]){
	String a;
	String b;
	String c;
	a=JOptionPane.showInputDialog("First String");
	b=JOptionPane.showInputDialog("second String");
	if(a.equals(b))
	{
		JOptionPane.showMessageDialog(null, "Correct");
	}else{
	JOptionPane.showMessageDialog(null, "Incorrect");
	}
	}

}
