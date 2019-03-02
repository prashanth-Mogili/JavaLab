class BoundedSum<T extends Number>
{
	T num1;
	T num2;
	public BoundedSum(T a,T b)
	{
		num1 = a;
		num2= b;
	}
	
	public double Sum()
	{
		return(num1.doubleValue() + num2.doubleValue() );
	}
}

public class BoundedSumDemo
{
	public static void main(String args[])
	{
		BoundedSum<Integer> o1 = new BoundedSum<Integer>(10,20);
		double d = o1.Sum();
		
		System.out.println("SUM="+d);
	}
}


	
	