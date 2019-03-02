import java.util.*;
public class MyStack{
  public int array[];
  public int size;
  private int top;
  public MyStack(int s){
    size=s;
    array=new int [size];
    top=-1;
  }
  public void push(int ele){
    array[++top]=ele;
  }
  public int pop(){
    return(array[top--]);
  }
  public boolean isEmpty(){
    return(top==-1);
  }
 public boolean isFull(){
   return(top==size-1);
 }
 public void display(){
   
    System.out.println(Arrays.toString(array));
 }
}