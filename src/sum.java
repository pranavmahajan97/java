import java.util.*;
public class sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean x = true;
		while(x)
		{
			int a=0;
			int b=0;
			System.out.println("Enter first no.");
			try 
			{
			 a  = Integer.parseInt(sc.nextLine());
			}
			catch(NumberFormatException e)
			{
				System.out.println("Please Enter a number");
				a  = Integer.parseInt(sc.nextLine());
			}
			System.out.println("Enter second no.");
			try 
			{
			 b  = Integer.parseInt(sc.nextLine());
			}
			catch(NumberFormatException e)
			{
				System.out.println("Please Enter a number");
				b  = Integer.parseInt(sc.nextLine());
			}
			System.out.println("Sum is" + (a+b));
			System.out.println("Do you want to continue?(Y/N)" );
			String c = sc.next();
			if(c.equals("n"))
			{
				x=false;
				sc.close();
				break;			
			}
			
		}
	}

}
