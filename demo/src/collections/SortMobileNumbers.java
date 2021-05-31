package collections;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class SortMobileNumbers {

	public static void main(String[] args) throws Exception {
		var mobiles = new TreeSet<String>();
		var path = Path.of("c:\\classroom\\apr27\\mobiles.txt");
		var pattern = Pattern.compile("\\D+");  // One or more non-digits 

		for (var line : Files.readAllLines(path)) {
			var numbers = pattern.split(line);
			mobiles.addAll(Arrays.asList(numbers));  // Convert array to list 
		}

		for (String mobile : mobiles)
			System.out.println(mobile);

	}

}
