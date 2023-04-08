package _03_if_else._3_secret_message_box;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {
		ImageIcon ridler1 = new ImageIcon("src/_03_if_else/_3_secret_message_box/riddler.jpg");
		ImageIcon shid = new ImageIcon("src/_03_if_else/_3_secret_message_box/shid.jpg");
	// 1. Set a password in a String variable
	String pwd = "ligma balls";
	// 2. Using a pop-up, ask the first person for a secret message and store it in a variable
	String secret = JOptionPane.showInputDialog("Write your secrets here");
	// 3. Now use a pop-up to tell the NEXT user that they can only see the secret message 
	//    if they can guess the passcode
	JOptionPane.showMessageDialog(null, "You can see the secrets if you answer my riddle one:", "Secret", 0, ridler1);
	// 4. If their guess matches the password, show them the secret message

    JOptionPane.showMessageDialog(null, "My riddle: Two men are talking. One says to the other, ''Did you hear that Steve Jobs died from ligma?''");
    JOptionPane.showMessageDialog(null, "The second responds, ''Who the hell is Steve Jobs?''");
    String input = JOptionPane.showInputDialog("What is the first man's response? No caps or punctuation!");
    if(input.equals(pwd)) {
    	  JOptionPane.showMessageDialog(null, "hahhahhahhahahahhahhahah yeah. Anyway the secret is that " + secret);
    }
    else {
    	JOptionPane.showMessageDialog(null, "Wrong. You know what happens next?", "lmaoo rip bozo", 0, shid);
    }
	// 5. If the password does not match, pop-up "INTRUDER!!"
	}
}
