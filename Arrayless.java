package one;
import java.util.*;

public class Arrayless {

	public static void main(String[] args) {
		
		int sum=0;
		double avg;
		Scanner sc=new Scanner(System.in);
		int array[]=new int[10];
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Enter number "+(i+1)+" ");
			array[i]=sc.nextInt();
		}
		for(int j=0;j<array.length;j++)
		{
			sum=sum+array[j];
		}
		avg=sum/array.length;
		System.out.println("The average is : "+avg);
		System.out.println("The numbers less than the average are : ");
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<avg)
			{
				System.out.println(array[i]);
			}
		}
	}
	
}
	
