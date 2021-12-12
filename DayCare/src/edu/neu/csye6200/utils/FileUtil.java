package edu.neu.csye6200.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.neu.csye6200.api.helper.TeacherHelper;
import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.model.Teacher;

public class FileUtil {
	
	public static void writeStudentToCSV(String fileName, List<List<String>> studentArrays){
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(fileName));
	
			// Append strings from array
			for (List<String> stud : studentArrays) {
				for(String st: stud) {
					br.write(st);
					br.append(",");
				}
			 	br.newLine();
			}
	
	
			br.close();
	
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public static List<Student> readStudentFromCSV(String fileName){
		List<Student> studentRoster = new ArrayList<>();
	
		try (FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr)) {
	
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
	
	
	public static void writeTeacherToCSV(String fileName, List<List<String>> teacherArrays){
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(fileName));
	
			// Append strings from array
			for (List<String> teach : teacherArrays) {
				for(String st: teach) {
					br.write(st);
					br.append(",");
				}
			 	br.newLine();
			}
	
	
			br.close();
	
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public static List<Teacher> readTeacherFromCSV(String fileName){
		List<Teacher> teacherRoster = new ArrayList<>();
	
		try (FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr)) {
	
			String line = br.readLine();
	
			while(line != null) {
				String[] attributes = line.split(",");

				Teacher teacher = TeacherHelper.createTeacher(attributes);

				teacherRoster.add(teacher);
				line = br.readLine();
			}

		} catch (IOException ioe) {
            ioe.printStackTrace();
        }

		return teacherRoster;
	}
}