package ismtrain;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\shubham\\Desktop\\ism training\\shubham.txt");
		
		   fos.write('S');
		   fos.write('h');
		   fos.write('u');
		   fos.write('b');
		   fos.write('h');
		   fos.write('a');
		   fos.write('m');
		   fos.close();
		   System.out.println("successfully inserted the given value .....");
		  
	}
}
