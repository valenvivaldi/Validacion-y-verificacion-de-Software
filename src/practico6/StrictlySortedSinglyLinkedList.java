package practico6;

import java.util.Set;
import java.io.Serializable;
import java.util.HashSet;

import korat.finitization.IClassDomain;
import korat.finitization.IFinitization;
import korat.finitization.IIntSet;
import korat.finitization.IObjSet;
import korat.finitization.impl.FinitizationFactory;

/**
 * Class  StrictlySortedSinglyLinkedList defines Strictly Sorted, Singly linked List 
 * @author 
 */
public class StrictlySortedSinglyLinkedList implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Node header;
    public int size = 0;
   
    public StrictlySortedSinglyLinkedList(){
    	header = new Node(); //dummy
    	size = 0;
   }	

    /**
     * This method checks whether a given Integer value belongs to the current list.
     * @param value The element whose presence in this list is to be tested.
     * @return true iff value is in the current list.
     */
    public boolean contains(Integer value){
    	Node current = header.next;	
    	while(current!=null && current.element.intValue()<= value.intValue()){
    			if(current.element.intValue()==value.intValue())
    				return  true;
    			current = current.next;
       	} 
    	return false;
    	
    }

  public boolean add(Integer value){
	Node current = header.next;	
	Node previous = header;
	if(value ==null)
		throw new IllegalArgumentException();
	
    while(current!=null && current.element.intValue()< value.intValue()){
		previous = current;		
		current = current.next;
    }
	Node n = new Node();
	n.element =  value;
	if (current==null){
		previous.next = n;
		size++;
		return true;
	} 
	if(current.element.intValue()==value.intValue())
    		return  false;

	if(current.element.intValue()>value.intValue()){
		previous.next = n;
		n.next = current;
		size++;
  		return  true;
    	}
	return true;
    		
    }

     public Integer get(int index){
    	Node current = header.next;
    	int i = 0;
    	while(current!=null && i< index){
    		current = current .next;
    		i++;
    	}
    	if(current!=null){
    		return current.element;
       	}
    	return null;
    } 

    
    public int getSize(){
    	return size;
    }    
 

    /**
 	 * Checks whether or not the current list has not elements.
     * @return true iff the current list is empty, false otherwise.
     */
    
    public boolean isEmpty(){
    	return header.next== null;
    }

    public String toString() {
        String res = "{";
        if (header != null) {
            Node cur = header.next;
            while (cur != null && cur != header) {
                res += cur.toString();
                cur = cur.next;
            }
        }
        return res + "}";
    }
    
    @Override
    public Object clone() {
    	
    	StrictlySortedSinglyLinkedList s =new StrictlySortedSinglyLinkedList();
    	for(int i=0;i<this.size;i++)
    		s.add(this.get(i));
    	
    	
    	return s;    
    }
    
    /**  
     * @return true si y sólo si la representación de la lista es internamente 
     * consistente y esta estrictamente ordenada
     * @pre. true
     * @post. retorna true si y sólo si la representación de la lista es internamente
	 * consistente. En este caso, la estructura es internamente consistente si y
	 * sólo si size es exactamente igual al número de nodos en la lista enlazada -1,
	 * la estructura es aciclica y estrictamente ordenada*/	
    public boolean repOK() {
    	//HACER
        return true;
    }
    
    
    public static IFinitization finStrictlySortedSinglyLinkedList(int minSize, int maxSize,
            int numEntries, int numElems) {
        IFinitization f = FinitizationFactory.create(StrictlySortedSinglyLinkedList.class);
        IObjSet nodes= f.createObjSet(Node.class, numEntries, true);
        //HACER
        return f;

    }
 
}//End Class
