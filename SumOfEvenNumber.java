package basicprogram;
import java.util.Scanner;
public class SumOfEvenNumber {

	public static void main(String[] args[])
		{
			int i,j, N,sum=0;
			Scanner sc=new Scanner(System.in);
			
			//input number from user
			System.out.println("Enter number to N:");
			N=sc.nextInt();
		
	for(i=2;i<N;i+=2)
	 sum+=i;
		}
	System.out.println("The sum of even numbers: "+sum):
		}
	}

}
