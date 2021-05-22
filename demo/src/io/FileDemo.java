package io;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		File f = new File("names.txt");
		System.out.println(f.exists());
		System.out.println(f.length());
		
		File dir = new File("c:\\classroom\\nov30j");
		System.out.println(dir.isDirectory());

	}

}
