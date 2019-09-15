package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame=new JFrame ();
	JPanel panel=new JPanel();
	JButton button1=new JButton("Add Name");
	JButton button2=new JButton("View Names");
	String []st=new String[3];
	ArrayList<String> str=new ArrayList<String> ();
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	public static void main(String[] args) {
		
	}
void gui() {
		frame.setVisible(true);
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button1) {//cc//
			String answer=JOptionPane.showInputDialog(null,"Enter a name");
			str.add(answer);
		}
		if (e.getSource()==button2) {
			for (int i=0;i<str.size();i++) {
				JOptionPane.showMessageDialog(null, str.get(i));
			}
		}
	}
}
