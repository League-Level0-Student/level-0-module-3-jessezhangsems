//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package _99_extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than “yes�? or “no�?
		//	show a pop up that says “You are bananas!�?
		
		
String input=JOptionPane.showInputDialog("Do you like bananas?");
	if (input.equals("Yeah")) {
		String hobby=JOptionPane.showInputDialog("What is your favorite hobby?");
		}
	else if(input.equals("Yea")) {
		String hobby=JOptionPane.showInputDialog("What is your favorite hobby?");
	}
	else if(input.equals("Yes")) {
		String hobby=JOptionPane.showInputDialog("What is your favorite hobby?");
	}
	else if(input.equals("yes")) {
		String hobby=JOptionPane.showInputDialog("What is your favorite hobby?");
	}
	else if(input.equals("Sure")) {
		String hobby=JOptionPane.showInputDialog("What is your favorite hobby?");
	}
	
	else if(input.equals("yea")) {
		String hobby=JOptionPane.showInputDialog("What is your favorite hobby?");
	}
	else if(input.equals("sure I guess")) {
		String hobby=JOptionPane.showInputDialog("What is your favorite hobby?");
	}else if(input.equals("yeah")) {
		String hobby=JOptionPane.showInputDialog("What is your favorite hobby?");
	}else if(input.equals("Affirmative")) {
		String hobby=JOptionPane.showInputDialog("What is your favorite hobby?");
	}else if(input.equals("Ya")) {
		String hobby=JOptionPane.showInputDialog("What is your favorite hobby?");
	}else if(input.equals("I love bananas!")) {
		String hobby=JOptionPane.showInputDialog("What is your favorite hobby?");
	}else if(input.equals("i love them.")) {
		String hobby=JOptionPane.showInputDialog("What is your favorite hobby?");
	}else if(input.equals("I love bananas")) {
		String hobby=JOptionPane.showInputDialog("What is your favorite hobby?");
	}else if(input.equals("They are my favorite fruit!")) {
		String hobby=JOptionPane.showInputDialog("What is your favorite hobby?");
	}else if(input.equals("To be honest, they are the best. ")) {
		String hobby=JOptionPane.showInputDialog("What is your favorite hobby?");
	}else if(input.equals("They are pretty good.")) {
		String hobby=JOptionPane.showInputDialog("What is your favorite hobby?");
	}else if(input.equals("i believe so. ")) {
		String hobby=JOptionPane.showInputDialog("What is your favorite hobby?");
	}
	if(input.equals("No")) {
		JOptionPane.showMessageDialog(null, "Jeez, you are crazy!");
	}
	
	}
	
}
