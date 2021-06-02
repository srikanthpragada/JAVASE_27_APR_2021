package advanced;

public class ListSystemProperties {

	public static void main(String[] args) {

        var properties = System.getProperties();
        
        for(var key : properties.keySet())
        	System.out.printf("%-30s %s\n", key, properties.get(key));

	}

}
