package practico3;


import java.util.Collection;
import java.util.Iterator;

public class BoundedQueue {

	//elems almacena de los elementos de la cola.
	private Object [] elems;
	
	//size representa la cantidad de elementos en la cola.
	//representa además la posición donde los elementos serán insertados
	private int size;
	
	//representa la capacidad de la cola.
	private int MAX_SIZE = 50;
	
	
	public BoundedQueue() {
		elems = new Object [MAX_SIZE];
		size = 0;
	}
	
	public BoundedQueue(Collection<Object> s) {
		Iterator<Object> it = s.iterator();
		this.MAX_SIZE = s.size();
		this.elems = new Object[MAX_SIZE];
		this.size = 0;
		while (it.hasNext()){
			this.enqueue(it.next());
		}
	}
	
	public BoundedQueue(int c) {
		MAX_SIZE = c;
		elems = new Object [MAX_SIZE];
		size = 0;	}
	

	public int size() {
		return size;
	}



	public boolean isEmpty() {
		return size() == 0;
	}
	
	
	
	public boolean isFull() {
		return size() == MAX_SIZE;
	}
	
	//add agrega el elemento e al final de la cola, si la cola no esta vacía.
	public void enqueue(Object e) {
		if (!isFull()){
			elems[size] = e;
			size++;
		}
	}
	
	//retorna el elemento que se encuentra a la cabeza de la cola.
	//retorna null si la cola es vacía.
	public Object dequeue() throws IllegalArgumentException{
		if(isEmpty())
				throw new IllegalArgumentException("cola vacia");
		Object first = elems[0];
		for(int i=0; i<MAX_SIZE-1; i++){
			elems[i] = elems[i+1];
		}
		size--;
		return first;
	}
	
	public String toString(){
		String res="{";
		for(int i =0; i<elems.length;i++){
			if(i!=0) {
				res=res+",";
			}
			res=elems[i].toString();
		}
		res=res+"}";
		return res;
	}
}
