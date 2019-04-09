package takehome1;

public class Entry {
	private Integer item;
	private Entry Next;

	public Entry(){
	}
	public Entry(Integer i){
		item = i;
	}
	public Entry getNext(){
		return Next;
	}
	
	public void setNext(Entry n){
		Next = n;
	}
	
	public Integer getInfo(){
		return item;
	}
	public void setInfo(Integer i){
		item = i;
	}

}
