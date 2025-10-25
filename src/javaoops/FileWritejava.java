package javaoops;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class FileWritejava {
	public static void main(String[] args) {
		
		try {
			FileWriter fw=new FileWriter("txt-file",true);
			BufferedWriter bf=new BufferedWriter(fw);
			bf.write("Are you learning java programming language?");
			bf.newLine();
			bf.write("Is it easy to learn the OOPS concept in that?");
			bf.append("Can you help me to with you");
			bf.close();
			System.out.println("Successfully written");
		    }
		catch(Exception e){
			System.out.println(e);
		}	
		
	}
}
