package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewIODemo {

	public static void main(String[] args) throws IOException {
		Path file = Path.of("names.txt");
		System.out.println(file.getClass());
		// Files.delete(file);
		
		Path path = Path.of("c:\\classroom\\apr27");
		System.out.println(Files.exists(path));

	}

}
