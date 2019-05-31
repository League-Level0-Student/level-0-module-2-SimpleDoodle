package methods;

import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog(null, "Are you over 4 feet tall?");
		if (height.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "You can ride the roller coaster.");
		} else {
			JOptionPane.showMessageDialog(null, "You cannot ride the roller coaster!");

		}
	}
}
