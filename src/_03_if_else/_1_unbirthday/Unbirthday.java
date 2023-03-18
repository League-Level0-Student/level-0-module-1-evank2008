package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
	
		String answer = JOptionPane.showInputDialog("What is your birthday? Use mm/dd format.");
		
		if(answer.equals("03/18")) {
			JOptionPane.showMessageDialog(null,"Happy birthday!");
		}
		else {
			JOptionPane.showMessageDialog(null,"that sucks");
		}
	}
}
