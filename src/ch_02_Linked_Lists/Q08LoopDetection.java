/**
 * Only Singly Linked lists could be loop
 */
package ch_02_Linked_Lists;

import utility.SinglyLinkedListNode;

/**
 * @author houzl
 *
 */
public class Q08LoopDetection {
  static SinglyLinkedListNode isLoop(SinglyLinkedListNode head){
    SinglyLinkedListNode slow = head;
    SinglyLinkedListNode fast = head;
    while (!slow.equals(fast) && fast != null && fast.getNext() != null){
      slow = slow.getNext();
      fast = fast.getNext().getNext();
    }
    //if fast is null, it's not a loop
    if (fast == null || fast.getNext() == null) return null;
    slow = head;
    while (!slow.equals(fast)){
      slow = slow.getNext();
      fast = fast.getNext();
    }
    return slow;
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    SinglyLinkedListNode l1 = new SinglyLinkedListNode(null, 9);
    SinglyLinkedListNode l2 = new SinglyLinkedListNode(l1, 10);
    l1.setNext(l2);
    
    SinglyLinkedListNode l = new SinglyLinkedListNode(null, 1);
    l.setNext(new SinglyLinkedListNode(null, 2));
    l.getNext().setNext(l2);

    System.out.println(l2);
    System.out.println(isLoop(l2));
    
  }

}
