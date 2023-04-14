package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import java.util.Random;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
int qnum = 0;
int n =0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
int answer = 0;
Random ran = new Random();
int r1 = ran.nextInt(51);
Random ran2 = new Random();
int r2 = ran.nextInt(21);
Random ran3 = new Random();
int r3 = ran.nextInt(5);
String input = null;
int i = 0;
//the loop of questioning
while(n==0) {
while(i!=3){
	i+=1;
r1 = ran.nextInt(51);
r2 = ran.nextInt(21);
r3 = ran.nextInt(5);
//deciding which operation to pull
String operator = null;
	if(r3 == 0) {
	operator = "plus";
	}
	if(r3 == 1) {
		operator = "minus";
		}
	if(r3 == 2) {
		operator = "times";
		}
	if(r3 == 3) {
		operator = "times";
		}
	if(r3 == 4) {
		operator = "to the power of";
		}
	//doin the math
	if(r3 == 0) {
		answer = r1+r2;
	}
	if(r3 == 1) {
		 answer = r1-r2;
		}
	if(r3 == 2) {
		 answer = r1*r2;
		}
	if(r3 == 3) {
		 answer = r1*r2;
		}
	if(r3 == 4) {
		 answer = (int) Math.pow(r1, r2);
		}
	String answerString=String.valueOf(answer);
	if(qnum==0) {
input = JOptionPane.showInputDialog("Let's do some riddles. what is " + r1 + " " + operator + " " + r2 + "?");
	}
	else {
		input = JOptionPane.showInputDialog("What is " + r1 + " " + operator + " " + r2 + "?");
	}
	qnum += 1;
if(input.equals(answerString)) {
	JOptionPane.showMessageDialog(null, "yeah");
	score += 1;
}
else {
	JOptionPane.showMessageDialog(null, "nope");
}
}
JOptionPane.showMessageDialog(null, "Congratulations. You reached the end!");
if(score==0) {
	JOptionPane.showMessageDialog(null, "You idiot. You imbecile. You absolute, complete, smelly buffoon. You got 0 questions right out of 3. Don't come back.");
n=1;
}
else if(score==1) {
	JOptionPane.showMessageDialog(null, "You suck. You got 1 out of 3 questions right. Go back to math class.");
n=1;
}
else if(score==2) {
	String tryagain = JOptionPane.showInputDialog(null, "Pretty close. You got 2 out of 3 questions right. Try again? yes or anything that's not yes");
	if(tryagain.equals("yes")) {
		i=0;
	}
	else {
		n=1;
	}
}
else if(score==3) {
	n=1;
	JOptionPane.showMessageDialog(null, "Nice. You got all 3 questions right. You win!");
}
}
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

