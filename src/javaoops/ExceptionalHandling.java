package javaoops;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionalHandling {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int num1;
int num2;
int ans;

try {
	
	 num1= scan.nextInt();
	 num2=scan.nextInt();
	 ans=num1/num2;
	 
	 System.out.println("Division of Num1 and Num2 is "+ans);
}

catch(InputMismatchException e) {
	
	System.out.println("The given input is not acceptable");
}
catch(ArithmeticException e) {
	System.out.println("Arithmetic Exception occured");
}


	



scan.close();
	}

}
