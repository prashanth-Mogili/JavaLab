import java.util.*;

public class Myqueue_generics<T>
{
	 T array[];
	int front,rear,size;
	
	public Myqueue_generics(int size)
	{
		this.size=size;
		front=-1;
		rear=-1;
		array=(T[])new Object[size];
	}
	public void Enqueue(T ele)
	{
		array[++rear]=ele;
	}
	
	public T Dequeue()
	{
		if(front==-1)
		  front=0;
	    
		  return array[front++];
	}
	
	public boolean isFull()
	{
		return(rear==size-1);
	}
	
	public boolean isEmpty()
	{
		return (rear==-1 || front > rear);
	}
	public void Display()
	{
		if(front==-1)
			front=0;
		
			System.out.println(Arrays.toString(array));
	}
}

			
		
		
	
		