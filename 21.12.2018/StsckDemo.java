import java.util.*
public class Mystack{
  public int array[];
  public int size[];
  private int top[];
  public Mystick(int s){
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
 public void tostring(){
    for(int i=top;i>-1;i--)
    Sysytem.out.println("array[i]");
 }
}

class StackDemo{
  public static void main(String args[]){
    Mystack st=new Mystack();
    int ele;
    scanner s=new scanner(System.in);
    int c;
    while(c){
    Sysytem.out.println("Menu\n1.push\n2.pop\n3.display\n");
    c=s.nextInt();
    Switch(c){
       case 1:Sysytem.out.println("Enter element");
                    ele=s.nextInt();
                    if(st.isFull)
                        System.out.println("Stackn is full"); 
                    else
                         st.push(ele);
                    break;
        case 2:if(st.isEmpty)
                       System.out.println("Stack is empty");
                     else{
                          st.pop();
                             System.out.println("poppedelement="+ele);
                      }
                      break;
         case 3:st.tostring();
                      break;
         default:System.out.println("Invalid choice");
    }
    System.out.println("Do you want to continue?(0/1)");
    c=nextInt();
  }
}
