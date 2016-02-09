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

public class Run {
	
	public static Vector<Course> vec= new Vector<Course>();
	
	Run() {
		;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		
		try {
			GUI_Project1 window = new GUI_Project1();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
