import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.io.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class displayFaculty_GUI {

	public JFrame frame;


	/**
	 * Create the application.
	 */
	public displayFaculty_GUI(final Faculty fac) {
		initialize(fac);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(final Faculty fac) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFacultyDescription = new JLabel("Faculty Description");
		lblFacultyDescription.setBounds(145, 12, 157, 15);
		frame.getContentPane().add(lblFacultyDescription);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(74, 72, 70, 15);
		frame.getContentPane().add(lblName);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(74, 96, 112, 15);
		frame.getContentPane().add(lblDepartment);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(74, 123, 70, 15);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblEmailid = new JLabel("Email-ID");
		lblEmailid.setBounds(74, 150, 70, 15);
		frame.getContentPane().add(lblEmailid);
		
		JLabel lblContactNumber = new JLabel("Contact Number");
		lblContactNumber.setBounds(74, 177, 143, 15);
		frame.getContentPane().add(lblContactNumber);
		
		JLabel lblNewLabel = new JLabel("//FN");
		lblNewLabel.setBounds(219, 72, 191, 15);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setText(fac.get_fac_name());
		
		JLabel lblfd = new JLabel("//FD");
		lblfd.setBounds(219, 96, 191, 15);
		frame.getContentPane().add(lblfd);
		lblfd.setText(fac.get_fac_dep());
		
		JLabel lblfa = new JLabel("//FA");
		lblfa.setBounds(219, 123, 191, 15);
		frame.getContentPane().add(lblfa);
		lblfa.setText(fac.get_fac_address());
		
		JLabel lblfe = new JLabel("//FE");
		lblfe.setBounds(219, 150, 191, 15);
		frame.getContentPane().add(lblfe);
		lblfe.setText(fac.get_fac_email_id());
		
		JLabel lblfc = new JLabel("//FC");
		lblfc.setBounds(219, 177, 191, 15);
		frame.getContentPane().add(lblfc);
		String mob= "+91 " + fac.get_fac_mobile_no();
		lblfc.setText(mob);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
			}
		});
		btnBack.setBounds(167, 220, 117, 25);
		frame.getContentPane().add(btnBack);
	}

}
