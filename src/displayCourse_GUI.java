import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import java.io.*;
import java.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class displayCourse_GUI {

	public JFrame frame;


	/**
	 * Create the application.
	 */
	public displayCourse_GUI(final int ind) {
		initialize(ind);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(final int ind) {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCourseDetails = new JLabel("Course Details");
		lblCourseDetails.setBounds(159, 12, 124, 15);
		frame.getContentPane().add(lblCourseDetails);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBackground(SystemColor.inactiveCaption);
		lblName.setForeground(SystemColor.activeCaption);
		lblName.setBounds(51, 68, 70, 15);
		frame.getContentPane().add(lblName);
		
		JLabel lblFees = new JLabel("Fees");
		lblFees.setBackground(SystemColor.inactiveCaption);
		lblFees.setForeground(SystemColor.activeCaption);
		lblFees.setBounds(51, 86, 70, 15);
		frame.getContentPane().add(lblFees);
		
		JLabel lblDuration_1 = new JLabel("Duration");
		lblDuration_1.setBackground(SystemColor.inactiveCaption);
		lblDuration_1.setForeground(SystemColor.activeCaption);
		lblDuration_1.setBounds(51, 106, 70, 15);
		frame.getContentPane().add(lblDuration_1);
		
		JLabel lblStartDate = new JLabel("Start Date");
		lblStartDate.setBackground(SystemColor.inactiveCaption);
		lblStartDate.setForeground(SystemColor.activeCaption);
		lblStartDate.setBounds(51, 124, 108, 15);
		frame.getContentPane().add(lblStartDate);
		
		JButton btnFacultyList = new JButton("Faculty List");
		btnFacultyList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				facultyDropDown_GUI obj= new facultyDropDown_GUI(ind);
				obj.frame.setVisible(true);
			}
		});
		btnFacultyList.setBounds(51, 190, 142, 25);
		frame.getContentPane().add(btnFacultyList);
		
		JButton btnParticipantList = new JButton("Participant List");
		btnParticipantList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				partDropDown_GUI obj=new partDropDown_GUI(ind);
				obj.frame.setVisible(true);
			}
		});
		btnParticipantList.setBounds(261, 190, 142, 25);
		frame.getContentPane().add(btnParticipantList);
		
		JLabel lblcn = new JLabel("//CN");
		lblcn.setBackground(Color.LIGHT_GRAY);
		lblcn.setBounds(187, 68, 190, 15);
		frame.getContentPane().add(lblcn);
		lblcn.setText(Run.vec.elementAt(ind).get_course_name());
		
		JLabel lblcf = new JLabel("//CF");
		lblcf.setBackground(Color.LIGHT_GRAY);
		lblcf.setBounds(187, 86, 190, 15);
		frame.getContentPane().add(lblcf);
		String ss = "INR " + Run.vec.elementAt(ind).get_course_fee();
		lblcf.setText(ss);
		
		JLabel lblcd = new JLabel("//CD");
		lblcd.setBackground(Color.LIGHT_GRAY);
		lblcd.setBounds(187, 106, 190, 15);
		frame.getContentPane().add(lblcd);
		String dur = Run.vec.elementAt(ind).get_course_duration() + " days";
		lblcd.setText(dur);
		
		JLabel lblsd = new JLabel("//SD");
		lblsd.setBackground(Color.LIGHT_GRAY);
		lblsd.setBounds(187, 124, 190, 15);
		frame.getContentPane().add(lblsd);
		lblsd.setText(Run.vec.elementAt(ind).get_start_date());
		
		JButton btnNewButton = new JButton("Course Coordinator");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				displayFaculty_GUI obj= new displayFaculty_GUI(Run.vec.elementAt(ind).course_coord);
				obj.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(140, 153, 173, 25);
		frame.getContentPane().add(btnNewButton);
		
	}
}
