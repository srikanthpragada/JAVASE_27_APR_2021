package advanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ListJavaPrograms {

	public static void main(String[] args) throws Exception {
		Path startdir = Path.of("c:\\classroom\\apr27");
		
		Files.walk(startdir)
		     .filter( p -> p.toString().endsWith(".java"))
		     .forEach(System.out::println);
	}

}
