import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class createCourse_GUI {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	
	/**
	 * Create the application.
	 */
	public createCourse_GUI(final int s) {
		initialize(s);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(final int s){
		
		if(s==-1){
			try{
				Course c = new Course();
				Run.vec.addElement(c);
			}
			catch(Exception e){
				System.out.println("There is a problem. Try again.");
				frame.setVisible(false);
			}
		}
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCourseCreationPortal = new JLabel("Course Creation Portal");
		lblCourseCreationPortal.setBounds(135, 12, 188, 15);
		frame.getContentPane().add(lblCourseCreationPortal);
		
		textField = new JTextField();
		textField.setBounds(124, 42, 230, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(124, 73, 230, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(124, 104, 230, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(124, 135, 230, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		
		JLabel lblCourseName = new JLabel("Course Name");
		lblCourseName.setBounds(12, 44, 104, 15);
		frame.getContentPane().add(lblCourseName);
		
		JLabel lblFees = new JLabel("Fees");
		lblFees.setBounds(46, 75, 70, 15);
		frame.getContentPane().add(lblFees);
		
		JLabel lblStartDate = new JLabel("Start Date");
		lblStartDate.setBounds(25, 106, 91, 15);
		frame.getContentPane().add(lblStartDate);
		
		JLabel lblDuration = new JLabel("Duration");
		lblDuration.setBounds(36, 137, 70, 15);
		frame.getContentPane().add(lblDuration);
		
		JButton btnCreateCourseCoordinator = new JButton("Create Course Coordinator");
		btnCreateCourseCoordinator.setBackground(UIManager.getColor("Button.highlight"));
		btnCreateCourseCoordinator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s==-1) {
					int n= Run.vec.size();
					courseCoord_GUI obj= new courseCoord_GUI(n-1);
					obj.frame.setVisible(true);
				}
				else{
					courseCoord_GUI obj= new courseCoord_GUI(s);
					obj.frame.setVisible(true);
				}
			}
		});
		btnCreateCourseCoordinator.setBounds(182, 192, 230, 25);
		frame.getContentPane().add(btnCreateCourseCoordinator);
		
		JButton btnNewButton = new JButton("Create Faculty(s)");
		btnNewButton.setBackground(UIManager.getColor("Button.highlight"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s==-1) {
					int n= Run.vec.size();
					createFaculty_GUI obj= new createFaculty_GUI(n-1, -1);
					obj.frame.setVisible(true);
				}
				else{
					createFaculty_GUI obj= new createFaculty_GUI(s, -1);
					obj.frame.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(37, 229, 155, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(s==-1){
					int n= Run.vec.size();
					
					String st = textField.getText();
					Run.vec.elementAt(n-1).set_course_name(st);
					System.out.println("Name: "+st);
				
					st = textField_1.getText();
					double fees_ = 0;
					try{	
						fees_= Double.parseDouble(st);
					}
					catch(Exception e){
					System.out.println("Incorrect format");
					}
					Run.vec.elementAt(n-1).set_course_fee(fees_);
				
					Date dt= new Date();
					try{
						st= textField_2.getText();
						SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
						df.setLenient(false);
						dt = (df).parse(st);
					}
					catch(Exception e){
						JOptionPane.showMessageDialog(null, "Incorrect date format");
					}
					Run.vec.elementAt(n-1).set_start_date(dt);
				
					st = textField_3.getText();
					int dd = 0;
					try{
						dd= Integer.parseInt(st);
					}
					catch(Exception e){
						System.out.println("Incorrect format");
					}	
					Run.vec.elementAt(n-1).set_course_duration(dd);
				}
				else{
					
					String st = textField.getText();
					Run.vec.elementAt(s).set_course_name(st);
					System.out.println("Name: "+st);
				
					st = textField_1.getText();
					double fees_ = 0;
					try{	
						fees_= Double.parseDouble(st);
					}
					catch(Exception e){
					System.out.println("Incorrect format");
					}
					Run.vec.elementAt(s).set_course_fee(fees_);
				
					Date dt= new Date();
					try{
						st= textField_2.getText();
						SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
						df.setLenient(false);
						dt = (df).parse(st);
					}
					catch(Exception e){
						JOptionPane.showMessageDialog(null, "Incorrect date format");
					}
					Run.vec.elementAt(s).set_start_date(dt);
				
					st = textField_3.getText();
					int dd = 0;
					try{
						dd= Integer.parseInt(st);
					}
					catch(Exception e){
						System.out.println("Incorrect format");
					}	
					Run.vec.elementAt(s).set_course_duration(dd);
				}
			}
		});
		btnOk.setForeground(Color.WHITE);
		btnOk.setBackground(Color.DARK_GRAY);
		btnOk.setBounds(193, 155, 54, 25);
		frame.getContentPane().add(btnOk);
		
		JButton btnRegisterParticipantsFor = new JButton("Register Participant(s)");
		btnRegisterParticipantsFor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(s==-1) {
					int n= Run.vec.size();
					createParticipant_GUI obj= new createParticipant_GUI(n-1, -1);
					obj.frame.setVisible(true);
				}
				else{
					createParticipant_GUI obj= new createParticipant_GUI(s, -1);
					obj.frame.setVisible(true);
				}
			}
		});
		btnRegisterParticipantsFor.setBounds(204, 229, 208, 25);
		frame.getContentPane().add(btnRegisterParticipantsFor);
		
		JButton btnNewButton_1 = new JButton("Return");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(46, 192, 117, 25);
		frame.getContentPane().add(btnNewButton_1);
	}
}
