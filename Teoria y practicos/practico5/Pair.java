package practico5;
/**
 * Generic class representing ordered pairs, where the first component is of 
 * type T1 and the second component is of type T2.
 * 
 * @author Nazareno Aguirre & Carolina Dania
 * @version 0.1 8/7/2009
 * @param <T1> is the type of the first component of ordered pairs.
 * @param <T2> is the type of the second component of ordered pairs.
 */
public class Pair<T1,T2> {
	
	private T1 first; // first component of the ordered pair.
	private T2 second; // second component of the ordered pair.
	
	/**
	 * Constructor for ordered pairs. It creates an ordered pair, and 
         * initialises the first and second components with 'null'.
	 */
	public Pair() {
		this.first = null;
		this.second = null;
	}
	
	
	/**
	 * Constructor for ordered pairs. It creates an ordered pair, and 
         * initialises the first component with 'first' and the second component
         *  with 'second'. 
	 * @param first is the object used to initialise the first component of
         * the ordered pair.
	 * @param second is the object used to initialise the second component 
         * of the ordered pair.
	 */
	public Pair(T1 first, T2 second) {
		super();
		this.first = first;
		this.second = second;
	}
	
	
	/** 
	 * @return the element stored as the first component of the ordered 
         * pair.
	 */
	public T1 getFst() {
		return first;
	}
	
	
	/** sets the element corresponding to the first component of the 
         * ordered pair.
	 * @param first is the element used to set the first component of the 
         * ordered pair.
	 */
	public void setFst(T1 first) {
		this.first = first;
	}
	
	/** 
	 * @return the element stored as the second component of the ordered 
         * pair.
	 */
	public T2 getSnd() {
		return second;
	}
	
	/** sets the element corresponding to the second component of the 
         * ordered pair.
	 * @param second is the element used to set the second component of the 
         * ordered pair.
	 */
	public void setSnd(T2 second) {
		this.second = second;
	}
	
	/** returns a string representation of the state of the ordered pair. 
         * Notice that null
	 * is allowed as components of ordered pairs.
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String firstToString;
		String secondToString;
		if (first == null) {
			firstToString = "null";
		}
		else {
			firstToString = first.toString();
		}
		if (second == null) {
			secondToString = "null";
		}
		else {
			secondToString = second.toString();
		}
		return ("["+firstToString+","+secondToString+"]");
	}
	
	/** Compares the current object with another pair. Two pairs are equal 
         * iff their corresponding components are equal. Notice that components
         *  of ordered pairs can be null references.
	 * @see java.lang.Object#equals(Object obj)
	 */
	public boolean equals(Pair<T1,T2> other) {
		Pair<T1,T2> otherPair = (Pair<T1,T2>) other;
		if (first!=null && otherPair.getFst()!= null) {
			if (first.equals(otherPair.getFst())) {
				if (second!=null && otherPair.getSnd()!=null) {
					return (second.equals(otherPair.getSnd()));
				}
				else {
					return (second==null && otherPair.getSnd()==null);	
				}				
			}
			else {
				return false;
			}	
		}
		else {
			if (first==null && otherPair.getFst()==null) {
				if (second!=null && otherPair.getSnd()!=null) {
					return (second.equals(otherPair.getSnd()));
				}
				else {
					return (second==null && otherPair.getSnd()==null);	
				}
			}
			else {
				return false;
			}
		}
	}

         
        /**
         * Indicates whether the ordered pair is internally consistent.
         * Ordered pairs are always internally consistent.
         * @return true 
         */
        public boolean repOk() {
            return true;
        }
}
