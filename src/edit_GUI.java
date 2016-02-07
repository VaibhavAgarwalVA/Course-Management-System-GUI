import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.io.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class edit_GUI {

	public JFrame frame;


	/**
	 * Create the application.
	 */
	public edit_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEditOptions = new JLabel("Edit Options");
		lblEditOptions.setBounds(164, 26, 105, 15);
		frame.getContentPane().add(lblEditOptions);
		
		JButton btnCourse = new JButton("Course");
		btnCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editCourseDD_GUI obj= new editCourseDD_GUI();
				obj.frame.setVisible(true);
			}
		});
		btnCourse.setBounds(152, 84, 117, 25);
		frame.getContentPane().add(btnCourse);
		
		JButton btnFaculty = new JButton("Faculty");
		btnFaculty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editCfFacDD_GUI obj= new editCfFacDD_GUI(1);
				obj.frame.setVisible(true);
			}
		});
		btnFaculty.setBounds(152, 131, 117, 25);
		frame.getContentPane().add(btnFaculty);
		
		JButton btnParticipant = new JButton("Participant");
		btnParticipant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editCfPartDD_GUI obj=new editCfPartDD_GUI(1);
				obj.frame.setVisible(true);
			}
		});
		btnParticipant.setBounds(152, 180, 117, 25);
		frame.getContentPane().add(btnParticipant);
	}

}
