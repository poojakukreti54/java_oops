package myNewPackage;
import java.io.IOException;
import java.io.File;

public class FileManipulation {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean res; 
		boolean var1;
		var1=false;
		File f = new File("C:\\Users\\ThisPc\\poojaworkfolder\\java\\file_project\\New_File.txt");
		try {
			res=f.createNewFile();
			if(res) {
				System.out.println("File created here"+f.getCanonicalPath());
			}
				
			else {
				System.out.println("File already exists "+f.getCanonicalPath());
			}
		}
		catch (IOException e) {
			System.out.println("Error!!!");
			
		}
		finally {
			System.out.println("End of program");;
		}
		System.out.println("File Deleted" +var1);
		var1 = f.delete();
		System.out.println("File Deleted" +var1);
		
	}

}