import java.util.Scanner;

public class Total {

	public static void main(String[] args) {
		int Number=1;
		int total=0;
		int Count=5;
			while(Number<=Count) {
			Scanner Sc=new Scanner(System.in);
			System.out.println("Enter the Number  = ");
			int Number1=Sc.nextInt();
total=total +Number1;
Number++;

		}
 System.out.println("Total is "+ total);
	}

}
