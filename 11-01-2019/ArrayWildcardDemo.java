import java.util.*;
 class ArrayWildcard
{
	public double Sumoflist(ArrayList<? extends Number> list)
	{
		double sum=0.0;
		for(Number i:list)
		{
					System.out.println(i);
			sum+=i.doubleValue();
			
		}
		return sum;
	}
}

public class ArrayWildcardDemo
{
	public static void main(String args[])
	{
		ArrayList<Integer> iarr = new ArrayList<Integer>();
		iarr.add(10);
	    		iarr.add(20);
						iarr.add(30);
					//	System.out.println(Arrays.toString(iarr.toArray()));
		ArrayWildcard aw = new ArrayWildcard();
        System.out.println("sum of list"+aw.Sumoflist(iarr));
	}
}
	