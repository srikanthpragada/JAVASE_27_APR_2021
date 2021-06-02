
import java.nio.file.Files;
import java.nio.file.Path;

public class SearchJavaPrograms {

	public static boolean fileContainsPattern(Path file, String pattern) {
		if (!file.toString().endsWith(".java"))
			return false;

		try {
			return Files.readString(file).contains(pattern);
		} catch (Exception ex) {
			return false;
		}
	}

	public static void main(String[] args) throws Exception {
		Path startdir = null;
		
		if (args.length == 0)
		{
			System.out.println("Usage : java SearchJavaPrograms pattern [startdir]");
			return;
		}

		try {
			if (args.length >= 2)
				startdir = Path.of(args[1]);
			else
				startdir = Path.of(System.getProperty("user.dir"));
			
			String pattern = args[0];
	        
			Files.walk(startdir)
			          .filter(p -> fileContainsPattern(p, pattern))
			          .forEach(System.out::println);
			
	     }
		 catch (Exception ex) {
				System.out.printf("Error: %s",ex.getMessage());
				return;
		 }
	}

}
