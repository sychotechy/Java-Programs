import java.util.*;
import java.io.*;
public class FileTwoMain{
	public static void main(String[] args) throws IOException{
		try{
			String str = "File handling in java using file input and output stream";
			FileOutputStream fos = new FileOutputStream("fileout.txt");
			byte[] byteData = str.getBytes();
			fos.write(byteData);
			fos.close();
			
			FileInputStream fis = new FileInputStream("fileout.txt");
			int dataInt=0;
			while((dataInt=fis.read())!=-1){
				System.out.print((char)dataInt);
			}
			System.out.println("");
			fis.close();
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
	}
}
