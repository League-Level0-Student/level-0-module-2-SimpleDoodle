package random;

import java.util.Random;

import javax.swing.JOptionPane;


public class LotteryNumbers {
public static void main(String[] args) {
	Random rande = new Random();
int a= rande.nextInt(10);
int b= rande.nextInt(10);
int c= rande.nextInt(10);
int d= rande.nextInt(10);
int e= rande.nextInt(10);
JOptionPane.showMessageDialog(null, a+" "+b+" "+c+" "+d+" "+e);
	}
}

