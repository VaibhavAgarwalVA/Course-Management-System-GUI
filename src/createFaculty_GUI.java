import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.io.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class createFaculty_GUI {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;


	/**
	 * Create the application.
	 */
	public createFaculty_GUI(final int i, final int s) {
		initialize(i,s);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(final int ind, final int s) {
		
		
		final int n= Run.vec.elementAt(Run.vec.size()-1).course_fac.size();
		
		if(s==-1){			
			try{
				Faculty fcul = new Faculty();
				Run.vec.elementAt(ind).course_fac.addElement(fcul);
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
		
		JLabel lblCreateFaculty = new JLabel("Create Course Faculty");
		lblCreateFaculty.setBounds(126, 12, 231, 15);
		frame.getContentPane().add(lblCreateFaculty);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(61, 69, 70, 15);
		frame.getContentPane().add(lblName);
		
		JLabel lblNewLabel = new JLabel("Department");
		lblNewLabel.setBounds(61, 96, 91, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Address");
		lblNewLabel_1.setBounds(61, 123, 70, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblEmailId = new JLabel("E-mail ID");
		lblEmailId.setBounds(61, 150, 70, 15);
		frame.getContentPane().add(lblEmailId);
		
		JLabel lblContactNumber = new JLabel("Contact Number");
		lblContactNumber.setBounds(61, 177, 126, 15);
		frame.getContentPane().add(lblContactNumber);
		
		textField = new JTextField();
		textField.setBounds(200, 67, 207, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(200, 121, 207, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(200, 94, 207, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(200, 148, 207, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(200, 175, 207, 19);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnSave = new JButton("Save & Return");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(s==-1){
					if(n>=5){
						JOptionPane.showMessageDialog(null, "Cannot create more than 5 participants");
						frame.setVisible(false);
					}
					String st = textField.getText();
					Run.vec.elementAt(ind).course_fac.elementAt(n).set_fac_name(st);
					System.out.println("Name: "+st);
				
					st = textField_1.getText();
					Run.vec.elementAt(ind).course_fac.elementAt(n).set_fac_address(st);
				
					st= textField_2.getText();
					Run.vec.elementAt(ind).course_fac.elementAt(n).set_fac_dep(st);
				
					st= textField_3.getText();
					Run.vec.elementAt(ind).course_fac.elementAt(n).set_fac_email_id(st);
					
					st = textField_4.getText();
					long dd = 0;
					try{
						dd= Long.parseLong(st);
					}
					catch(Exception e){
						System.out.println("Incorrect format");
					}	
					Run.vec.elementAt(ind).course_fac.elementAt(n).set_fac_mobile_no(dd);
				}
				else{
					
					String st = textField.getText();
					Run.vec.elementAt(ind).course_fac.elementAt(s).set_fac_name(st);
					System.out.println("Name: "+st);
				
					st = textField_1.getText();
					Run.vec.elementAt(ind).course_fac.elementAt(s).set_fac_address(st);
				
					st= textField_2.getText();
					Run.vec.elementAt(ind).course_fac.elementAt(s).set_fac_dep(st);
				
					st= textField_3.getText();
					Run.vec.elementAt(ind).course_fac.elementAt(s).set_fac_email_id(st);
					
					st = textField_4.getText();
					long dd = 0;
					try{
						dd= Long.parseLong(st);
					}
					catch(Exception e){
						System.out.println("Incorrect format");
					}	
					Run.vec.elementAt(ind).course_fac.elementAt(s).set_fac_mobile_no(dd);
				}
				frame.setVisible(false);
			}
		});
		btnSave.setBounds(61, 235, 169, 25);
		frame.getContentPane().add(btnSave);
		
		JButton btnSaveContinue = new JButton("Create Another");
		btnSaveContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(s==-1){
					if(n>=5){
						JOptionPane.showMessageDialog(null, "Cannot create more than 5 participants");
						frame.setVisible(false);
					}
					String st = textField.getText();
					Run.vec.elementAt(ind).course_fac.elementAt(n).set_fac_name(st);
					System.out.println("Name: "+st);
				
					st = textField_1.getText();
					Run.vec.elementAt(ind).course_fac.elementAt(n).set_fac_address(st);
				
					st= textField_2.getText();
					Run.vec.elementAt(ind).course_fac.elementAt(n).set_fac_dep(st);
				
					st= textField_3.getText();
					Run.vec.elementAt(ind).course_fac.elementAt(n).set_fac_email_id(st);
					
					st = textField_4.getText();
					long dd = 0;
					try{
						dd= Long.parseLong(st);
					}
					catch(Exception e){
						System.out.println("Incorrect format");
					}	
					Run.vec.elementAt(ind).course_fac.elementAt(n).set_fac_mobile_no(dd);
				}
				else{
					
					String st = textField.getText();
					Run.vec.elementAt(ind).course_fac.elementAt(s).set_fac_name(st);
					System.out.println("Name: "+st);
				
					st = textField_1.getText();
					Run.vec.elementAt(ind).course_fac.elementAt(s).set_fac_address(st);
				
					st= textField_2.getText();
					Run.vec.elementAt(ind).course_fac.elementAt(s).set_fac_dep(st);
				
					st= textField_3.getText();
					Run.vec.elementAt(ind).course_fac.elementAt(s).set_fac_email_id(st);
					
					st = textField_4.getText();
					long dd = 0;
					try{
						dd= Long.parseLong(st);
					}
					catch(Exception e){
						System.out.println("Incorrect format");
					}	
					Run.vec.elementAt(ind).course_fac.elementAt(s).set_fac_mobile_no(dd);
				}
				frame.setVisible(false);
				
				createFaculty_GUI obj=new createFaculty_GUI(ind,-1);
				obj.frame.setVisible(true);
			}
		});
		btnSaveContinue.setBounds(242, 235, 165, 25);
		frame.getContentPane().add(btnSaveContinue);
	}

}
