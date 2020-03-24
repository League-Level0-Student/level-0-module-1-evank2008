package _02_unbirthday;

import javax.swing.JOptionPane;

public class Unbrithday {
public static void main(String[] args) {
	String month = JOptionPane.showInputDialog("What is your birthday month?");
	String day = JOptionPane.showInputDialog("What is your what is your birthday day?(e.g, 1, 2, 3, etc.)");
	if (month.equalsIgnoreCase("march")) {
		if(day.equals("24")) {
			JOptionPane.showMessageDialog(null, "Happy birthday! Unless you just put in today's date to test my code. In that case, Sad fake-birthday, liar!");
			
		}
	} 
	else {
		JOptionPane.showMessageDialog(null, "Um, mediocre non-birthday, I guess?");	
	}
	
	
	
}
}
