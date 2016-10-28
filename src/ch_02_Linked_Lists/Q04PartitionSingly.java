/**
 * 
 */
package ch_02_Linked_Lists;

import utility.SinglyLinkedList;
import utility.SinglyLinkedListNode;

/**
 * @author houzl
 *
 */
public class Q04PartitionSingly {
  static SinglyLinkedListNode partition(SinglyLinkedListNode head, int x){
    SinglyLinkedListNode smallHead = new SinglyLinkedListNode(null, 0);
    SinglyLinkedListNode smallPointer = smallHead;
    SinglyLinkedListNode bigHead = new SinglyLinkedListNode(null, 0);
    SinglyLinkedListNode bigPointer = bigHead;
    
    while (head != null){
      if (head.getValue() < x) {
        smallPointer.setNext(head);
        smallPointer = smallPointer.getNext();
      }
      else{
        bigPointer.setNext(head);
        bigPointer = bigPointer.getNext();
      }
      head = head.getNext();
    }
    
    smallPointer.setNext(bigHead.getNext());
    bigPointer.setNext(null);
    head = smallHead.getNext();
    return head;
  }
  /**
   * @param args
   */
  public static void main(String[] args) {
    SinglyLinkedListNode head = new SinglyLinkedListNode(null, 11);
    SinglyLinkedListNode pointer = head;
    for(int i = 10; i > 0; i--){
      SinglyLinkedListNode next = new SinglyLinkedListNode(null, i);
      pointer.setNext(next);
      pointer = next;
    }
    SinglyLinkedList.printForward(head);
    head = partition(head,5);
    SinglyLinkedList.printForward(head);

  }

}
