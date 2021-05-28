package collections;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;

public class SortStudents {

	public static void main(String[] args) throws Exception {

		var lines = Files.readAllLines(Path.of("c:\\classroom\\apr27\\students.txt"));
		var students = new TreeMap<Integer, String>();
		
		for (var line : lines) {
			var parts = line.split(",");
			students.put(Integer.parseInt(parts[0]), parts[1]);
		}

		for (var rollno : students.keySet()) {
			System.out.printf("%5d  %s\n", rollno, students.get(rollno));
		}
	}

}
