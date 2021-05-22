package network;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class Download {

	public static void main(String[] args) throws Exception {
	 	URL urlobj = new URL("http://www.srikanthtechnologies.com/banner.jpg");
		InputStream is = urlobj.openStream();
		FileOutputStream fo = new FileOutputStream("c:\\classroom\\st.jpg");
		int ch = is.read();
		int count = 0;
		while (ch != -1) {
			fo.write(ch);
			ch = is.read();
			count ++;
		}
		fo.close();
		is.close();
		System.out.printf("Downloaded %d bytes!", count);
	}

}
