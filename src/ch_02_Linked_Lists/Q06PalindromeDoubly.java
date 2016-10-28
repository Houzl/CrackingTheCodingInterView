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
public class Q06PalindromeDoubly {
  static boolean isPalindrome(DoublyLinkedListNode head){
    DoublyLinkedListNode slow = head;
    DoublyLinkedListNode fast = head;
    while(fast != null && fast.getNext() != null ){
      slow = slow.getNext();
      fast = fast.getNext().getNext();
    }
    //Must move to previous. slow runner move to the next of middle.
    DoublyLinkedListNode goBack = slow.getPrevious();
    //When fast is not null, there are odd number of elements. should skip one.
    if (fast != null) slow = slow.getNext();
   
    while(slow != null){
      if (slow.getValue() != goBack.getValue()) return false;
      slow = slow.getNext();
      goBack = goBack.getPrevious();
    }
    return true;
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
    {
      DoublyLinkedListNode next = new DoublyLinkedListNode(null, null, 0);
      pointer.setNext(next);
      next.setPrevious(pointer);
      pointer = next;
    }
    for(int i = 1; i < 12; i ++){
      DoublyLinkedListNode next = new DoublyLinkedListNode(null, null, i);
      pointer.setNext(next);
      next.setPrevious(pointer);
      pointer = next;
    }
    DoublyLinkedList.printForward(head);
    System.out.println(isPalindrome(head));

  }

}
