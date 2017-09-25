import javax.swing.*;

/* Övning 3.5
David Andersson
25/9 2017 */

public class ovn3_5{
	public static void main(String[] args){

		String priss = JOptionPane.showInputDialog(null, "Ange pris inkl. moms");
		double pris = Double.parseDouble(priss);
		double moms; //vet inte hur jag ska göra om jag använder int
		moms = 0.75;
		double prisss = pris * moms;
		String h = "Inkl. moms: " + pris + "\nExkl. moms: " + prisss;
		JOptionPane.showMessageDialog(null, h);
	}
}