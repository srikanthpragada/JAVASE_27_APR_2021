package io;

import java.io.FileWriter;

public class WriteNamesArm {

	public static void main(String[] args) {
		// Try with resources
		try (FileWriter fw = new FileWriter("langs.txt")) {
			String names[] = { "Java", "JavaScript", "Python", "C#", "TypeScript", "C" };
			for (String name : names)
				fw.write(name + "\n");
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
