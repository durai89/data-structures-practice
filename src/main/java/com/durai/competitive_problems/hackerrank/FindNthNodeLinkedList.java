import java.util.*;

class Program {
  public static void removeKthNodeFromEnd(LinkedList head, int k) {
  	LinkedList fastPointer = head;
	LinkedList slowPointer = head;
	int count = 1; 
	while (count <= k) {
	  fastPointer = fastPointer.next;
	  count++;
	}
	if(fastPointer == null) {
	  head.value = head.next.value;
	  head.next = head.next.next;
	  return;
	}
	while(fastPointer.next != null) {
	  slowPointer = slowPointer.next;
	  fastPointer = fastPointer.next;
	}
	slowPointer.next =  slowPointer.next.next;
  }

  static class LinkedList {
    int value;
    LinkedList next = null;

    public LinkedList(int value) {
      this.value = value;
    }
  }
}
