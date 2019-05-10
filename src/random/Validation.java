//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.nio.channels.ShutdownChannelGroupException;
import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int r = randomMaker.nextInt(6);
		
		System.out.println(r);

// 1. Use each value of randomNumber to give the user a random compliment.
if (r == 1) {
	JOptionPane.showMessageDialog(null, "Despacito is in concert G");
}
if (r == 2) {
	JOptionPane.showMessageDialog(null, "CVMS is better than Bishops");
}
if (r == 3) {
	JOptionPane.showMessageDialog(null, "Dmitri's favorite song is vasily kalinnikov symphony 1 in g minor finale");
}
if (r == 4) {
	JOptionPane.showMessageDialog(null, "The sky is blue");
}
if (r == 5) {
	JOptionPane.showMessageDialog(null, "Comrade Snowball is objectively better than Comrade Napoleon");
}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
