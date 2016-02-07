import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.io.*;
import java.util.*;

public class Option1_GUI{

	public JFrame frame;

	/**
	 * Create the application.
	 */
	public Option1_GUI() {
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
		
		JButton btnNewButton = new JButton("Create a new course");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createCourse_GUI obj= new createCourse_GUI(-1);
				obj.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(61, 96, 316, 43);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Display Particular Course Details");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				courseDropDown_GUI obj= new courseDropDown_GUI(1);
				obj.frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(61, 151, 316, 43);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblChoice = new JLabel("Choice 1");
		lblChoice.setBounds(184, 43, 102, 20);
		frame.getContentPane().add(lblChoice);
		
		JButton btnReturnBack = new JButton("Return back");
		btnReturnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnReturnBack.setBounds(141, 222, 145, 25);
		frame.getContentPane().add(btnReturnBack);
	}

}
