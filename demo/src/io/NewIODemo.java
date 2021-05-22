package io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewIODemo {

	public static void main(String[] args) {
		Path path = Paths.get("c:\\classroom\\nov30j");
		System.out.println(Files.exists(path));

	}

}
