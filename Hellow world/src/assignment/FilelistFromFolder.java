package assignment;
import java.io.File;
public class FilelistFromFolder {

	public static void main(String[] args) {
		//ToDo Auto-generated method stub
		File file = new File("C:/");
		String[] str = file.list();
		for(String string:str){
			System.out.println(string);
		}

	}

}
