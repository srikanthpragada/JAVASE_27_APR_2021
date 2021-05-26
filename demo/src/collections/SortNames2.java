package collections;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;

public class SortNames2 {

	public static void main(String[] args) throws Exception {
		Path path = Path.of("c:\\classroom\\apr27\\names.txt");
		var names = Files.readAllLines(path);

		Collections.sort(names);

		for (String name : names)
			System.out.println(name);

	}

}
