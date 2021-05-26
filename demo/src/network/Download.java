package network;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class Download {

	public static void main(String[] args) throws Exception {
	 	URL urlobj = new URL("http://www.srikanthtechnologies.com/banner.jpg");
		InputStream is = urlobj.openStream();
		FileOutputStream fo = new FileOutputStream("c:\\classroom\\st.jpg");
	
		int count = 0;
		while (true) {
			int ch = is.read();
			if(ch == -1)
				break;
			fo.write(ch);
		    count ++;
		}
		
		fo.close();
		is.close();
		System.out.printf("Downloaded %d bytes!", count);
	}

}
