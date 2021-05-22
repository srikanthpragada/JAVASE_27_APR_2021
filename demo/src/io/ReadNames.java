package io;

import java.io.FileReader;

public class ReadNames {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("c:\\classroom\\apr27\\names.txt");
		int ch;

		while(true)
		{
			ch = fr.read();
			if (ch == -1)  // EOF
				break;
			System.out.print( (char) ch);
		}
		fr.close();
	}

}
