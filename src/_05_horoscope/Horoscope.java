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
JOptionPane.showMessageDialog(null, "Gemini like to be the center of attention; always. \nWhen they perceive the situation to not be in their favor, they leave it. \nThis can include relationships, careers, and friendships. Because of this need to be seen as important, Gemini will sometimes stretch the truth. When they are focused only on themselves they can be largely unsympathetic and rude. Male Gemini tend to change jobs often, and female Gemini change partners often due to boredom.");
}
else if (input.equals("Cancer")) {
JOptionPane.showMessageDialog(null, "Observing the tiny details in life will help you overcome problems.");

}
else if (input.equals("Leo")) {
	JOptionPane.showMessageDialog(null, "If you have a disagreement, put it down the right way or else you will have tension with the person for a long time.");
	
}
else if (input.equals("Virgo")) {
	JOptionPane.showMessageDialog(null, "Do not cause tension and do not repeat past mistakes");
}
else if (input.equals("Libra")) {
	JOptionPane.showMessageDialog(null, "You will be happy today but a family member will stop you.\n You will feel pretty frustrated, but later you will know that you should consider their words. ");
} 

else if (input.equals("Scorpio")) {	
	JOptionPane.showMessageDialog(null, "Gather around someone that you can rely on with something long term in your life.");
}
else if (input.equals("Saggitarius")) {
	JOptionPane.showMessageDialog(null, "Today your future plans will be put in place.");
}
else if (input.equals("Capricorn")) {
	JOptionPane.showMessageDialog(null,"You will be confused and muddled today so you need to focus extra hard.");
	
}
else if (input.equals("Aquarius")) {
	JOptionPane.showMessageDialog(null, "Your financial issues will ease today.");
}
else if (input.equals("Pisces")) {
	JOptionPane.showMessageDialog(null, "You will feel extremely happy today, giving you the mental energy to progress and move forward.");
}
	}

}
