import java.util.*;

public class BoundedExample<T extends Number>
{
	T array[];
	int size;
	public BoundedExample(T obj[])
	{
		array=obj;
		size=obj.length;
	}
	
	public double avg(){
		double sum=0.0;
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
			return (sum/size);
		}
	}
	
}

public class BoundedExampleDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int n= sc.nextInt();
		Integer iarr[]=new Integer[n];
		for(int i=0;i<n;i++)
		{
	      iarr[i]=scan.nextInt();
		}
		
		BoundedExample<Integer> o1= new BoundedExample<Integer>(iarr);
		double avg= o1.avg();
		System.out.println("average="+avg);
	}
}
