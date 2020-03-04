//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		Robot jim = new Robot();
		
	String input=	JOptionPane.showInputDialog("What color do you want the robot to draw?" );

if (input.equals("red")) {
	jim.setPenColor(Color.RED);
}
else if (input.equals("green")) {
	jim.setPenColor(Color.green);
}
else if (input.equals("yellow")) {
	jim.setPenColor(Color.yellow);
}
else if (input.equals("blue")) {
	jim.setPenColor(Color.blue);
}
else if (input.equals("purple")) {
	jim.setPenColor(Color.MAGENTA);
}
else if (input.equals("orange")) {
	jim.setPenColor(Color.orange);
}
jim.penDown();    //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them

		//4. Set the pen width to 10
		jim.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		
jim.move(100);
jim.turn(90);
jim.move(100);
jim.turn(90);
jim.move(100);
jim.turn(90);
jim.move(100);

	}
}
