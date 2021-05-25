package network;

import java.io.RandomAccessFile;

public class WriteMarks {

	public static void main(String[] args) throws Exception {
		 var file = new RandomAccessFile("c:\\classroom\\marks.dat","rw");
		 
		 for(int i = 0; i < 20; i ++)
		 {
			 byte marks = (byte)  Math.round(Math.random() * 100);
			 file.writeByte(marks);
		 }
		 
         file.close(); 
	}

}
