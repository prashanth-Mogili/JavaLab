class A
{
	int i;
	A(int o)
	{
		i=o;
	}
	int getobj()
	{
		return i;
	}
	
}

class B<T> extends A
{
	T obj;
	B(T o1,int i)
	{
		super(i);
		obj=o1;
	}
	T getobj2()
	{
		return obj;
	}
}

public class Subclass
{
	public static void main(String args[])
	{
		B<String> b1 = new B<String>("CVR",1000);
		System.out.print(b1.getobj()+"  ");
		System.out.print(b1.getobj2());
		
		
	}
}

