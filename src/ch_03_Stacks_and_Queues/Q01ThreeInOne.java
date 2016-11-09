/**
 * 
 */
package ch_03_Stacks_and_Queues;

/**
 * @author houzl
 *
 */
public class Q01ThreeInOne {
  static class ThreeInOne<T>{
    private final T[] array; 
    private final int capacity;
    //The start index for stack 1 is 0.
    private int stack1LastIndex = -1;
    private int stack1size = 0;
    //The start index for stack 2 is stack1LastIndex + 1
    private int stack2LastIndex = -1;
    private int stack2size = 0;
    //From end to start.
    private int stack3LastIndex = 0;
    private int stack3size = 0;
    
    @SuppressWarnings("unchecked")
    public ThreeInOne(int capacity){
      array = (T[]) new Object[capacity];
      this.capacity = capacity;
      this.stack3LastIndex = capacity;
    }
    
    void push(int numOfStack, T t) throws Exception{
      int occupied = stack1size + stack2size + stack3size;
      if (occupied >= capacity) {
        throw new Exception("Stack is full");
      }
      if (numOfStack == 1){
        stack1LastIndex++;
        stack1size++;
        for (int i = stack2LastIndex + 1; i > stack1LastIndex; i--){
          array[i] = array[i - 1];
        }
        array[stack1LastIndex] = t;
        stack2LastIndex++;
      }
      if (numOfStack == 2){
        stack2LastIndex++;
        stack2size++;
        array[stack2LastIndex] = t;
      }
      if (numOfStack == 3){
        stack3LastIndex--;
        stack3size++;
        array[stack3LastIndex] = t;
      }
    }
    T pop(int numOfStack) throws Exception{
      T tmp;
      switch (numOfStack){
        case 1:
          if (stack1size > 0){
            tmp = array[stack1LastIndex];
            for (int i = stack1LastIndex; i < stack1LastIndex + stack2size; i++){
              array[i] = array[i+1];
            }
            array[stack2LastIndex] = null;
            stack1LastIndex--;
            stack2LastIndex--;
            stack1size--;
            }
          else{
            tmp = null;
          }
          return tmp;
        case 2:
          if (stack2size > 0){
            tmp = array[stack2LastIndex];
            array[stack2LastIndex] = null;
            stack2LastIndex--;
            stack2size--;
          }
          else{
            tmp = null;
          }
          return tmp;
        case 3:
          if (stack3size > 0){
            tmp = array[stack3LastIndex];
            array[stack3LastIndex] = null;
            stack3LastIndex++;
            stack3size--;
          }
          else{
            tmp = null;
          }
          return tmp;
        default:
          throw new Exception("Wrong argument.");
      }
    }
    
    boolean isEmpty(int numOfStack) throws Exception{
      switch (numOfStack){
        case 1:
          return stack1size == 0;
        case 2:
          return stack2size == 0;
        case 3:
          return stack3size == 0;
        default:
          throw new Exception("Wrong argument.");
      }
    }
    
    T peek(int numOfStack) throws Exception{
      T tmp;
      switch (numOfStack){
        case 1:
          if (stack1size > 0){
            tmp = array[stack1LastIndex];
            }
          else{
            tmp = null;
          }
          return array[stack2LastIndex];
        case 2:
          if (stack2size > 0){
            tmp = array[stack2LastIndex];
          }
          else{
            tmp = null;
          }
          return tmp;
        case 3:
          if (stack3size > 0){
            tmp = array[stack3LastIndex];
          }
          else{
            tmp = null;
          }
          return tmp;
        default:
          throw new Exception("Wrong argument.");
      }
    }
    
    void print(){
      for(int i = 0; i < array.length; i++) System.out.print(array[i] + ", ");
      System.out.println();
    }
  }
  
  public static void main(String[] args) throws Exception {
    ThreeInOne<Integer> tio = new ThreeInOne<Integer>(10);
    tio.push(1, 1);
    tio.push(1, 1);
    tio.push(1, 1);
    
    tio.print();
    System.out.println(tio.peek(1));
    tio.push(2, 2);
    
    tio.print();
    System.out.println(tio.peek(2));
    tio.push(3, 3);
    
    tio.print();
    System.out.println(tio.peek(3));
    tio.pop(1);
    tio.print();
    tio.pop(2);
    tio.print();
    tio.pop(3);
    tio.print();
    tio.push(3, 3);
    tio.push(3, 3);
    tio.push(3, 3);
    tio.push(3, 3);
    tio.print();
    tio.push(2, 2);
    tio.push(2, 2);
    tio.push(2, 2);
    tio.push(2, 2);
    tio.print();
  }
}
