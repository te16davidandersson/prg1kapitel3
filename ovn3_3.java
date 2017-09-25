import javax.swing.*;

/* Övning 3.3
David Andersson
25/9 2017 */

public class ovn3_3{
	public static void main(String[] args){

		String radien = JOptionPane.showInputDialog(null, "Ange radien");
		double r = Double.parseDouble(radien);
		double pi;
		pi = 3.1415926536;
		double a = pi * r * r;
		double o = 2 * pi * r;
		String h = "Area: " + a + "\nOmkrets: " + o;
		JOptionPane.showMessageDialog(null, h);
	}
}