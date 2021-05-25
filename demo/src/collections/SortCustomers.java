package collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.TreeMap;

public class SortCustomers {

	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("c:\\classroom\\nov30j\\customers.txt");
		BufferedReader br = new BufferedReader(fr);
		var customers = new TreeMap<String, String>();
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			var parts = line.split(",");
			if (parts.length > 1)
				customers.put(parts[0], parts[1]);
		}
		br.close();

		for (String name : customers.keySet()) {
			System.out.printf("%-20s  %s\n", name, customers.get(name));
		}
	}

}
