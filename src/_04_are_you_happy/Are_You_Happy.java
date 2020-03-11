package _04_are_you_happy;

import javax.swing.JOptionPane;

public class Are_You_Happy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input=JOptionPane.showInputDialog(null, "Are you happy?","Survey",3);
		if (input.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Then go do whatever you were doing, I dunno.");
		}
		else if (input.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "Then go do whatever you were doing, I dunno. It's good that you are happy.");
		}
		else if (input.equals("No")) {
			String dod =JOptionPane.showInputDialog(null, "Are you willing to be happy?");
			 if (dod.equals("Yes")) {
				JOptionPane.showMessageDialog(null,"Then change something.");
				
		}
		if(dod.equals("No")) {
			JOptionPane.showMessageDialog(null, "Then go to whatever you were doing, I dunno. This is ironic. You feel happy being sad?");
		}
		}
	}
	

}
