 interface MinMax<T extends Comparable<T>>
{
	public T min();
	public T max();
}

class Test<T extends Comparable <T>> implements MinMax<T>
{
	T arr[];
	public Test(T o[])
	{
		arr=o;
	}
	
	 public T min()
	{
		T value = arr[0];
		for(int i=1;i<arr.length;i++)
		 if(value.compareTo(arr[i])>0)
			 value=arr[i];
		 return value;
	}
	
	 public T max()
	{
		T value = arr[0];
		for(int i=1;i<arr.length;i++)
		 if(value.compareTo(arr[i])<0)
			 value=arr[i];
		 return value;
	}
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	