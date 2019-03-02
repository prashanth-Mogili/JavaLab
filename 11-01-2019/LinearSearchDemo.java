import java.util.*;

class  LinearSearch
{
	public <T> boolean isIn(T arr[],T ele)
	{
		for(int i=0;i<arr.length;i++)
		
			if(ele.equals(arr[i]))
				return true;
			
				return false;
		
		
		
	}
}

public class LinearSearchDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of elements");
		int n=sc.nextInt();
		System.out.println("enter elements");
		Integer iarr[]=new Integer[n];
		LinearSearch ls = new LinearSearch();
		if(ls.isIn(inums,10))
			System.out.println("element available");
		else
			System.out.println("element not available");
	}
}

