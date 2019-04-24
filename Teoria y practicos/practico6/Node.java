package practico6;
import java.io.Serializable;


/**
 *StrictlySortedSinglyLinkedList's nodes
 *@author
 */

public  class Node implements Serializable{

	public  static final long serialVersionUID = 1; 
	public Integer element;

	public Node next;

	public String toString() {
		return "[" + (element != null ? element.toString() : "null") + "]";
	}
}
