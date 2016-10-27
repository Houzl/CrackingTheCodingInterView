package utility;

public class SinglyLinkedList {
  public static void printForward(SinglyLinkedListNode head){
    SinglyLinkedListNode pointer = head;
    while (pointer != null){
      System.out.print(pointer.getValue() + ", ");
      pointer = pointer.getNext();
    }
    System.out.println();
  }
}
