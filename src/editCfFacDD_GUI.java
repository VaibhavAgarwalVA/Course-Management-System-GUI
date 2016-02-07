import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.io.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class editCfFacDD_GUI {

	public JFrame frame;

	Run runobj= new Run();
	
	/**
	 * Create the application.
	 */
	public editCfFacDD_GUI(final int param) {
		initialize(param);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(final int param) {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblChooseCourse = new JLabel("Choose any one");
		lblChooseCourse.setBounds(160, 25, 120, 15);
		frame.getContentPane().add(lblChooseCourse);
		
		int s= Run.vec.size();
		System.out.println("s= "+s);
		String[] messages= new String[s];
		for(int i=0;i<s;i++){
			messages[i]= Run.vec.elementAt(i).get_course_name();
			System.out.println("message= "+ Run.vec.elementAt(i).get_course_name());
		}
		
		JComboBox comboBox = new JComboBox(messages);
		comboBox.setBounds(146, 86, 145, 24);
		frame.getContentPane().add(comboBox);
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ind = ((JComboBox)e.getSource()).getSelectedIndex();
				editFacDD_GUI obj= new editFacDD_GUI(ind,param);
				obj.frame.setVisible(true);
			}
		});
		
	}
}
