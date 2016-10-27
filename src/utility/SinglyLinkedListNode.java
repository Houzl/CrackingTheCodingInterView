package utility;

public class SinglyLinkedListNode {
  private SinglyLinkedListNode next;
  private int value;
  
  public SinglyLinkedListNode(SinglyLinkedListNode next, int value){
    this.next = next;
    this.value = value;
  }

  public SinglyLinkedListNode getNext() {
    return next;
  }

  public void setNext(SinglyLinkedListNode next) {
    this.next = next;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }
}
