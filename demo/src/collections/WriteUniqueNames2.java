package collections;

import java.io.FileWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class WriteUniqueNames2 {

	public static void main(String[] args) throws Exception {
		var names = new TreeSet<String>();
		var file = new FileWriter("sortednames.txt");
		var scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter name [end to stop] :");
			var name = scanner.nextLine();
			if (name.equals("end"))
				break;

			names.add(name);
		}

		for (var name : names) {
			file.write(name + "\n");
		}

		file.close();
	}
}
