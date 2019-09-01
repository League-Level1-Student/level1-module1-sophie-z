package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	Microwave m = new Microwave();
	String f = JOptionPane.showInputDialog(null, "What flavor should the popcorn be?");
	String minutes  = JOptionPane.showInputDialog(null, "How long should I cook the popcorn?");
	int min = Integer.parseInt(minutes);
	Popcorn p = new Popcorn(f);
	m.putInMicrowave(p);
	m.setTime(min);
	m.startMicrowave();
	p.eat();
	p.applyHeat();
}
}
