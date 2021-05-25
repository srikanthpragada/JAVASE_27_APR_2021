package collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.TreeMap;

public class MarksList {

	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("c:\\classroom\\nov30j\\marks.txt");
		BufferedReader br = new BufferedReader(fr);
		var students = new TreeMap<Integer, Integer>();
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			var parts = line.split(",");
			if (parts.length < 2)
				continue;
			
			// Process
			int rollno = Integer.parseInt(parts[0]);
			int marks = Integer.parseInt(parts[1]);
			// Do we have this rollno in Map
			if (students.containsKey(rollno)) {
				 var total = students.get(rollno);
				 total += marks;
				 students.put(rollno, total);  // Update existing entry
			}
			else
			     students.put(rollno,marks);   // Add new entry 
		}
		br.close();

		for (Integer rollno : students.keySet()) {
			System.out.printf("%5d  %5d\n", rollno, students.get(rollno));
		}
	}

}
