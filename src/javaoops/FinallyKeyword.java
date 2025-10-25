package javaoops;
import java.util.Scanner;
public class FinallyKeyword {

	public static void main(String[] args) {
		
		int err=0;
		int a=0;
		Scanner input=new Scanner(System.in);
		
input.close();
		try {
			a=input.nextInt(); 
		
				err=0;
		}
		catch(Exception e){
			err=1;
			
		}
		finally {
			
			if(err==0) {
				System.out.println("Error Not Found a = "+a);
			}
			else {
				System.out.println("Error Found in your input");
			}
		}
		
input.close();
		
	}

}
