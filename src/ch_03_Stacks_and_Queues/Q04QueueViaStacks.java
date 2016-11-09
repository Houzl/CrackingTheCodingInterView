package ch_03_Stacks_and_Queues;

import java.util.NoSuchElementException;
import java.util.Stack;

public class Q04QueueViaStacks {
  static class MyQueue<T>{
    Stack<T> sIn = new Stack<T>();
    Stack<T> sOut = new Stack<T>();
    
    void add(T item){
      while (!sOut.isEmpty()){
        sIn.push(sOut.pop());
      }
      sIn.push(item);
      while (!sIn.isEmpty()){
        sOut.push(sIn.pop());
      }
    }
    
    T remove(){
      if (sOut.empty()) throw new NoSuchElementException();
      return sOut.pop();
    }
    
    T peek(){
      return sOut.peek();
    }
    
    boolean isEmpty(){
      return sOut.isEmpty();
    }
    
  }
  public static void main(String[] args) {
    MyQueue<Integer> my = new MyQueue<Integer>();
    my.add(1);
    my.add(2);
    my.add(3);
    my.add(4);
    System.out.println(my.peek());
    System.out.println(my.remove());
    System.out.println(my.peek());
    System.out.println(my.remove());
    System.out.println(my.peek());
    System.out.println(my.remove());
    System.out.println(my.peek());
    System.out.println(my.remove());
    

  }

}
