package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String birthday=JOptionPane.showInputDialog("When is your birthday?");
	if(birthday.equals("October 24"))
		JOptionPane.showMessageDialog(null, "Happy Birhday!");
}
	else {
		JOptionPane.showMessageDialog(null,"Very Merry Birthday!");
	}
}
}