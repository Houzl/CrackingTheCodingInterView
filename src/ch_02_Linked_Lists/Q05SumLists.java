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
public class Q05SumLists {
  static SinglyLinkedListNode sumListsReverseOrder(SinglyLinkedListNode l1, SinglyLinkedListNode l2){
    String numL1 = "";
    while (l1 != null){
      numL1 = l1.getValue() + numL1;
      l1 = l1.getNext();
    }
    String numL2 = "";
    while (l2 != null){
      numL2 = l2.getValue() + numL2;
      l2 = l2.getNext();
    }
    String sum = Long.toString(Long.parseLong(numL1) +  Long.parseLong(numL2));
    SinglyLinkedListNode head = new SinglyLinkedListNode(null,0);
    SinglyLinkedListNode pointer = head;
    for(int i = sum.length() - 1; i >= 0 ; i--){
      SinglyLinkedListNode next = new SinglyLinkedListNode(null,Integer.parseInt(String.valueOf(sum.charAt(i))));
      pointer.setNext(next);
      pointer = next;
      
    }
    return head.getNext();
  }
  
  static SinglyLinkedListNode sumListsForwardOrder(SinglyLinkedListNode l1, SinglyLinkedListNode l2){
    String numL1 = "";
    while (l1 != null){
      numL1 += l1.getValue();
      l1 = l1.getNext();
    }
    String numL2 = "";
    while (l2 != null){
      numL2 += l2.getValue();
      l2 = l2.getNext();
    }
    String sum = Long.toString(Long.parseLong(numL1) +  Long.parseLong(numL2));
    SinglyLinkedListNode head = new SinglyLinkedListNode(null,0);
    SinglyLinkedListNode pointer = head;
    for(int i = 0; i < sum.length() ; i++){
      SinglyLinkedListNode next = new SinglyLinkedListNode(null,Integer.parseInt(String.valueOf(sum.charAt(i))));
      pointer.setNext(next);
      pointer = next;
      
    }
    return head.getNext();
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    SinglyLinkedListNode l1 = new SinglyLinkedListNode(null, 7);
    l1.setNext(new SinglyLinkedListNode(null, 1));
    l1.getNext().setNext(new SinglyLinkedListNode(null, 6));
    
    SinglyLinkedListNode l2 = new SinglyLinkedListNode(null, 5);
    l2.setNext(new SinglyLinkedListNode(null, 9));
    l2.getNext().setNext(new SinglyLinkedListNode(null, 2));
    
    SinglyLinkedList.printForward(l1);
    SinglyLinkedList.printForward(l2);
    SinglyLinkedList.printForward(sumListsReverseOrder(l1,l2));
    
    SinglyLinkedList.printForward(sumListsForwardOrder(l1,l2));

  }

}
