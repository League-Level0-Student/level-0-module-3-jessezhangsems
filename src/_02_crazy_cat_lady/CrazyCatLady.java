//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _02_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
String input=JOptionPane.showInputDialog("How many cats do you have?");
int num=Integer.parseInt(input);
if (num>=3) {
	JOptionPane.showMessageDialog(null, "Geez! You are a crazy cat lady!");
}
else if(num>0&&num<3) {
	playVideo("https://www.youtube.com/watch?v=XyNlqQId-nk");
}
else if(num==0) {
	playVideo("https://www.youtube.com/watch?v=iWYCoBiTnA0");
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