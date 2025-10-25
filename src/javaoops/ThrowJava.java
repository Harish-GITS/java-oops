package javaoops;
import java.util.Scanner;

class NotValidException extends Exception{
	
	NotValidException(String s){
		
		super(s);
	}
}
public class ThrowJava {
public static void main(String[] args) {
	
	
	Scanner scan=new Scanner(System.in);
	scan.close();
	
	try{
		int age=scan.nextInt();
		
		if(age<18) {
			throw new NotValidException("Age can't be less than 1");
		}
		
	}
	catch(NotValidException e){
		
		System.out.println(e);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	finally {
		System.out.println("successfully validated");
	}
	
	scan.close();
}
}
