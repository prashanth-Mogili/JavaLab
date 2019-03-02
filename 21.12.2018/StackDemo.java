import java.util.*;
class StackDemo{
  public static void main(String args[]){
    MyStack st=new MyStack(10);
    int ele;
    Scanner s=new Scanner(System.in);
    int c=1;
    while(c!=0){
    System.out.println("Menu\n1.push\n2.pop\n3.display\n");
    c=s.nextInt();
    switch(c){
       case 1:System.out.println("Enter element");
                    ele=s.nextInt();
                    if(st.isFull())
                        System.out.println("Stack is full"); 
                    else
                         st.push(ele);
                    break;
        case 2:if(st.isEmpty())
                       System.out.println("Stack is empty");
                     else{
                          ele=st.pop();
                             System.out.println("poppedelement="+ele);
                      }
                      break;
         case 3:st.display();
                      break;
         default:System.out.println("Invalid choice");
    }
    System.out.println("Do you want to continue?(0/1)");
    c=s.nextInt();
  }
}
}