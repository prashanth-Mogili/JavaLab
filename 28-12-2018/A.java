import java.util.*;
class A{
	int arr[];
	
	   A()
	   {
		   arr= new int[5];
	   }
	   void display()
	   {
		   System.out.println(Arrays.toString(arr));
	   }
	   
	   public static void main(String args[])
	   {
		   A a= new A ();
		   a.display();
	   }
}
