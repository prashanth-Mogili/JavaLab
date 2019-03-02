class Test1<T>
{
	T arr[];
	Test1(int size)
	{
		arr=(T[]) new Object[size];
	}
	
	void display()
	{
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String args[])
	{
		Test1<Integer> t= new Test1<Integer>(10);
		t.display();
	}
}

