import java.util.*;
import java.io.*;
public class FileMain{
	public static void main(String[] args) throws IOException{
		String str = "File handling in java";
		FileWriter fw = new FileWriter("output.txt");
		for(int i=0;i<str.length();i++){
			fw.write(str.charAt(i));
		}
		fw.close();
		
		
		int character;
		FileReader fr = null;
		try{
			fr = new FileReader("output.txt");
		}
		catch(FileNotFoundException fe){
			System.out.println(fe);
		}
		while ((character=fr.read())!=-1){
        	System.out.print((char)character); 
        }
        fr.close();
	}
}
