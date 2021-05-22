package io;

import java.io.FileReader;

public class ReadNames2 {

	public static void main(String[] args) {
		// Try with resources or ARM
		try (var fr = new FileReader("c:\\classroom\\apr27\\names.txt")) {
			int ch;

			while (true) {
				ch = fr.read();
				if (ch == -1) // EOF
					break;
				System.out.print((char) ch);
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
