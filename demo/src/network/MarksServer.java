package network;

import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MarksServer {

	public static int getMarks(int rollno, RandomAccessFile file) throws Exception {
		 int pos = (rollno - 1);
		 file.seek(pos);
		 return file.readByte();
	}

	public static void main(String args[]) throws Exception {
		var file = new RandomAccessFile("c:\\classroom\\marks.dat", "r");
		ServerSocket ss = new ServerSocket(3000, 10);
		System.out.println("Marks server is ready...");

		while (true) {
			Socket cs = ss.accept(); // wait for client
			var scanner = new Scanner(cs.getInputStream());
			var rollno = scanner.nextInt();  // read from client
			PrintWriter pw = new PrintWriter(cs.getOutputStream(), true);
			var marks = getMarks(rollno, file);
			pw.println(marks);   // send to client 
		} // end of while
	} // end of main

}
