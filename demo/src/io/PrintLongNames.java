package io;

import java.io.BufferedReader;
import java.io.FileReader;

public class PrintLongNames {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("names.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;

		while (true) {
			line = br.readLine();
			if (line == null) // EOF
				break;

			if (line.length() > 4)
				System.out.println(line);
		}

		br.close();
		fr.close();
	}

}
