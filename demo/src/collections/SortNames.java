package collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class SortNames {

	public static void main(String[] args) throws Exception {
		var names = new ArrayList<String>();

		var fr = new FileReader("c:\\classroom\\apr27\\names.txt");
		var br = new BufferedReader(fr);

		while (true) {
			String name = br.readLine();
			if (name == null)
				break;

			names.add(name);
		}

		fr.close();
		br.close();

		Collections.sort(names);

		for (String name : names)
			System.out.println(name);

	}

}
