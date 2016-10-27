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
public class Q02ReturnKthToLast {
  
  static int returnKthToLast(SinglyLinkedListNode head, int k) throws Exception{
    SinglyLinkedListNode slow = head;
    SinglyLinkedListNode fast = head;
    int skipCount = 0;
    while (fast != null && skipCount < k){
      fast = fast.getNext();
      skipCount++;
    }
    if (skipCount != k) throw new Exception("only have " + skipCount + " elements in your linkedlist.");
    while (fast != null){
      fast = fast.getNext();
      slow = slow.getNext();
    }
    return slow.getValue();
  }

  /**
   * @param args
   * @throws Exception 
   */
  public static void main(String[] args) throws Exception {
    SinglyLinkedListNode head = new SinglyLinkedListNode(null, 11);
    SinglyLinkedListNode pointer = head;
    for(int i = 10; i > 0; i--){
      SinglyLinkedListNode next = new SinglyLinkedListNode(null, i);
      pointer.setNext(next);
      pointer = next;
    }
    SinglyLinkedList.printForward(head);
    System.out.println(returnKthToLast(head,12));
  }
}
