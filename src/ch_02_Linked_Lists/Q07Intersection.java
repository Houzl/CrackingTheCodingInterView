/**
 * Only Singly linked lists could be intersecting.
 */
package ch_02_Linked_Lists;

import utility.SinglyLinkedList;
import utility.SinglyLinkedListNode;

/**
 * @author houzl
 *
 */
public class Q07Intersection {
  /**
   * @param l1
   * @param l2
   * @return
   */
  static boolean isIntersection(SinglyLinkedListNode l1, SinglyLinkedListNode l2){
    SinglyLinkedListNode outerRunner = l1;
    while (outerRunner != null){
      SinglyLinkedListNode innerRunner = l2;
      while (innerRunner != null){
        if (outerRunner.equals(innerRunner)) return true;
        innerRunner = innerRunner.getNext();
      }
      outerRunner = outerRunner.getNext();
    }
    return false;
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    SinglyLinkedListNode l = new SinglyLinkedListNode(null, 1);
    l.setNext(new SinglyLinkedListNode(null, 2));
    l.getNext().setNext(new SinglyLinkedListNode(null, 3));
    
    SinglyLinkedListNode l1 = new SinglyLinkedListNode(null, 0);
    l1.setNext(new SinglyLinkedListNode(null, 0));
    l1.getNext().setNext(l);
    
    
    SinglyLinkedListNode l2 = new SinglyLinkedListNode(null, 6);
    l2.setNext(new SinglyLinkedListNode(null, 6));
    l2.getNext().setNext(l);
    
    SinglyLinkedListNode l3 = new SinglyLinkedListNode(null, 6);
    l2.setNext(new SinglyLinkedListNode(null, 6));
    l2.getNext().setNext(l);
    
    SinglyLinkedList.printForward(l1);
    SinglyLinkedList.printForward(l2);
    System.out.println(isIntersection(l1,l2));
    System.out.println(isIntersection(l1,l));
    System.out.println(isIntersection(l1,l3));

  }

}
