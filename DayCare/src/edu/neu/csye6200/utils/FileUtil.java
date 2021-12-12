package edu.neu.csye6200.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.model.Teacher;

public class FileUtil {
	public static List<Student> readStudentFromCSV(String fileName){
		List<Student> studentRoster = new ArrayList<>();
		
		try (FileReader fr = new FileReader(fileName); BufferedReader br = new BufferedReader(fr)) {
			
			String line = br.readLine();
			
			while(line != null) {
				String[] attributes = line.split(",");
				
				Student student = Student.createStudent(attributes);
				
				studentRoster.add(student);
				line = br.readLine();
			}
			
		} catch (IOException ioe) {
            ioe.printStackTrace();
        }
		
		return studentRoster;
	}
	
	public static List<Teacher> readTeacherFromCSV(String fileName){
		List<Teacher> teacherRoster = new ArrayList<>();
		
		try (FileReader fr = new FileReader(fileName); BufferedReader br = new BufferedReader(fr)) {
			
			String line = br.readLine();
			
			while(line != null) {
				String[] attributes = line.split(",");
				
				Teacher teacher = Teacher.createTeacher(attributes);
				
				teacherRoster.add(teacher);
				line = br.readLine();
			}
			
		} catch (IOException ioe) {
            ioe.printStackTrace();
        }
		
		return teacherRoster;
	}
}