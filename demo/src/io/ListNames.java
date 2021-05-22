package io;

import java.io.FileReader;
import java.io.LineNumberReader;

public class ListNames {

	public static void main(String[] args) {
		// Try with resources or ARM
		try (var fr = new FileReader("c:\\classroom\\apr27\\names.txt")) {
			var br = new LineNumberReader(fr);

			while (true) {
				String line = br.readLine();
				if (line == null) // EOF
					break;
				System.out.printf("%4d: %s - %d\n", br.getLineNumber(), line, line.length());
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
