import java.io.*;
import java.util.*;

public class Course implements java.io.Serializable
{
	
	private String course_name;
	private double fees;
	private Date start;
	private Integer duration_days;
	private Integer num_of_fac;
	private Integer num_of_part;
	
	Faculty course_coord;
	Vector <Faculty> course_fac = new Vector <Faculty> ();
	Vector <Participant> reg_part = new Vector <Participant> ();
	
	/**********************************/
	
	
	//constructors
	
	Course () {
		course_name = " ";
		fees = 0.0;
		start = new Date();
		duration_days = 0;
		num_of_fac= 0;
		num_of_part= 0;
		
		course_coord= new Faculty();
	}
	
	
	
	//setters
	void set_course_name ( String s ) {
		course_name = s;
	} 
	
	void set_course_fee ( double f ) {
		fees = f;
	} 
	
	void set_start_date ( Date s ) {
		start = s;
	} 
	
	void set_course_duration ( int dd ) {
		duration_days = dd;
	}
	
	void set_num_of_fac (int n) {
		num_of_fac = n;
	}
	
	void set_num_of_part (int n) {
		num_of_part = n;
	}
	
	//getters
	String get_course_name () {
		return course_name;
	} 
	
	double get_course_fee () {
		return fees;
	}
	
	Date get_start_date(){
		return start;
	}  
	
	int get_course_duration () {
		return duration_days;
	}

	int get_num_of_fac () {
		return num_of_fac;
	}
	
	int get_num_of_part () {
		return num_of_part;
	}
	
}
