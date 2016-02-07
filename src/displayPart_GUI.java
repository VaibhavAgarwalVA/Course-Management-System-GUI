import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.io.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class displayPart_GUI {

	public JFrame frame;


	/**
	 * Create the application.
	 */
	public displayPart_GUI(final Participant p) {
		initialize(p);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(final Participant p) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPartDescription = new JLabel("Participant Description");
		lblPartDescription.setBounds(127, 24, 206, 15);
		frame.getContentPane().add(lblPartDescription);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(74, 72, 70, 15);
		frame.getContentPane().add(lblName);
		
		JLabel lblOrganisation = new JLabel("Organisation");
		lblOrganisation.setBounds(74, 96, 112, 15);
		frame.getContentPane().add(lblOrganisation);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(74, 123, 70, 15);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblEmailid = new JLabel("Email-ID");
		lblEmailid.setBounds(74, 150, 70, 15);
		frame.getContentPane().add(lblEmailid);
		
		JLabel lblContactNumber = new JLabel("Contact Number");
		lblContactNumber.setBounds(74, 177, 143, 15);
		frame.getContentPane().add(lblContactNumber);
		
		JLabel lblNewLabel = new JLabel("//PN");
		lblNewLabel.setBounds(219, 72, 191, 15);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setText(p.get_part_name());
		
		JLabel lblfd = new JLabel("//PD");
		lblfd.setBounds(219, 96, 191, 15);
		frame.getContentPane().add(lblfd);
		lblfd.setText(p.get_part_org());
		
		JLabel lblfa = new JLabel("//PA");
		lblfa.setBounds(219, 123, 191, 15);
		frame.getContentPane().add(lblfa);
		lblfa.setText(p.get_part_address());
		
		JLabel lblfe = new JLabel("//PE");
		lblfe.setBounds(219, 150, 191, 15);
		frame.getContentPane().add(lblfe);
		lblfe.setText(p.get_part_email_id());
		
		JLabel lblfc = new JLabel("//PC");
		lblfc.setBounds(219, 177, 191, 15);
		frame.getContentPane().add(lblfc);
		String no= "+91 "+ p.get_part_mobile_no();
		lblfc.setText(no);
		
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
