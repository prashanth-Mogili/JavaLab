import java.util.*;

public class TestDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of elements");
		int n=sc.nextInt();
		System.out.println("enter elements");
		Integer iarr[]=new Integer[n];
		for(int i=0;i<n;i++)
		   iarr[i]=sc.nextInt();
		Test<Integer> ob1 = new Test<Integer>(iarr);
		System.out.println("max number is :"+ob1.max());
		System.out.println("min number is :"+ob1.min());
	}
}
