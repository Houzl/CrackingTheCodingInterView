package ch_03_Stacks_and_Queues;

import java.util.Iterator;
import java.util.Stack;

public class Q05SortStack {
  static Stack<Integer> sortStack(Stack<Integer> s){
    Stack<Integer> st1 =  new Stack<Integer>();
    Stack<Integer> st2 =  new Stack<Integer>();
    st1.push(s.pop());
    while (!s.isEmpty()){
      while (!st1.isEmpty() && s.peek() < st1.peek()){
        st2.push(st1.pop());
      }
      st1.push(s.pop());
      while (!st2.isEmpty()){
        st1.push(st2.pop());
      }
    }
    return st1;
  }
  
  static void printStack(Stack<?> s){
    Iterator<?> it = s.iterator();
    while(it.hasNext()){
      System.out.print(it.next() + ", ");
    }
    System.out.println();
    
  }

  public static void main(String[] args) {
    Stack<Integer> s = new Stack<Integer>();
    s.push(1);
    s.push(3);
    s.push(2);
    s.push(10);
    s.push(1);
    s.push(3);
    s.push(2);
    s.push(10);
    printStack(s);
    printStack(sortStack(s));

  }

}
