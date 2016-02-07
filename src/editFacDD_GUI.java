import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.io.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class editFacDD_GUI {

	public JFrame frame;

	Run runobj= new Run();
	
	/**
	 * Create the application.
	 */
	public editFacDD_GUI(final int ind, final int param) {
		initialize(ind, param);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(final int ind, final int param) {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblChooseCourse = new JLabel("Choose any one");
		lblChooseCourse.setBounds(160, 25, 120, 15);
		frame.getContentPane().add(lblChooseCourse);
		
		int s= Run.vec.elementAt(ind).course_fac.size();
		System.out.println("s= "+s);
		if(s>5){
			s=5;
		}
		String[] messages= new String[s];
		for(int i=0;i<s;i++){
			messages[i]= Run.vec.elementAt(ind).course_fac.elementAt(i).get_fac_name();
			System.out.println("message= "+ Run.vec.elementAt(ind).course_fac.elementAt(i).get_fac_name());
		}
		
		JComboBox comboBox = new JComboBox(messages);
		comboBox.setBounds(146, 86, 145, 24);
		frame.getContentPane().add(comboBox);
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = ((JComboBox)e.getSource()).getSelectedIndex();
				if(param == 1){
					createFaculty_GUI obj= new createFaculty_GUI(ind,i);
					obj.frame.setVisible(true);
				}
				else if(param == 2){
					Run.vec.elementAt(ind).course_fac.remove(i);
					frame.setVisible(false);
				}
				else{
					System.out.println("Should NOT be here !!");
				}
				
			}
		});
		
	}
}
