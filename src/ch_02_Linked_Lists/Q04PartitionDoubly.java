/**
 * 
 */
package ch_02_Linked_Lists;

import utility.DoublyLinkedList;
import utility.DoublyLinkedListNode;

/**
 * @author houzl
 *
 */
public class Q04PartitionDoubly {
  static DoublyLinkedListNode partition(DoublyLinkedListNode head, int x){
    DoublyLinkedListNode smallHead = new DoublyLinkedListNode(null, null, 0);
    DoublyLinkedListNode smallPointer = smallHead;
    DoublyLinkedListNode bigHead = new DoublyLinkedListNode(null, null, 0);
    DoublyLinkedListNode bigPointer = bigHead;
    
    while (head != null){
      if (head.getValue() < x) {
        smallPointer.setNext(head);
        head.setPrevious(smallPointer);
        smallPointer = smallPointer.getNext();
      }
      else{
        bigPointer.setNext(head);
        head.setPrevious(bigPointer);
        bigPointer = bigPointer.getNext();
      }
      head = head.getNext();
    }
    
    smallPointer.setNext(bigHead.getNext());
    //invoke setPrevious, bigHead.getNext() must be not null
    if (bigHead.getNext() != null) bigHead.getNext().setPrevious(smallPointer);
    bigPointer.setNext(null);
    head = smallHead.getNext();
    head.setPrevious(null);
    return head;
  }
  /**
   * @param args
   */
  public static void main(String[] args) {
    DoublyLinkedListNode head = new DoublyLinkedListNode(null, null, 11);
    DoublyLinkedListNode pointer = head;
    for(int i = 10; i > 0; i --){
      DoublyLinkedListNode next = new DoublyLinkedListNode(null, null, i);
      pointer.setNext(next);
      next.setPrevious(pointer);
      pointer = next;
    }
    DoublyLinkedList.printForward(head);
    head = partition(head,5);
    DoublyLinkedList.printForward(head);

  }

}
