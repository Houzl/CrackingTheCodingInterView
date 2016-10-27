package ch_02_Linked_Lists;

import utility.DoublyLinkedList;
import utility.DoublyLinkedListNode;
/**
 * @author houzl
 *
 */
public class Q01RemoveDupsDoubly {
  
  static void removeDups(DoublyLinkedListNode head){
    DoublyLinkedListNode runner = head;
    while (runner != null){
      DoublyLinkedListNode dupsRunner = runner.getNext();
      while (dupsRunner != null){
        DoublyLinkedListNode previous = dupsRunner.getPrevious();
        DoublyLinkedListNode next = dupsRunner.getNext();
        if (dupsRunner.getValue() == runner.getValue()) {
          previous.setNext(next);
          //Must check if next is null.
          if (next != null) next.setPrevious(previous);
          dupsRunner.setPrevious(null);
          dupsRunner.setNext(null);
        }
        //Move dupsRunner to next element.
        dupsRunner = next;
      }
      runner = runner.getNext();
    }
  }

  public static void main(String[] args) {
    DoublyLinkedListNode head = new DoublyLinkedListNode(null, null, 0);
    DoublyLinkedListNode pointer = head;
    for(int i = 0; i < 10; i ++){
      DoublyLinkedListNode next = new DoublyLinkedListNode(null, null, i%3);
      pointer.setNext(next);
      next.setPrevious(pointer);
      pointer = next;
    }
    DoublyLinkedList.printForward(head);
    removeDups(head);
    DoublyLinkedList.printForward(head);
  }
}
