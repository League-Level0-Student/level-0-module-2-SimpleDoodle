package methods;

import javax.swing.JOptionPane;

public class Voting {
public static void main(String[] args) {
String age = JOptionPane.showInputDialog(null, "Are you 18 and above?");
if (age.equalsIgnoreCase("Yes")) {
	JOptionPane.showInputDialog(null, "Who do you think should be the next president?");
} else {
	JOptionPane.showMessageDialog(null, "Scram! No one cares about what you think.");
}
}
}
