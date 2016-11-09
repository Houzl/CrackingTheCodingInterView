package ch_03_Stacks_and_Queues;

import java.util.EmptyStackException;

public class Q02StackMin {
  //Main structure of MyStack comes from CtCI page 96
  static class MyStack<T extends Comparable<T>>{
    class StackNode<K> {
      private K data;
      //The minimum from first element.
      private K min;
      private StackNode<K> next;

      public StackNode(K data, K min) {
        this.data = data;
        this.min = min;
      }
    }

    private StackNode<T> top;
    
    public T pop(){
      if (top == null) throw new EmptyStackException();
      T item = top.data;
      top = top.next;
      return item;
    }
    
    public void push(T item){
      //Get the minimum from first element.
      T min;
      if (top == null) min = item;
      else {
        if (item.compareTo(top.min) > 0) min = top.min;
        else min = item;
      }
      StackNode<T> t = new StackNode<T>(item, min);
      t.next = top;
      top = t;
    }
    
    public T peek(){
      if (top == null) throw new EmptyStackException();
      return top.data;
    }
    
    public boolean isEmpty(){
      return top == null;
    }
    
    public T min(){
      if (top == null) throw new EmptyStackException();
      return top.min;
    }
    
  }

  public static void main(String[] args) {
    MyStack<Integer> ms = new MyStack<Integer>();
    ms.push(9);
    System.out.println(ms.peek());
    System.out.println(ms.min());
    ms.push(10);
    System.out.println(ms.peek());
    System.out.println(ms.min());
    ms.pop();
    System.out.println(ms.peek());
    System.out.println(ms.min());
    ms.push(10);
    System.out.println(ms.peek());
    System.out.println(ms.min());
    ms.push(10);
    System.out.println(ms.peek());
    System.out.println(ms.min());
    ms.push(10);
    System.out.println(ms.peek());
    System.out.println(ms.min());
    ms.push(10);
    System.out.println(ms.peek());
    System.out.println(ms.min());
    ms.push(1);
    System.out.println(ms.peek());
    System.out.println(ms.min());
    ms.push(9);
    System.out.println(ms.peek());
    System.out.println(ms.min());
    ms.push(10);
    System.out.println(ms.peek());
    System.out.println(ms.min());
    ms.pop();
    System.out.println(ms.peek());
    System.out.println(ms.min());
    ms.push(10);
    System.out.println(ms.peek());
    System.out.println(ms.min());
    ms.push(10);
    System.out.println(ms.peek());
    System.out.println(ms.min());
    ms.push(10);
    System.out.println(ms.peek());
    System.out.println(ms.min());
    ms.push(10);
    System.out.println(ms.peek());
    System.out.println(ms.min());
    ms.pop();
    System.out.println(ms.peek());
    System.out.println(ms.min());
    ms.pop();
    System.out.println(ms.peek());
    System.out.println(ms.min());
    ms.pop();
    System.out.println(ms.peek());
    System.out.println(ms.min());
    ms.pop();
    System.out.println(ms.peek());
    System.out.println(ms.min());
    ms.pop();
    System.out.println(ms.peek());
    System.out.println(ms.min());
    ms.pop();
    System.out.println(ms.peek());
    System.out.println(ms.min());
  }

}
