import java.util.*;

class HashMapDemo
{
	public static void main(String args[])
	{
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("aa",1000);
		hm.put("bb",2000);
		hm.put("cc",1500);
		hm.put("dd",2500);
		hm.put("ee",1300);
		System.out.println(hm);
		System.out.println(hm.put("cc",8000));
		Set c1= hm.keySet();
		System.out.println(c1);
		Collection c= hm.values();
		System.out.println(c);
		Set s1 = hm.entrySet();
		System.out.println(s1);
		
		Iterator<Map.Entry> itr=s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry me=itr.next();
			System.out.println(me.getKey()+"  "+me.getValue());
			if(me.getKey().equals("bb"))
			me.setValue(7000);
			
		}
		System.out.println(hm);
	}
	
}




		