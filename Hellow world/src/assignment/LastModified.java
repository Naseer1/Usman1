package assignment;
import java.io.File;
import java.text.SimpleDateFormat;
public class LastModified {

	public static void main(String[] args) {
		//Specify the file path and name
		File file = new File("C:\\Myfile.text");
		
		SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy HH:MM:SS");
		System.out.println("Last Modified Date:" + sdf.format(file.lastModified()));
		

	}

}
