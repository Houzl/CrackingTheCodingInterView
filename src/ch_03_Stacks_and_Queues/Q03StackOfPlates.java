package ch_03_Stacks_and_Queues;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Stack;

public class Q03StackOfPlates {
  static class StackOfPlates<T>{
    private LinkedList<Stack<T>> sop = new LinkedList<Stack<T>>();
    private Stack<T> currStack = new Stack<T>();
    private int capacity;
    
    StackOfPlates(int capacity){
      this.capacity = capacity;
    }
    
    void push(T item){
      if (currStack.size() < capacity){
        currStack.push(item);
      }
      else{
        sop.push(currStack);
        currStack = new Stack<T>();
        currStack.push(item);
      }
    }
    
    T pop(){
      if (currStack.isEmpty() && sop.isEmpty()) throw new EmptyStackException();
      while (currStack.isEmpty() && !sop.isEmpty()){
        currStack = sop.pop();
      }
      if (currStack.isEmpty()) throw new EmptyStackException();
      else{
        return currStack.pop();
      }
    }
    /**
     * 
     * @param index zero based.
     * @return
     */
    T popAt(int index){
      if (currStack.isEmpty() && sop.isEmpty()) throw new EmptyStackException();
      while (currStack.isEmpty() && !sop.isEmpty()){
        currStack = sop.pop();
      }
      if (index > sop.size()) throw new IllegalArgumentException();
      else if (index == sop.size()) return currStack.pop();
      else return sop.get(index).pop();
    }
  }
  
  
  public static void main(String[] args) {
    StackOfPlates<Integer> sop = new StackOfPlates<Integer>(1);
    sop.push(1);
    sop.push(2);
    System.out.println(sop.pop());
    System.out.println(sop.pop());
    sop.push(1);
    sop.push(2);
    System.out.println(sop.popAt(1));
    System.out.println(sop.popAt(0));
    System.out.println(sop.popAt(0));
  }
}
