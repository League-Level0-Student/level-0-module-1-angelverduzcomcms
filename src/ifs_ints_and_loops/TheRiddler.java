package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int riddler=0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String question=JOptionPane.showInputDialog(null, "Who makes it, has no need of it. Who buys it, has no use for it. Who uses it,can neither see nor feel it. What is it?");
		if(question.equals("coffin")) {
			JOptionPane.showMessageDialog(null, "correct!");
		riddler+=1;
		}
		
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer
		else{
			JOptionPane.showMessageDialog(null,"wrong");
		}
		// 6. Add some more riddles
		String questionB=JOptionPane.showInputDialog(null, " What can travel around the world while staying in a corner? ");
			if(questionB.equals("stamp")) {
				JOptionPane.showMessageDialog(null, "correct!");
			}
			else{
				JOptionPane.showMessageDialog(null,"wrong");
			}
		// 2. Make a pop up to show the score
		JOptionPane.showMessageDialog(null, "Your score is "+riddler+"!");		
	}
}

