package network;

import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MarksClient {

	public static void main(String[] args) throws Exception {
		Socket cs = new Socket("localhost", 3000); // connect to server
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter rollno : ");
		int rollno = keyboard.nextInt();

		var output = new PrintWriter(cs.getOutputStream(), true);
		output.println(rollno);  // send to server

		// get stream to read data from server
		InputStream is = cs.getInputStream();
		// Use Scanner to read a line
		Scanner scanner = new Scanner(is);
		String marks = scanner.nextLine();  // Read from server 
		System.out.printf("Marks : %s\n", marks);
		cs.close();
		keyboard.close();
	}

}
