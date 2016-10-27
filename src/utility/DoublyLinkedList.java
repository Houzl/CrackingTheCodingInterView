package utility;

public class DoublyLinkedList {
  public static void printForward(DoublyLinkedListNode head){
    DoublyLinkedListNode pointer = head;
    while (pointer != null){
      System.out.print(pointer.getValue() + ", ");
      pointer = pointer.getNext();
    }
    System.out.println();
  }
}
