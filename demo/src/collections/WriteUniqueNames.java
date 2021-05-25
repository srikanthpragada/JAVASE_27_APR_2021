package collections;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WriteUniqueNames {

	public static void main(String[] args) throws Exception {
		var names = new ArrayList<String>();
		var file = new FileWriter("sortednames.txt");
		var scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter name [end to stop] :");
			var name = scanner.nextLine();
			if (name.equals("end"))
				break;

			if (!names.contains(name))
				names.add(name);
		}

		Collections.sort(names);

		for (var name : names) {
			file.write(name + "\n");
		}

		file.close();
	}
}
