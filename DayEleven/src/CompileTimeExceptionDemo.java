import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CompileTimeExceptionDemo {

	public static void main(String[] args) {
		FileInputStream fis=null;
		//java.lang.Error: Unresolved compilation problems:
	//	FileNotFoundException
		try {
			fis = new FileInputStream("D:/myfile.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Un-handled exception type FileNotFoundException
		int k;
		try {
			while((k=fis.read())!=-1) {
				System.out.print((char)k);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
