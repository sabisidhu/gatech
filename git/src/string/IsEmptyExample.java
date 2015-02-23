package string;

import javax.swing.JOptionPane;

public class IsEmptyExample{  
public static void main(String args[]){  
String s1;
s1=JOptionPane.showInputDialog("Enter the String");
if(s1.isEmpty()){
	JOptionPane.showMessageDialog(null, "Please fill the field");
}

 
}}  