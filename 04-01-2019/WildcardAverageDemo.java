import java.util.*;

public class WildcardAverageDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array for integers");
		int n= sc.nextInt();
		Integer inums[] = new Integer [n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
		 inums[i]=sc.nextInt();
		 WildcardAverage<Integer> iobj =new WildcardAverage<Integer>(inums);
		 double v= iobj.average();
		 Double dnums[] = {10.0,11.0,12.0,13.0};
		 WildcardAverage<Double> dobj= new WildcardAverage<Double>(dnums);
		 double u = dobj.average();
		 if(iobj.sameAvg(dobj))
		   System.out.println("both are same");
	     else
		  System.out.println("both are different");
	}
}

		