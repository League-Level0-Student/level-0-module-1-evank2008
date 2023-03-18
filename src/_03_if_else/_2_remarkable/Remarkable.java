package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

import java.net.URI;
import java.util.Random;



public class Remarkable {
public static void main(String[] args) {

	Random ran = new Random();
	Random ran1 = new Random();
		// 1.   Savde something remarkable about each person in a variable.
	String a1 = null;
	String a2 = null;
	String p1 = " exist";
	String p2 = " have eyebrows";
	String p3 = " have the ability to read";
	String p4 = " are currently either standing or sitting";
	String p5 = " are currently in possesion of at least 2 kidneys";
	String p6 = " are not holding 8.4 slices of american cheese in your right hand";
	String p7 = " have breathed in the past minute";
		// 2. Ask the user to enter a name. Store their answer in a variable.
	JOptionPane.showInputDialog("Let's find out how remarkable you are! What's your name?");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
	//This part randomizes the remarkability strings
	int r1 = ran.nextInt(7);
	int r2 = ran1.nextInt(7);
	if (r2==r1) {
		if (r2==7) {
			r2 = 6;
		}
		else {
			r2 += 1;
		}
	}
	//This part converts the random numbers to remarkabilities #1
	if (r1==0) {
		a1=p1;
	}
	if (r1==1) {
		a1=p2;
	}
	if (r1==2) {
		a1=p3;
	}
	if (r1==3) {
		a1=p4;
	}
	if (r1==4) {
		a1=p5;
	}
	if (r1==5) {
		a1=p6;
	}
	if (r1==6) {
		a1=p7;
	}
	//This part generates remarkabilities #2
	if (r2==0) {
		a2=p1;
	}
	if (r2==1) {
		a2=p2;
	}
	if (2==2) {
		a2=p3;
	}
	if (r2==3) {
		a2=p4;
	}
	if (r2==4) {
		a2=p5;
	}
	if (r2==5) {
		a2=p6;
	}
	if (r2==6) {
		a2=p7;
	}
		
	Random ran3 = new Random();
	int r3 = ran.nextInt(5);
	if(r3<4) {
	JOptionPane.showMessageDialog(null,"Remarkable! You simultaneously" + a1 + " AND you" + a2 + "! How crazy is that?");
		}
	else {
		playVideo("https://vimeo.com/809368116");
	}
	}
static void playVideo(String videoURL) {
	try {
		URI uri = new URI(videoURL);
		java.awt.Desktop.getDesktop().browse(uri);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}