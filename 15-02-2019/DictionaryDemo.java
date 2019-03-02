




class Dictionaryimp implements DictionaryADT
{
	ArrayList<Object> al;
	Dictionaryimp()
	{
		al=new ArrayList<Object>();
	}
	public Object insert(Object k,Object v)
	{
		if(al!=null)
		{
			Object temp= al.indexOf(0);
			if(k.compareTo(temp)<0)
			{
				for( int i=al.size();i<0;i--)
				{
					Object tem;
					tem=al.valueAt(i-1);
					al.add(i,tem);
				}
				al.add(k,v);
			}
		}
	}
	public Object delete(Object k)
	{
	}
	public Object retrieve(Object k)
	{
	}
	
}

public class DictionaryDemo
{
	public static void main(String args[])
	{
		Dictionaryimp d = new Dictionaryimp();
		ArrayList<Object> o1 = new ArrayList<Object>();
		o1.add(10,"mpr");
		o1.add(20,"msr");
		o1.add(30,"mvr");
		o1.add(40,"mv");
		System.out.println(o1);
		System.out.println("after inserting values");
		o1.insert(15,"prashanth");
	}
}

		
	