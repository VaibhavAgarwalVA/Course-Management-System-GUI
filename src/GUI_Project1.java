import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.io.*;
import java.util.*;

public class GUI_Project1 extends JFrame implements java.io.Serializable {

	public JFrame frame;
	public JButton btnNewButton;
	/**
	 * Create the application.
	 */
	public GUI_Project1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */ 
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnNewButton = new JButton("Create / Display Course");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Option1_GUI op1= new Option1_GUI();
				op1.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(109, 108, 226, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnEditDetails = new JButton("Edit Details");
		btnEditDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				edit_GUI obj= new edit_GUI();
				obj.frame.setVisible(true);
			}
		});
		btnEditDetails.setBounds(109, 136, 226, 25);
		frame.getContentPane().add(btnEditDetails);
		
		JButton btnDelete = new JButton("Delete Options");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delete_GUI obj= new delete_GUI();
				obj.frame.setVisible(true);
			}
		});
		btnDelete.setBounds(109, 162, 226, 25);
		frame.getContentPane().add(btnDelete);
		
		JButton btnNewButton_2 = new JButton("EXIT !");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					FileOutputStream fileOut = new FileOutputStream("data.ser");
					ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(fileOut));
					out.writeObject(Run.vec);
					out.close();
					fileOut.close();
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
				try{
					FileInputStream fileIn = new FileInputStream("data.ser");
					ObjectInputStream in = null; 
		 	  	
		 	  	 
					File file = new File("data.ser");
					boolean isEmpty = file.length()<10;
					if(!isEmpty){
						in = new ObjectInputStream(new BufferedInputStream(fileIn));
						Run.vec = (Vector<Course>) in.readObject();
					}
			   
					if(in!=null){
						in.close();
					}
					fileIn.close();
				}
				catch(FileNotFoundException ex){
					JOptionPane.showMessageDialog(null, "Error in loading file");
				}
				catch(IOException ex){
					JOptionPane.showMessageDialog(null, "Error in loading file");
				}
				catch(ClassNotFoundException ex){
					JOptionPane.showMessageDialog(null, "Error in loading file");
				}
				
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(160, 210, 105, 25);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Course Management System");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNewLabel.setBounds(121, 12, 226, 57);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblChooseAnOption = new JLabel("Choose an option");
		lblChooseAnOption.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblChooseAnOption.setBounds(160, 81, 135, 15);
		frame.getContentPane().add(lblChooseAnOption);
	}
}
