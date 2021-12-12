package edu.neu.csye6200.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import edu.neu.csye6200.model.Student;
import edu.neu.csye6200.model.Teacher;

public class Utilities {

	public static int calAge(String birthdate){
		String[] date = birthdate.split("-");
		int year = Integer.parseInt(date[0]);
		int month = Integer.parseInt(date[1]);
		LocalDate now = LocalDate.now();
		return 12 * (now.getYear() - year - 1) + (12 - now.getMonthValue()) + month;
	}
}