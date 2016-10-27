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
public class Q03DeleteMiddleNode {
  /**
   * Just replace the fileds by it's next's
   * @param node
   * @return
   */
  
  static boolean deleteMiddleNode(SinglyLinkedListNode node){
    //if it is the last one.
    if (node.getNext() == null) return false;
    node.setValue(node.getNext().getValue());
    node.setNext(node.getNext().getNext());
    return true;
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    SinglyLinkedListNode head = new SinglyLinkedListNode(null, 11);
    SinglyLinkedListNode pointer = head;
    SinglyLinkedListNode node = head;
    for(int i = 10; i > 0; i--){
      if (i == 5) node = pointer;
      SinglyLinkedListNode next = new SinglyLinkedListNode(null, i);
      pointer.setNext(next);
      pointer = next;
    }
    SinglyLinkedList.printForward(head);
    System.out.println(node.getValue());
    deleteMiddleNode(node);
    SinglyLinkedList.printForward(head);
    

  }

}
