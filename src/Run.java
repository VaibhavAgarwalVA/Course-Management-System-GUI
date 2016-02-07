import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.*;
import java.util.*;

public class Run {
	
	public static Vector<Course> vec= new Vector<Course>();
	
	Run() {
		;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUI_Project1 window = new GUI_Project1();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
