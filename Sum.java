import java.util.*;

public class Sum
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		//String s[] = in.nextLine.split(" ");
		int a=0,b=0;
		a= in.nextInt();
		b= in.nextInt();
		if(a<0 || b<9)
		{
			System.exit(0);
		}
		else
		{
			System.out.println(a+b);
		}
	}
}
