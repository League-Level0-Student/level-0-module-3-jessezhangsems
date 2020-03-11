package _05_horoscope;

import javax.swing.JOptionPane;

public class Horoscope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input=JOptionPane.showInputDialog("What is your Zodiac sign?");
if (input.equals("Aries")) {
	JOptionPane.showMessageDialog(null, "Highly energetic, and has no problem working long hours on a single project. \nOften take the initiative experiencing new breakthroughs and discoveries. \nAries are thorough, painstaking, and have a knack for precise records and clarity. \nThey live hard, love hard, and play hard."
			+ "\nAries have tunnel vision when working on a project which can make them seem selfish. \nThey can become impatient with those who are not similar to themselves temperamentally and intellectually. \nThe dedication to a project can become stubbornness, possessiveness, and can lead to a withdrawn and sullen attitude. \nMany Aries who do not feel acknowledged for their accomplishments become sarcastic and rude.");
}
else if (input.equals("Taurus")) {
JOptionPane.showMessageDialog(null, "Taurus people almost always finish what they start. They are deliberate thinkers and when making decisions usually make the right one. \nTaurus are generally adaptable, adjusting easily to new circumstances especially if there is the reward of luxury, comfort, or sensual reward. This sign loves to laugh and spend time with family. \nTaurus can be stubborn and ‘bullish’ about ideas that they’ve adopted, which can also make them difficult to get along with when attempting to cooperate on a shared project. Taurus needs to be the leader and to be held in high esteem. \nIf they are not, they refuse to work, often finding small ways to sabotage projects, relationships, or undermine authority that they deem unworthy of leadership.");
	
}
else if (input.equals("Gemini")) {
JOptionPane.showMessageDialog(null, "");
}
	}

}
