class A<T>
{
	T obj;
	A(T o)
	{
		obj=o;
	}
	T getobj()
	{
		return obj;
	}
}

class B<T> extends A<T>
{
	B(T o1)
	{
		super(o1);
	}
}

class C<T ,V > extends A<T>
{
	V obj2;
	C(T o1,V o2)
	{
		super(o1);
		obj2=o2;
	}
	V getobj2()
	{
		return obj2;
	}
	
}

public class Heirarchies
{
	public static void main(String args[])
	{
		B<Integer> b1= new B<Integer>(100);
		System.out.println(b1.getobj());
		C<String,Integer> c1 = new C<String,Integer>("peta",1000);
				System.out.print(c1.getobj()+"  ");
				System.out.println(c1.getobj2());

	}
}














