package collections;

import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		Properties p = new Properties();
		p.setProperty("name", "Srikanth");

		for (var k : p.keySet()) {
			System.out.printf("%s  - %s", k, p.getProperty((String) k));
		}

	}
}
