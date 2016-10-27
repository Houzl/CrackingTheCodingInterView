package ch_02_Linked_Lists;

import utility.SinglyLinkedList;
import utility.SinglyLinkedListNode;
/**
 * @author houzl
 *
 */
public class Q01RemoveDupsSingly {
  
  static void removeDups(SinglyLinkedListNode head){
    SinglyLinkedListNode runner = head;
    while (runner != null){
      SinglyLinkedListNode dupsTrailer = runner;
      SinglyLinkedListNode dupsRunner = dupsTrailer.getNext();
      while (dupsRunner != null){
        //dupsTrailer move next
        if (dupsRunner.getValue() == runner.getValue()) dupsTrailer.setNext(dupsRunner.getNext());
        else dupsTrailer = dupsTrailer.getNext(); 
        //dupsRunner move next
        dupsRunner = dupsTrailer.getNext();
      }
      runner = runner.getNext();
    }
  }

  public static void main(String[] args) {
    SinglyLinkedListNode head = new SinglyLinkedListNode(null, 0);
    SinglyLinkedListNode pointer = head;
    for(int i = 0; i < 10; i ++){
      SinglyLinkedListNode next = new SinglyLinkedListNode(null, i%3);
      pointer.setNext(next);
      pointer = next;
    }
    SinglyLinkedList.printForward(head);
    removeDups(head);
    SinglyLinkedList.printForward(head);
  }
}
