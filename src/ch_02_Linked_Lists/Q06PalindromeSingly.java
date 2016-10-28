/**
 * 
 */
package ch_02_Linked_Lists;

import java.util.Stack;

import utility.SinglyLinkedListNode;

/**
 * @author houzl
 *
 */
public class Q06PalindromeSingly {
  static boolean isPalindrome(SinglyLinkedListNode head){
    Stack<SinglyLinkedListNode> stack = new Stack<SinglyLinkedListNode>();
    SinglyLinkedListNode slow = head;
    SinglyLinkedListNode fast = head;
    while(fast != null && fast.getNext() != null ){
      stack.push(slow);
      slow = slow.getNext();
      fast = fast.getNext().getNext();
    }
    //When fast is not null, there are odd number of elements. should skip one.
    if (fast != null) slow = slow.getNext();
    while(slow != null){
      if (slow.getValue() != stack.pop().getValue()) return false;
      slow = slow.getNext();
    }
    return true;
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    SinglyLinkedListNode l1 = new SinglyLinkedListNode(null, 6);
    l1.setNext(new SinglyLinkedListNode(null, 6));
    l1.getNext().setNext(new SinglyLinkedListNode(null, 6));
    System.out.println(isPalindrome(l1));

  }

}
