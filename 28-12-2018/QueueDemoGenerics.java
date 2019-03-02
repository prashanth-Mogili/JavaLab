import java.util.*;
                                                                 
public class QueueDemoGenerics
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the queue:");
		int n=sc.nextInt();
		Myqueue_generics<Float> obj = new Myqueue_generics<Float>(n);
		int c=0,choice;
		do
		{
			System.out.println("1.enqueue\n 2.dequeue\n 3.display \n enter your choice:");
			c=sc.nextInt();
			switch(c)
			{
				case 1: if(obj.isFull()==true)
					      System.out.println("Queue Overflow...!!");
				        else
						{
							System.out.println("enter element:");
							 int temp=sc.nextInt();
							obj.Enqueue(temp);
						}
						break;
				case 2:  if(obj.isEmpty()==true)
					      System.out.println("Queue Underflow...!!");
				        else
						{
							System.out.println("Element removed is:"+obj.Dequeue());
						}
						break;
				case 3: System.out.println("Queue is:");
				        obj.Display();
						break;
			    default:break;
			}
			System.out.println("do you want to continue\n press(1/0)?");
			 choice=sc.nextInt();
			
		}while(choice==1);
	}
}

