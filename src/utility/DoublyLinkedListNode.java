package utility;

public class DoublyLinkedListNode {
  private DoublyLinkedListNode previous;
  private DoublyLinkedListNode next;
  private int value;
  
  public DoublyLinkedListNode(DoublyLinkedListNode previous, DoublyLinkedListNode next, int value){
    this.previous = previous;
    this.next = next;
    this.value = value;
  }

  public DoublyLinkedListNode getNext() {
    return next;
  }

  public void setNext(DoublyLinkedListNode next) {
    this.next = next;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public DoublyLinkedListNode getPrevious() {
    return previous;
  }

  public void setPrevious(DoublyLinkedListNode previous) {
    this.previous = previous;
  }
}
