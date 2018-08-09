
import java.util.Scanner;

public class exp1 {
	public static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		int i;
 sc = new Scanner(System.in);
			int n=15;
			int[] a=new int[n];
			System.out.println("enter array values");
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			
			}
			for(i=0;i<n;i++)
			{
				if(a[i]%3==0)
				{
					System.out.println("the no of divisible by 3 is:"+a[i]);
					flag++;
				}
				
			}
		    if(flag==0)
		    	System.out.print("No number divisible by 3");
	}

}
