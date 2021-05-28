package collections;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeSet;

public class SortEmails {

	public static void main(String[] args) throws Exception {

		var lines = Files.readAllLines(Path.of("c:\\classroom\\emails.txt"));
		var sortedEmails = new TreeSet<String>();
		
		for(var line : lines) {
			for(var email : line.split(","))
				 sortedEmails.add(email.strip());
		}
		
		for(var email : sortedEmails)
			System.out.println(email);

	}

}
