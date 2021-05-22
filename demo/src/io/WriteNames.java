package io;

import java.io.FileWriter;

public class WriteNames {

	public static void main(String[] args) throws Exception {
		var fw = new FileWriter("langs.txt");

		String names[] = {"Java", "JavaScript", "Python", "C#", "TypeScript", "C" };

		for (String name : names)
			fw.write(name + "\n");

		fw.close();
	}

}
