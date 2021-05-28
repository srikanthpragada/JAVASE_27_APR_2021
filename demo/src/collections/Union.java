package collections;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;

public class Union {

	public static void main(String[] args) throws Exception {
   
		var lines = new LinkedHashSet<String>(Files.readAllLines(Path.of("c:\\classroom\\names1.txt")));
		lines.addAll(Files.readAllLines(Path.of("c:\\classroom\\names11.txt")));
		
		for(var l : lines)
			System.out.println(l);
		
		
	}

}
